package typings.azureCoreRestPipeline.`31CoreRestPipelineMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxySettings extends StObject {
  
  /**
    * The proxy's host address.
    */
  var host: String
  
  /**
    * The password to authenticate with the proxy, if required.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * The proxy host's port.
    */
  var port: Double
  
  /**
    * The user name to authenticate with the proxy, if required.
    */
  var username: js.UndefOr[String] = js.undefined
}
object ProxySettings {
  
  inline def apply(host: String, port: Double): ProxySettings = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxySettings]
  }
  
  extension [Self <: ProxySettings](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
