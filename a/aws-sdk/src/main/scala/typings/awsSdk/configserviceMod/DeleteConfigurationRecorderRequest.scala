package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationRecorderRequest extends StObject {
  
  /**
    * The name of the configuration recorder to be deleted. You can retrieve the name of your configuration recorder by using the DescribeConfigurationRecorders action.
    */
  var ConfigurationRecorderName: RecorderName
}
object DeleteConfigurationRecorderRequest {
  
  inline def apply(ConfigurationRecorderName: RecorderName): DeleteConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorderName = ConfigurationRecorderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationRecorderRequest]
  }
  
  extension [Self <: DeleteConfigurationRecorderRequest](x: Self) {
    
    inline def setConfigurationRecorderName(value: RecorderName): Self = StObject.set(x, "ConfigurationRecorderName", value.asInstanceOf[js.Any])
  }
}
