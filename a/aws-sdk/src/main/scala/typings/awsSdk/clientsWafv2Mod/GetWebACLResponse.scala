package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWebACLResponse extends StObject {
  
  /**
    * The URL to use in SDK integrations with Amazon Web Services managed rule groups. For example, you can use the integration SDKs with the account takeover prevention managed rule group AWSManagedRulesATPRuleSet. This is only populated if you are using a rule group in your web ACL that integrates with your applications in this way. For more information, see WAF client application integration in the WAF Developer Guide.
    */
  var ApplicationIntegrationURL: js.UndefOr[OutputUrl] = js.undefined
  
  /**
    * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: js.UndefOr[typings.awsSdk.clientsWafv2Mod.LockToken] = js.undefined
  
  /**
    * The web ACL specification. You can modify the settings in this web ACL and use it to update this web ACL or create a new one.
    */
  var WebACL: js.UndefOr[typings.awsSdk.clientsWafv2Mod.WebACL] = js.undefined
}
object GetWebACLResponse {
  
  inline def apply(): GetWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWebACLResponse]
  }
  
  extension [Self <: GetWebACLResponse](x: Self) {
    
    inline def setApplicationIntegrationURL(value: OutputUrl): Self = StObject.set(x, "ApplicationIntegrationURL", value.asInstanceOf[js.Any])
    
    inline def setApplicationIntegrationURLUndefined: Self = StObject.set(x, "ApplicationIntegrationURL", js.undefined)
    
    inline def setLockToken(value: LockToken): Self = StObject.set(x, "LockToken", value.asInstanceOf[js.Any])
    
    inline def setLockTokenUndefined: Self = StObject.set(x, "LockToken", js.undefined)
    
    inline def setWebACL(value: WebACL): Self = StObject.set(x, "WebACL", value.asInstanceOf[js.Any])
    
    inline def setWebACLUndefined: Self = StObject.set(x, "WebACL", js.undefined)
  }
}
