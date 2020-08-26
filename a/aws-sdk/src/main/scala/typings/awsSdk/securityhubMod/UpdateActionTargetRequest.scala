package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateActionTargetRequest extends js.Object {
  /**
    * The ARN of the custom action target to update.
    */
  var ActionTargetArn: NonEmptyString = js.native
  /**
    * The updated description for the custom action target.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The updated name of the custom action target.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
}

object UpdateActionTargetRequest {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString): UpdateActionTargetRequest = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateActionTargetRequest]
  }
  @scala.inline
  implicit class UpdateActionTargetRequestOps[Self <: UpdateActionTargetRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

