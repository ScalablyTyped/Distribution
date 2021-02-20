package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppCookieStickinessPolicy extends StObject {
  
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: js.UndefOr[typings.awsSdk.elbMod.CookieName] = js.native
  
  /**
    * The mnemonic name for the policy being created. The name must be unique within a set of policies for this load balancer.
    */
  var PolicyName: js.UndefOr[typings.awsSdk.elbMod.PolicyName] = js.native
}
object AppCookieStickinessPolicy {
  
  @scala.inline
  def apply(): AppCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCookieStickinessPolicy]
  }
  
  @scala.inline
  implicit class AppCookieStickinessPolicyMutableBuilder[Self <: AppCookieStickinessPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookieName(value: CookieName): Self = StObject.set(x, "CookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieNameUndefined: Self = StObject.set(x, "CookieName", js.undefined)
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
