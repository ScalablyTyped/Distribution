package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterInlinePolicy extends StObject {
  
  /**
    * The status of the policy. Policies report the following statuses: Pending (the policy has not been enforced or applied yet), Finished (the policy was applied), Failed (the policy was not applied), or InProgress (the policy is being applied now). 
    */
  var PolicyStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The JSON text of the policy.
    */
  var PolicyText: js.UndefOr[String] = js.undefined
  
  /**
    * The type of policy. Parameter Store supports the following policy types: Expiration, ExpirationNotification, and NoChangeNotification. 
    */
  var PolicyType: js.UndefOr[String] = js.undefined
}
object ParameterInlinePolicy {
  
  inline def apply(): ParameterInlinePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterInlinePolicy]
  }
  
  extension [Self <: ParameterInlinePolicy](x: Self) {
    
    inline def setPolicyStatus(value: String): Self = StObject.set(x, "PolicyStatus", value.asInstanceOf[js.Any])
    
    inline def setPolicyStatusUndefined: Self = StObject.set(x, "PolicyStatus", js.undefined)
    
    inline def setPolicyText(value: String): Self = StObject.set(x, "PolicyText", value.asInstanceOf[js.Any])
    
    inline def setPolicyTextUndefined: Self = StObject.set(x, "PolicyText", js.undefined)
    
    inline def setPolicyType(value: String): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
  }
}
