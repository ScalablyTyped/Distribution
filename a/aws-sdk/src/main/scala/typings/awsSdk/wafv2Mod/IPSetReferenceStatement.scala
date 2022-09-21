package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IPSet that this statement references.
    */
  var ARN: ResourceArn
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.   If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all. 
    */
  var IPSetForwardedIPConfig: js.UndefOr[typings.awsSdk.wafv2Mod.IPSetForwardedIPConfig] = js.undefined
}
object IPSetReferenceStatement {
  
  inline def apply(ARN: ResourceArn): IPSetReferenceStatement = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetReferenceStatement]
  }
  
  extension [Self <: IPSetReferenceStatement](x: Self) {
    
    inline def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setIPSetForwardedIPConfig(value: IPSetForwardedIPConfig): Self = StObject.set(x, "IPSetForwardedIPConfig", value.asInstanceOf[js.Any])
    
    inline def setIPSetForwardedIPConfigUndefined: Self = StObject.set(x, "IPSetForwardedIPConfig", js.undefined)
  }
}
