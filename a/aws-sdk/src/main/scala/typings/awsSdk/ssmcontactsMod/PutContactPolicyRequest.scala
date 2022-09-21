package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutContactPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact or escalation plan.
    */
  var ContactArn: SsmContactsArn
  
  /**
    * Details of the resource policy.
    */
  var Policy: typings.awsSdk.ssmcontactsMod.Policy
}
object PutContactPolicyRequest {
  
  inline def apply(ContactArn: SsmContactsArn, Policy: Policy): PutContactPolicyRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutContactPolicyRequest]
  }
  
  extension [Self <: PutContactPolicyRequest](x: Self) {
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
