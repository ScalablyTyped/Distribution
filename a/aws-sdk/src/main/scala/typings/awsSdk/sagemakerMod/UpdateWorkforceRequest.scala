package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkforceRequest extends js.Object {
  /**
    * A list of one to four worker IP address ranges (CIDRs) that can be used to access tasks assigned to this workforce. Maximum: Four CIDR values
    */
  var SourceIpConfig: js.UndefOr[typings.awsSdk.sagemakerMod.SourceIpConfig] = js.native
  /**
    * The name of the private workforce whose access you want to restrict. WorkforceName is automatically set to default when a workforce is created and cannot be modified. 
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName = js.native
}

object UpdateWorkforceRequest {
  @scala.inline
  def apply(WorkforceName: WorkforceName, SourceIpConfig: SourceIpConfig = null): UpdateWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    if (SourceIpConfig != null) __obj.updateDynamic("SourceIpConfig")(SourceIpConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkforceRequest]
  }
}

