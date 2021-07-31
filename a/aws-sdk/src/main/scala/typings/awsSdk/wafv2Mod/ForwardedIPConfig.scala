package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardedIPConfig extends StObject {
  
  /**
    * The match status to assign to the web request if the request doesn't have a valid IP address in the specified position.  If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all.  You can specify the following fallback behaviors:   MATCH - Treat the web request as matching the rule statement. AWS WAF applies the rule action to the request.   NO_MATCH - Treat the web request as not matching the rule statement.  
    */
  var FallbackBehavior: typings.awsSdk.wafv2Mod.FallbackBehavior
  
  /**
    * The name of the HTTP header to use for the IP address. For example, to use the X-Forwarded-For (XFF) header, set this to X-Forwarded-For.  If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all. 
    */
  var HeaderName: ForwardedIPHeaderName
}
object ForwardedIPConfig {
  
  @scala.inline
  def apply(FallbackBehavior: FallbackBehavior, HeaderName: ForwardedIPHeaderName): ForwardedIPConfig = {
    val __obj = js.Dynamic.literal(FallbackBehavior = FallbackBehavior.asInstanceOf[js.Any], HeaderName = HeaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedIPConfig]
  }
  
  @scala.inline
  implicit class ForwardedIPConfigMutableBuilder[Self <: ForwardedIPConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackBehavior(value: FallbackBehavior): Self = StObject.set(x, "FallbackBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderName(value: ForwardedIPHeaderName): Self = StObject.set(x, "HeaderName", value.asInstanceOf[js.Any])
  }
}
