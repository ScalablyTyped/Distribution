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
  def apply(cancel: js.Function0[scala.Unit]): JobPromise = {
    val __obj = js.Dynamic.literal(cancel = cancel)
  
    __obj.asInstanceOf[JobPromise]
  }
}

