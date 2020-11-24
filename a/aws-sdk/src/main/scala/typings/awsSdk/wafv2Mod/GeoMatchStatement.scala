package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoMatchStatement extends js.Object {
  
  /**
    * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the ISO 3166 international standard. 
    */
  var CountryCodes: js.UndefOr[typings.awsSdk.wafv2Mod.CountryCodes] = js.native
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.   If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all. 
    */
  var ForwardedIPConfig: js.UndefOr[typings.awsSdk.wafv2Mod.ForwardedIPConfig] = js.native
}
object GeoMatchStatement {
  
  @scala.inline
  def apply(): GeoMatchStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoMatchStatement]
  }
  
  @scala.inline
  implicit class GeoMatchStatementOps[Self <: GeoMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCountryCodesVarargs(value: CountryCode*): Self = this.set("CountryCodes", js.Array(value :_*))
    
    @scala.inline
    def setCountryCodes(value: CountryCodes): Self = this.set("CountryCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCodes: Self = this.set("CountryCodes", js.undefined)
    
    @scala.inline
    def setForwardedIPConfig(value: ForwardedIPConfig): Self = this.set("ForwardedIPConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardedIPConfig: Self = this.set("ForwardedIPConfig", js.undefined)
  }
}
