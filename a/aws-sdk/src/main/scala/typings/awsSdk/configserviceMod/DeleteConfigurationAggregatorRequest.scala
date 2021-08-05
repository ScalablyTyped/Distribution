package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationAggregatorRequest extends StObject {
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.configserviceMod.ConfigurationAggregatorName
}
object DeleteConfigurationAggregatorRequest {
  
  inline def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): DeleteConfigurationAggregatorRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationAggregatorRequest]
  }
  
  extension [Self <: DeleteConfigurationAggregatorRequest](x: Self) {
    
    inline def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
  }
}
