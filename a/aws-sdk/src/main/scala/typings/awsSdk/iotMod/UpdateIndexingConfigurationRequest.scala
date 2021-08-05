package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIndexingConfigurationRequest extends StObject {
  
  /**
    * Thing group indexing configuration.
    */
  var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.undefined
  
  /**
    * Thing indexing configuration.
    */
  var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.undefined
}
object UpdateIndexingConfigurationRequest {
  
  inline def apply(): UpdateIndexingConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateIndexingConfigurationRequest]
  }
  
  extension [Self <: UpdateIndexingConfigurationRequest](x: Self) {
    
    inline def setThingGroupIndexingConfiguration(value: ThingGroupIndexingConfiguration): Self = StObject.set(x, "thingGroupIndexingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setThingGroupIndexingConfigurationUndefined: Self = StObject.set(x, "thingGroupIndexingConfiguration", js.undefined)
    
    inline def setThingIndexingConfiguration(value: ThingIndexingConfiguration): Self = StObject.set(x, "thingIndexingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setThingIndexingConfigurationUndefined: Self = StObject.set(x, "thingIndexingConfiguration", js.undefined)
  }
}
