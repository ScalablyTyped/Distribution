package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPolicyVersionsRequest extends StObject {
  
  /**
    * The policy name.
    */
  var policyName: PolicyName
}
object ListPolicyVersionsRequest {
  
  @scala.inline
  def apply(policyName: PolicyName): ListPolicyVersionsRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPolicyVersionsRequest]
  }
  
  @scala.inline
  implicit class ListPolicyVersionsRequestMutableBuilder[Self <: ListPolicyVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
  }
}
