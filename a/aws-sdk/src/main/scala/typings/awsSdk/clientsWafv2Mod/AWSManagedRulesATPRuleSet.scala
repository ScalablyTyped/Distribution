package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AWSManagedRulesATPRuleSet extends StObject {
  
  /**
    * The path of the login endpoint for your application. For example, for the URL https://example.com/web/login, you would provide the path /web/login. The rule group inspects only HTTP POST requests to your specified login endpoint.
    */
  var LoginPath: String
  
  /**
    * The criteria for inspecting login requests, used by the ATP rule group to validate credentials usage. 
    */
  var RequestInspection: js.UndefOr[typings.awsSdk.clientsWafv2Mod.RequestInspection] = js.undefined
  
  /**
    * The criteria for inspecting responses to login requests, used by the ATP rule group to track login failure rates.  The ATP rule group evaluates the responses that your protected resources send back to client login attempts, keeping count of successful and failed attempts from each IP address and client session. Using this information, the rule group labels and mitigates requests from client sessions and IP addresses that submit too many failed login attempts in a short amount of time.   Response inspection is available only in web ACLs that protect Amazon CloudFront distributions. 
    */
  var ResponseInspection: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ResponseInspection] = js.undefined
}
object AWSManagedRulesATPRuleSet {
  
  inline def apply(LoginPath: String): AWSManagedRulesATPRuleSet = {
    val __obj = js.Dynamic.literal(LoginPath = LoginPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWSManagedRulesATPRuleSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AWSManagedRulesATPRuleSet] (val x: Self) extends AnyVal {
    
    inline def setLoginPath(value: String): Self = StObject.set(x, "LoginPath", value.asInstanceOf[js.Any])
    
    inline def setRequestInspection(value: RequestInspection): Self = StObject.set(x, "RequestInspection", value.asInstanceOf[js.Any])
    
    inline def setRequestInspectionUndefined: Self = StObject.set(x, "RequestInspection", js.undefined)
    
    inline def setResponseInspection(value: ResponseInspection): Self = StObject.set(x, "ResponseInspection", value.asInstanceOf[js.Any])
    
    inline def setResponseInspectionUndefined: Self = StObject.set(x, "ResponseInspection", js.undefined)
  }
}
