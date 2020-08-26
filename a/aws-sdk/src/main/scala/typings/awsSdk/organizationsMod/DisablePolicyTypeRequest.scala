package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisablePolicyTypeRequest extends js.Object {
  /**
    * The policy type that you want to disable in this root. You can specify one of the following values:    AISERVICES_OPT_OUT_POLICY     BACKUP_POLICY     SERVICE_CONTROL_POLICY     TAG_POLICY   
    */
  var PolicyType: typings.awsSdk.organizationsMod.PolicyType = js.native
  /**
    * The unique identifier (ID) of the root in which you want to disable a policy type. You can get the ID from the ListRoots operation. The regex pattern for a root ID string requires "r-" followed by from 4 to 32 lowercase letters or digits.
    */
  var RootId: typings.awsSdk.organizationsMod.RootId = js.native
}

object DisablePolicyTypeRequest {
  @scala.inline
  def apply(PolicyType: PolicyType, RootId: RootId): DisablePolicyTypeRequest = {
    val __obj = js.Dynamic.literal(PolicyType = PolicyType.asInstanceOf[js.Any], RootId = RootId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisablePolicyTypeRequest]
  }
  @scala.inline
  implicit class DisablePolicyTypeRequestOps[Self <: DisablePolicyTypeRequest] (val x: Self) extends AnyVal {
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
    def setPolicyType(value: PolicyType): Self = this.set("PolicyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootId(value: RootId): Self = this.set("RootId", value.asInstanceOf[js.Any])
  }
  
}

