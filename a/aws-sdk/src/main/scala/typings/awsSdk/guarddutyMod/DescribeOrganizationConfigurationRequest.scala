package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConfigurationRequest extends js.Object {
  /**
    * The ID of the detector to retrieve information about the delegated administrator from.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object DescribeOrganizationConfigurationRequest {
  @scala.inline
  def apply(DetectorId: DetectorId): DescribeOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigurationRequest]
  }
}

