package typings.bull.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPromise extends js.Object {
  /**
    * Abort this job
    */
  def cancel(): Unit
}

object JobPromise {
  @scala.inline
  def apply(cancel: () => Unit): JobPromise = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
  
    __obj.asInstanceOf[JobPromise]
  }
}

