package typings.axios.mod

import typings.axios.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxiosProxyConfig extends StObject {
  
  var auth: js.UndefOr[Password] = js.undefined
  
  var host: String
  
  var port: Double
  
  var protocol: js.UndefOr[String] = js.undefined
}
object AxiosProxyConfig {
  
  inline def apply(host: String, port: Double): AxiosProxyConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxiosProxyConfig]
  }
  
  extension [Self <: AxiosProxyConfig](x: Self) {
    
    inline def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
