package typings.azureMsalCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@azure/msal-common.@azure/msal-common/dist/config/ClientConfiguration.SystemOptions> */
trait RequiredSystemOptions extends StObject {
  
  var preventCorsPreflight: Boolean
  
  var proxyUrl: String
  
  var tokenRenewalOffsetSeconds: Double
}
object RequiredSystemOptions {
  
  inline def apply(preventCorsPreflight: Boolean, proxyUrl: String, tokenRenewalOffsetSeconds: Double): RequiredSystemOptions = {
    val __obj = js.Dynamic.literal(preventCorsPreflight = preventCorsPreflight.asInstanceOf[js.Any], proxyUrl = proxyUrl.asInstanceOf[js.Any], tokenRenewalOffsetSeconds = tokenRenewalOffsetSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredSystemOptions]
  }
  
  extension [Self <: RequiredSystemOptions](x: Self) {
    
    inline def setPreventCorsPreflight(value: Boolean): Self = StObject.set(x, "preventCorsPreflight", value.asInstanceOf[js.Any])
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setTokenRenewalOffsetSeconds(value: Double): Self = StObject.set(x, "tokenRenewalOffsetSeconds", value.asInstanceOf[js.Any])
  }
}
