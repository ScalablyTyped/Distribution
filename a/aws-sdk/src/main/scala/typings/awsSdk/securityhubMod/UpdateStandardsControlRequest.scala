package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStandardsControlRequest extends js.Object {
  /**
    * The updated status of the security standard control.
    */
  var ControlStatus: js.UndefOr[typings.awsSdk.securityhubMod.ControlStatus] = js.native
  /**
    * A description of the reason why you are disabling a security standard control. If you are disabling a control, then this is required.
    */
  var DisabledReason: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ARN of the security standard control to enable or disable.
    */
  var StandardsControlArn: NonEmptyString = js.native
}

object UpdateStandardsControlRequest {
  @scala.inline
  def apply(StandardsControlArn: NonEmptyString): UpdateStandardsControlRequest = {
    val __obj = js.Dynamic.literal(StandardsControlArn = StandardsControlArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStandardsControlRequest]
  }
  @scala.inline
  implicit class UpdateStandardsControlRequestOps[Self <: UpdateStandardsControlRequest] (val x: Self) extends AnyVal {
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
    def setStandardsControlArn(value: NonEmptyString): Self = this.set("StandardsControlArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlStatus(value: ControlStatus): Self = this.set("ControlStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlStatus: Self = this.set("ControlStatus", js.undefined)
    @scala.inline
    def setDisabledReason(value: NonEmptyString): Self = this.set("DisabledReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledReason: Self = this.set("DisabledReason", js.undefined)
  }
  
}

