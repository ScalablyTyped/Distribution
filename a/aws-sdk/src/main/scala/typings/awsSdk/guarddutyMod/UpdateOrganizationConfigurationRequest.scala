package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOrganizationConfigurationRequest extends js.Object {
  /**
    * Indicates whether to automatically enable member accounts in the organization.
    */
  var AutoEnable: Boolean = js.native
  /**
    * The ID of the detector to update the delegated administrator for.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object UpdateOrganizationConfigurationRequest {
  @scala.inline
  def apply(AutoEnable: Boolean, DetectorId: DetectorId): UpdateOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
  }
}

