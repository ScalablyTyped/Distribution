package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPolicyResponse extends StObject {
  
  /**
    * Information about the specified AWS Firewall Manager policy.
    */
  var Policy: js.UndefOr[typings.awsSdk.fmsMod.Policy] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the specified policy.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.undefined
}
object GetPolicyResponse {
  
  @scala.inline
  def apply(): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyResponse]
  }
  
  @scala.inline
  implicit class GetPolicyResponseMutableBuilder[Self <: GetPolicyResponse] (val x: Self) extends AnyVal {
    
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
