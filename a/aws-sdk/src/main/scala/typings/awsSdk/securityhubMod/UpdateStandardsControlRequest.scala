package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStandardsControlRequest extends js.Object {
  /**
    * The updated status of the compliance standard control.
    */
  var ControlStatus: js.UndefOr[typings.awsSdk.securityhubMod.ControlStatus] = js.native
  /**
    * A description of the reason why you are disabling a compliance standard control.
    */
  var DisabledReason: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ARN of the compliance standard control to enable or disable.
    */
  var StandardsControlArn: NonEmptyString = js.native
}

object UpdateStandardsControlRequest {
  @scala.inline
  def apply(
    StandardsControlArn: NonEmptyString,
    ControlStatus: ControlStatus = null,
    DisabledReason: NonEmptyString = null
  ): UpdateStandardsControlRequest = {
    val __obj = js.Dynamic.literal(StandardsControlArn = StandardsControlArn.asInstanceOf[js.Any])
    if (ControlStatus != null) __obj.updateDynamic("ControlStatus")(ControlStatus.asInstanceOf[js.Any])
    if (DisabledReason != null) __obj.updateDynamic("DisabledReason")(DisabledReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStandardsControlRequest]
  }
}

