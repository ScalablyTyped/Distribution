package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccessPolicyResponse extends StObject {
  
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
  implicit class CreateAccessPolicyResponseMutableBuilder[Self <: CreateAccessPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicyArn(value: ARN): Self = StObject.set(x, "accessPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyId(value: ID): Self = StObject.set(x, "accessPolicyId", value.asInstanceOf[js.Any])
  }
}
