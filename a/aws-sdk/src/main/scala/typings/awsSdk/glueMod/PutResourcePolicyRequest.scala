package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResourcePolicyRequest extends js.Object {
  
  /**
    * Allows you to specify if you want to use both resource-level and account/catalog-level resource policies. A resource-level policy is a policy attached to an individual resource such as a database or a table. The default value of NO indicates that resource-level policies cannot co-exist with an account-level policy. A value of YES means the use of both resource-level and account/catalog-level resource policies is allowed.
    */
  var EnableHybrid: js.UndefOr[EnableHybridValues] = js.native
  
  /**
    * A value of MUST_EXIST is used to update a policy. A value of NOT_EXIST is used to create a new policy. If a value of NONE or a null value is used, the call will not depend on the existence of a policy.
    */
  var PolicyExistsCondition: js.UndefOr[ExistCondition] = js.native
  
  /**
    * The hash value returned when the previous policy was set using PutResourcePolicy. Its purpose is to prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
    */
  var PolicyHashCondition: js.UndefOr[HashString] = js.native
  
  /**
    * Contains the policy document to set, in JSON format.
    */
  var PolicyInJson: PolicyJsonString = js.native
  
  /**
    * The ARN of the AWS Glue resource for the resource policy to be set. For more information about AWS Glue resource ARNs, see the AWS Glue ARN string pattern 
    */
  var ResourceArn: js.UndefOr[GlueResourceArn] = js.native
}
object PutResourcePolicyRequest {
  
  @scala.inline
  def apply(PolicyInJson: PolicyJsonString): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyInJson = PolicyInJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  @scala.inline
  implicit class PutResourcePolicyRequestOps[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setPolicyInJson(value: PolicyJsonString): Self = this.set("PolicyInJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHybrid(value: EnableHybridValues): Self = this.set("EnableHybrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableHybrid: Self = this.set("EnableHybrid", js.undefined)
    
    @scala.inline
    def setPolicyExistsCondition(value: ExistCondition): Self = this.set("PolicyExistsCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyExistsCondition: Self = this.set("PolicyExistsCondition", js.undefined)
    
    @scala.inline
    def setPolicyHashCondition(value: HashString): Self = this.set("PolicyHashCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyHashCondition: Self = this.set("PolicyHashCondition", js.undefined)
    
    @scala.inline
    def setResourceArn(value: GlueResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
  }
}
