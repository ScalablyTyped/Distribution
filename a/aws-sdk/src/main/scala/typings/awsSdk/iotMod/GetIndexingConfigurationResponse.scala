package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIndexingConfigurationResponse extends StObject {
  
  /**
    * The index configuration.
    */
  var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.native
  
  /**
    * Thing indexing configuration.
    */
  var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.native
}
object GetIndexingConfigurationResponse {
  
  @scala.inline
  def apply(): GetIndexingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIndexingConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetIndexingConfigurationResponseMutableBuilder[Self <: GetIndexingConfigurationResponse] (val x: Self) extends AnyVal {
    
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
