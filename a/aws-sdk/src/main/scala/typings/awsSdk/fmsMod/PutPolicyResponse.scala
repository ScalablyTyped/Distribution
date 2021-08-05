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
  
  inline def apply(): PutPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPolicyResponse]
  }
  
  extension [Self <: PutPolicyResponse](x: Self) {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyArn(value: ResourceArn): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
