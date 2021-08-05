package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigResponse extends StObject {
  
  /**
    * The certificate file containing the server.pem files of the HSMs.
    */
  var ConfigCred: js.UndefOr[String] = js.undefined
  
  /**
    * The chrystoki.conf configuration file.
    */
  var ConfigFile: js.UndefOr[String] = js.undefined
  
  /**
    * The type of credentials.
    */
  var ConfigType: js.UndefOr[String] = js.undefined
}
object GetConfigResponse {
  
  inline def apply(): GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigResponse]
  }
  
  extension [Self <: GetConfigResponse](x: Self) {
    
    inline def setConfigCred(value: String): Self = StObject.set(x, "ConfigCred", value.asInstanceOf[js.Any])
    
    inline def setConfigCredUndefined: Self = StObject.set(x, "ConfigCred", js.undefined)
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "ConfigFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "ConfigFile", js.undefined)
    
    inline def setConfigType(value: String): Self = StObject.set(x, "ConfigType", value.asInstanceOf[js.Any])
    
    inline def setConfigTypeUndefined: Self = StObject.set(x, "ConfigType", js.undefined)
  }
}
