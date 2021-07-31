package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPolicyResponse extends StObject {
  
  /**
    * The details of the AWS Firewall Manager policy.
    */
  var Policy: js.UndefOr[typings.awsSdk.fmsMod.Policy] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.undefined
}
object PutPolicyResponse {
  
  @scala.inline
  def apply(): PutPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPolicyResponse]
  }
  
  @scala.inline
  implicit class PutPolicyResponseMutableBuilder[Self <: PutPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArn(value: ResourceArn): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
