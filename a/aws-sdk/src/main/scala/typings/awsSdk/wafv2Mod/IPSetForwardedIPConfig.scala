package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPSetForwardedIPConfig extends js.Object {
  
  /**
    * The match status to assign to the web request if the request doesn't have a valid IP address in the specified position.  If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all.  You can specify the following fallback behaviors:   MATCH - Treat the web request as matching the rule statement. AWS WAF applies the rule action to the request.   NO_MATCH - Treat the web request as not matching the rule statement.  
    */
  var FallbackBehavior: typings.awsSdk.wafv2Mod.FallbackBehavior = js.native
  
  /**
    * The name of the HTTP header to use for the IP address. For example, to use the X-Forwarded-For (XFF) header, set this to X-Forwarded-For.  If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all. 
    */
  var HeaderName: ForwardedIPHeaderName = js.native
  
  /**
    * The position in the header to search for the IP address. The header can contain IP addresses of the original client and also of proxies. For example, the header value could be 10.1.1.1, 127.0.0.0, 10.10.10.10 where the first IP address identifies the original client and the rest identify proxies that the request went through.  The options for this setting are the following:    FIRST - Inspect the first IP address in the list of IP addresses in the header. This is usually the client's original IP.   LAST - Inspect the last IP address in the list of IP addresses in the header.   ANY - Inspect all IP addresses in the header for a match. If the header contains more than 10 IP addresses, AWS WAF inspects the last 10.  
    */
  var Position: ForwardedIPPosition = js.native
}
object IPSetForwardedIPConfig {
  
  @scala.inline
  def apply(
    FallbackBehavior: FallbackBehavior,
    HeaderName: ForwardedIPHeaderName,
    Position: ForwardedIPPosition
  ): IPSetForwardedIPConfig = {
    val __obj = js.Dynamic.literal(FallbackBehavior = FallbackBehavior.asInstanceOf[js.Any], HeaderName = HeaderName.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetForwardedIPConfig]
  }
  
  @scala.inline
  implicit class IPSetForwardedIPConfigOps[Self <: IPSetForwardedIPConfig] (val x: Self) extends AnyVal {
    
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
    def setFallbackBehavior(value: FallbackBehavior): Self = this.set("FallbackBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderName(value: ForwardedIPHeaderName): Self = this.set("HeaderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: ForwardedIPPosition): Self = this.set("Position", value.asInstanceOf[js.Any])
  }
}
