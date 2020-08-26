package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptFailedResult extends js.Object {
  /**
    * Type guard for differentiating user cancelled sign in errors from other errors
    */
  var canceled: Boolean = js.native
}

object PromptFailedResult {
  @scala.inline
  def apply(canceled: Boolean): PromptFailedResult = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptFailedResult]
  }
  @scala.inline
  implicit class PromptFailedResultOps[Self <: PromptFailedResult] (val x: Self) extends AnyVal {
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
    def setCanceled(value: Boolean): Self = this.set("canceled", value.asInstanceOf[js.Any])
  }
  
}

