package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPSetForwardedIPConfig extends StObject {
  
  /**
    * The match status to assign to the web request if the request doesn't have a valid IP address in the specified position.  If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.  You can specify the following fallback behaviors:    MATCH - Treat the web request as matching the rule statement. WAF applies the rule action to the request.    NO_MATCH - Treat the web request as not matching the rule statement.  
    */
  var FallbackBehavior: typings.awsSdk.clientsWafv2Mod.FallbackBehavior
  
  /**
    * The name of the HTTP header to use for the IP address. For example, to use the X-Forwarded-For (XFF) header, set this to X-Forwarded-For.  If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all. 
    */
  var HeaderName: ForwardedIPHeaderName
  
  /**
    * The position in the header to search for the IP address. The header can contain IP addresses of the original client and also of proxies. For example, the header value could be 10.1.1.1, 127.0.0.0, 10.10.10.10 where the first IP address identifies the original client and the rest identify proxies that the request went through.  The options for this setting are the following:    FIRST - Inspect the first IP address in the list of IP addresses in the header. This is usually the client's original IP.   LAST - Inspect the last IP address in the list of IP addresses in the header.   ANY - Inspect all IP addresses in the header for a match. If the header contains more than 10 IP addresses, WAF inspects the last 10.  
    */
  var Position: ForwardedIPPosition
}
object IPSetForwardedIPConfig {
  
  inline def apply(
    FallbackBehavior: FallbackBehavior,
    HeaderName: ForwardedIPHeaderName,
    Position: ForwardedIPPosition
  ): IPSetForwardedIPConfig = {
    val __obj = js.Dynamic.literal(FallbackBehavior = FallbackBehavior.asInstanceOf[js.Any], HeaderName = HeaderName.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetForwardedIPConfig]
  }
  
  extension [Self <: IPSetForwardedIPConfig](x: Self) {
    
    inline def setFallbackBehavior(value: FallbackBehavior): Self = StObject.set(x, "FallbackBehavior", value.asInstanceOf[js.Any])
    
    inline def setHeaderName(value: ForwardedIPHeaderName): Self = StObject.set(x, "HeaderName", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: ForwardedIPPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}
