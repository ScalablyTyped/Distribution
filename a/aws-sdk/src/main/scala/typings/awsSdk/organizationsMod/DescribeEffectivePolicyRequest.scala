package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEffectivePolicyRequest extends js.Object {
  
  /**
    * The type of policy that you want information about. You can specify one of the following values:    AISERVICES_OPT_OUT_POLICY     BACKUP_POLICY     TAG_POLICY   
    */
  var PolicyType: EffectivePolicyType = js.native
  
  /**
    * When you're signed in as the management account, specify the ID of the account that you want details about. Specifying an organization root or organizational unit (OU) as the target is not supported.
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.native
}
object DescribeEffectivePolicyRequest {
  
  @scala.inline
  def apply(PolicyType: EffectivePolicyType): DescribeEffectivePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyType = PolicyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEffectivePolicyRequest]
  }
  
  @scala.inline
  implicit class DescribeEffectivePolicyRequestOps[Self <: DescribeEffectivePolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setPolicyType(value: EffectivePolicyType): Self = this.set("PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: PolicyTargetId): Self = this.set("TargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("TargetId", js.undefined)
  }
}
