package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAggregateResourceConfigResponse extends StObject {
  
  /**
    * Returns a ConfigurationItem object.
    */
  var ConfigurationItem: js.UndefOr[typings.awsSdk.configserviceMod.ConfigurationItem] = js.undefined
}
object GetAggregateResourceConfigResponse {
  
  @scala.inline
  def apply(): GetAggregateResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAggregateResourceConfigResponse]
  }
  
  @scala.inline
  implicit class GetAggregateResourceConfigResponseMutableBuilder[Self <: GetAggregateResourceConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationItem(value: ConfigurationItem): Self = StObject.set(x, "ConfigurationItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationItemUndefined: Self = StObject.set(x, "ConfigurationItem", js.undefined)
  }
}
