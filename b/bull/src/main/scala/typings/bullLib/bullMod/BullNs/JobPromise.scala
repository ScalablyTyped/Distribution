package typings
package bullLib.bullMod.BullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPromise extends js.Object {
  /**
    * Abort this job
    */
  def cancel(): scala.Unit
}

object JobPromise {
  @scala.inline
  def apply(cancel: () => scala.Unit): JobPromise = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
  
    __obj.asInstanceOf[JobPromise]
  }
}

