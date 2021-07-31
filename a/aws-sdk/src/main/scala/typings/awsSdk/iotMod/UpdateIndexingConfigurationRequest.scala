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
  
  @scala.inline
  def apply(): UpdateIndexingConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateIndexingConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateIndexingConfigurationRequestMutableBuilder[Self <: UpdateIndexingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingGroupIndexingConfiguration(value: ThingGroupIndexingConfiguration): Self = StObject.set(x, "thingGroupIndexingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupIndexingConfigurationUndefined: Self = StObject.set(x, "thingGroupIndexingConfiguration", js.undefined)
    
    @scala.inline
    def setThingIndexingConfiguration(value: ThingIndexingConfiguration): Self = StObject.set(x, "thingIndexingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingIndexingConfigurationUndefined: Self = StObject.set(x, "thingIndexingConfiguration", js.undefined)
  }
}
