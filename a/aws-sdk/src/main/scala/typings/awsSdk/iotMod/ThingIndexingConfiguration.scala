package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThingIndexingConfiguration extends StObject {
  
  /**
    * Contains custom field names and their data type.
    */
  var customFields: js.UndefOr[Fields] = js.native
  
  /**
    * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
    */
  var managedFields: js.UndefOr[Fields] = js.native
  
  /**
    * Thing connectivity indexing mode. Valid values are:    STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode must not be set to OFF.   OFF - Thing connectivity status indexing is disabled.  
    */
  var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.native
  
  /**
    * Thing indexing mode. Valid values are:   REGISTRY – Your thing index contains registry data only.   REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.   OFF - Thing indexing is disabled.  
    */
  var thingIndexingMode: ThingIndexingMode = js.native
}
object ThingIndexingConfiguration {
  
  @scala.inline
  def apply(thingIndexingMode: ThingIndexingMode): ThingIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingIndexingMode = thingIndexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingIndexingConfiguration]
  }
  
  @scala.inline
  implicit class ThingIndexingConfigurationMutableBuilder[Self <: ThingIndexingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFields(value: Fields): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setCustomFieldsVarargs(value: Field*): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    @scala.inline
    def setManagedFields(value: Fields): Self = StObject.set(x, "managedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedFieldsUndefined: Self = StObject.set(x, "managedFields", js.undefined)
    
    @scala.inline
    def setManagedFieldsVarargs(value: Field*): Self = StObject.set(x, "managedFields", js.Array(value :_*))
    
    @scala.inline
    def setThingConnectivityIndexingMode(value: ThingConnectivityIndexingMode): Self = StObject.set(x, "thingConnectivityIndexingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingConnectivityIndexingModeUndefined: Self = StObject.set(x, "thingConnectivityIndexingMode", js.undefined)
    
    @scala.inline
    def setThingIndexingMode(value: ThingIndexingMode): Self = StObject.set(x, "thingIndexingMode", value.asInstanceOf[js.Any])
  }
}
