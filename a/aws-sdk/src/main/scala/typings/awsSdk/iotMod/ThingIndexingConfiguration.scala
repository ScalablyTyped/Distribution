package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingIndexingConfiguration extends StObject {
  
  /**
    * Contains custom field names and their data type.
    */
  var customFields: js.UndefOr[Fields] = js.undefined
  
  /**
    * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
    */
  var managedFields: js.UndefOr[Fields] = js.undefined
  
  /**
    * Thing connectivity indexing mode. Valid values are:    STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode must not be set to OFF.   OFF - Thing connectivity status indexing is disabled.  
    */
  var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.undefined
  
  /**
    * Thing indexing mode. Valid values are:   REGISTRY – Your thing index contains registry data only.   REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.   OFF - Thing indexing is disabled.  
    */
  var thingIndexingMode: ThingIndexingMode
}
object ThingIndexingConfiguration {
  
  inline def apply(thingIndexingMode: ThingIndexingMode): ThingIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingIndexingMode = thingIndexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingIndexingConfiguration]
  }
  
  extension [Self <: ThingIndexingConfiguration](x: Self) {
    
    inline def setCustomFields(value: Fields): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setCustomFieldsVarargs(value: Field*): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    inline def setManagedFields(value: Fields): Self = StObject.set(x, "managedFields", value.asInstanceOf[js.Any])
    
    inline def setManagedFieldsUndefined: Self = StObject.set(x, "managedFields", js.undefined)
    
    inline def setManagedFieldsVarargs(value: Field*): Self = StObject.set(x, "managedFields", js.Array(value :_*))
    
    inline def setThingConnectivityIndexingMode(value: ThingConnectivityIndexingMode): Self = StObject.set(x, "thingConnectivityIndexingMode", value.asInstanceOf[js.Any])
    
    inline def setThingConnectivityIndexingModeUndefined: Self = StObject.set(x, "thingConnectivityIndexingMode", js.undefined)
    
    inline def setThingIndexingMode(value: ThingIndexingMode): Self = StObject.set(x, "thingIndexingMode", value.asInstanceOf[js.Any])
  }
}
