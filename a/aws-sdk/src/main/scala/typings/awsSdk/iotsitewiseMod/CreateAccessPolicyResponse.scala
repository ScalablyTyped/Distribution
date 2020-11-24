package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccessPolicyResponse extends js.Object {
  
  /**
    * The ARN of the access policy, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId} 
    */
  var accessPolicyArn: ARN = js.native
  
  /**
    * The ID of the access policy.
    */
  var accessPolicyId: ID = js.native
}
object CreateAccessPolicyResponse {
  
  @scala.inline
  def apply(accessPolicyArn: ARN, accessPolicyId: ID): CreateAccessPolicyResponse = {
    val __obj = js.Dynamic.literal(accessPolicyArn = accessPolicyArn.asInstanceOf[js.Any], accessPolicyId = accessPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPolicyResponse]
  }
  
  @scala.inline
  implicit class CreateAccessPolicyResponseOps[Self <: CreateAccessPolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setAccessPolicyArn(value: ARN): Self = this.set("accessPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyId(value: ID): Self = this.set("accessPolicyId", value.asInstanceOf[js.Any])
  }
}
