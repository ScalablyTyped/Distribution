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
  
  @scala.inline
  def apply(): GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigResponse]
  }
  
  @scala.inline
  implicit class GetConfigResponseMutableBuilder[Self <: GetConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigCred(value: String): Self = StObject.set(x, "ConfigCred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigCredUndefined: Self = StObject.set(x, "ConfigCred", js.undefined)
    
    @scala.inline
    def setConfigFile(value: String): Self = StObject.set(x, "ConfigFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFileUndefined: Self = StObject.set(x, "ConfigFile", js.undefined)
    
    @scala.inline
    def setConfigType(value: String): Self = StObject.set(x, "ConfigType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigTypeUndefined: Self = StObject.set(x, "ConfigType", js.undefined)
  }
}
