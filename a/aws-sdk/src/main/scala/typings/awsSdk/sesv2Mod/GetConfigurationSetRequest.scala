package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigurationSetRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to obtain more information about.
    */
  var ConfigurationSetName: typings.awsSdk.sesv2Mod.ConfigurationSetName
}
object GetConfigurationSetRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName): GetConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationSetRequest]
  }
  
  extension [Self <: GetConfigurationSetRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
