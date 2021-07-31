package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMatchStatement extends StObject {
  
  /**
    * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the ISO 3166 international standard. 
    */
  var CountryCodes: js.UndefOr[typings.awsSdk.wafv2Mod.CountryCodes] = js.undefined
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.   If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all. 
    */
  var ForwardedIPConfig: js.UndefOr[typings.awsSdk.wafv2Mod.ForwardedIPConfig] = js.undefined
}
object GeoMatchStatement {
  
  @scala.inline
  def apply(): GeoMatchStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoMatchStatement]
  }
  
  @scala.inline
  implicit class GeoMatchStatementMutableBuilder[Self <: GeoMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCodes(value: CountryCodes): Self = StObject.set(x, "CountryCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodesUndefined: Self = StObject.set(x, "CountryCodes", js.undefined)
    
    @scala.inline
    def setCountryCodesVarargs(value: CountryCode*): Self = StObject.set(x, "CountryCodes", js.Array(value :_*))
    
    @scala.inline
    def setForwardedIPConfig(value: ForwardedIPConfig): Self = StObject.set(x, "ForwardedIPConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedIPConfigUndefined: Self = StObject.set(x, "ForwardedIPConfig", js.undefined)
  }
}
