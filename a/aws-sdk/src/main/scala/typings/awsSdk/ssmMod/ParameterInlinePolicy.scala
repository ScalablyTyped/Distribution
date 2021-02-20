package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterInlinePolicy extends StObject {
  
  /**
    * The status of the policy. Policies report the following statuses: Pending (the policy has not been enforced or applied yet), Finished (the policy was applied), Failed (the policy was not applied), or InProgress (the policy is being applied now). 
    */
  var PolicyStatus: js.UndefOr[String] = js.native
  
  /**
    * The JSON text of the policy.
    */
  var PolicyText: js.UndefOr[String] = js.native
  
  /**
    * The type of policy. Parameter Store supports the following policy types: Expiration, ExpirationNotification, and NoChangeNotification. 
    */
  var PolicyType: js.UndefOr[String] = js.native
}
object ParameterInlinePolicy {
  
  @scala.inline
  def apply(): ParameterInlinePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterInlinePolicy]
  }
  
  @scala.inline
  implicit class ParameterInlinePolicyMutableBuilder[Self <: ParameterInlinePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyStatus(value: String): Self = StObject.set(x, "PolicyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyStatusUndefined: Self = StObject.set(x, "PolicyStatus", js.undefined)
    
    @scala.inline
    def setPolicyText(value: String): Self = StObject.set(x, "PolicyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTextUndefined: Self = StObject.set(x, "PolicyText", js.undefined)
    
    @scala.inline
    def setPolicyType(value: String): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
  }
}
