package typings.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobPromise extends js.Object {
  /**
    * Abort this job
    */
  def cancel(): Unit = js.native
}

object JobPromise {
  @scala.inline
  def apply(cancel: () => Unit): JobPromise = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[JobPromise]
  }
  @scala.inline
  implicit class JobPromiseOps[Self <: JobPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
  }
  
}

