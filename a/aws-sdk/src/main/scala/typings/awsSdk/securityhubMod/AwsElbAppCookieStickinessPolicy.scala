package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbAppCookieStickinessPolicy extends StObject {
  
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The mnemonic name for the policy being created. The name must be unique within the set of policies for the load balancer.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElbAppCookieStickinessPolicy {
  
  inline def apply(): AwsElbAppCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbAppCookieStickinessPolicy]
  }
  
  extension [Self <: AwsElbAppCookieStickinessPolicy](x: Self) {
    
    inline def setCookieName(value: NonEmptyString): Self = StObject.set(x, "CookieName", value.asInstanceOf[js.Any])
    
    inline def setCookieNameUndefined: Self = StObject.set(x, "CookieName", js.undefined)
    
    inline def setPolicyName(value: NonEmptyString): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
