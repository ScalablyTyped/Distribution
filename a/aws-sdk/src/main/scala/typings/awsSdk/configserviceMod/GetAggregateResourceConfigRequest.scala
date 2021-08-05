package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAggregateResourceConfigRequest extends StObject {
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.configserviceMod.ConfigurationAggregatorName
  
  /**
    * An object that identifies aggregate resource.
    */
  var ResourceIdentifier: AggregateResourceIdentifier
}
object GetAggregateResourceConfigRequest {
  
  inline def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ResourceIdentifier: AggregateResourceIdentifier
  ): GetAggregateResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateResourceConfigRequest]
  }
  
  extension [Self <: GetAggregateResourceConfigRequest](x: Self) {
    
    inline def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: AggregateResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
  }
}
