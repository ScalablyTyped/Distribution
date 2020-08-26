package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateActionTargetResponse extends js.Object {
  /**
    * The ARN for the custom action target.
    */
  var ActionTargetArn: NonEmptyString = js.native
}

object CreateActionTargetResponse {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString): CreateActionTargetResponse = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActionTargetResponse]
  }
  @scala.inline
  implicit class CreateActionTargetResponseOps[Self <: CreateActionTargetResponse] (val x: Self) extends AnyVal {
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
    def setActionTargetArn(value: NonEmptyString): Self = this.set("ActionTargetArn", value.asInstanceOf[js.Any])
  }
  
}

