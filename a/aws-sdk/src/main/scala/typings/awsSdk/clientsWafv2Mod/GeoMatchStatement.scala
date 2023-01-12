package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMatchStatement extends StObject {
  
  /**
    * An array of two-character country codes that you want to match against, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the ISO 3166 international standard.  When you use a geo match statement just for the region and country labels that it adds to requests, you still have to supply a country code for the rule to evaluate. In this case, you configure the rule to only count matching requests, but it will still generate logging and count metrics for any matches. You can reduce the logging and metrics that the rule produces by specifying a country that's unlikely to be a source of traffic to your site.
    */
  var CountryCodes: js.UndefOr[typings.awsSdk.clientsWafv2Mod.CountryCodes] = js.undefined
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.   If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all. 
    */
  var ForwardedIPConfig: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ForwardedIPConfig] = js.undefined
}
object GeoMatchStatement {
  
  inline def apply(): GeoMatchStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoMatchStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoMatchStatement] (val x: Self) extends AnyVal {
    
    inline def setCountryCodes(value: CountryCodes): Self = StObject.set(x, "CountryCodes", value.asInstanceOf[js.Any])
    
    inline def setCountryCodesUndefined: Self = StObject.set(x, "CountryCodes", js.undefined)
    
    inline def setCountryCodesVarargs(value: CountryCode*): Self = StObject.set(x, "CountryCodes", js.Array(value*))
    
    inline def setForwardedIPConfig(value: ForwardedIPConfig): Self = StObject.set(x, "ForwardedIPConfig", value.asInstanceOf[js.Any])
    
    inline def setForwardedIPConfigUndefined: Self = StObject.set(x, "ForwardedIPConfig", js.undefined)
  }
}
