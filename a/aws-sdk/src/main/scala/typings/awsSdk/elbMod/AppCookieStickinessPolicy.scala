package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppCookieStickinessPolicy extends StObject {
  
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: js.UndefOr[typings.awsSdk.elbMod.CookieName] = js.undefined
  
  /**
    * The mnemonic name for the policy being created. The name must be unique within a set of policies for this load balancer.
    */
  var PolicyName: js.UndefOr[typings.awsSdk.elbMod.PolicyName] = js.undefined
}
object AppCookieStickinessPolicy {
  
  inline def apply(): AppCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCookieStickinessPolicy]
  }
  
  extension [Self <: AppCookieStickinessPolicy](x: Self) {
    
    inline def setCookieName(value: CookieName): Self = StObject.set(x, "CookieName", value.asInstanceOf[js.Any])
    
    inline def setCookieNameUndefined: Self = StObject.set(x, "CookieName", js.undefined)
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
