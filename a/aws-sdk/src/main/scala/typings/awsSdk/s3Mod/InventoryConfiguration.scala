package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryConfiguration extends StObject {
  
  /**
    * Contains information about where to publish the inventory results.
    */
  var Destination: InventoryDestination
  
  /**
    * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.
    */
  var Filter: js.UndefOr[InventoryFilter] = js.undefined
  
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId
  
  /**
    * Object versions to include in the inventory list. If set to All, the list includes all the object versions, which adds the version-related fields VersionId, IsLatest, and DeleteMarker to the list. If set to Current, the list does not contain these version-related fields.
    */
  var IncludedObjectVersions: InventoryIncludedObjectVersions
  
  /**
    * Specifies whether the inventory is enabled or disabled. If set to True, an inventory list is generated. If set to False, no inventory list is generated.
    */
  var IsEnabled: typings.awsSdk.s3Mod.IsEnabled
  
  /**
    * Contains the optional fields that are included in the inventory results.
    */
  var OptionalFields: js.UndefOr[InventoryOptionalFields] = js.undefined
  
  /**
    * Specifies the schedule for generating inventory results.
    */
  var Schedule: InventorySchedule
}
object InventoryConfiguration {
  
  inline def apply(
    Destination: InventoryDestination,
    Id: InventoryId,
    IncludedObjectVersions: InventoryIncludedObjectVersions,
    IsEnabled: IsEnabled,
    Schedule: InventorySchedule
  ): InventoryConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryConfiguration]
  }
  
  extension [Self <: InventoryConfiguration](x: Self) {
    
    inline def setDestination(value: InventoryDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: InventoryFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setId(value: InventoryId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIncludedObjectVersions(value: InventoryIncludedObjectVersions): Self = StObject.set(x, "IncludedObjectVersions", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: IsEnabled): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    inline def setOptionalFields(value: InventoryOptionalFields): Self = StObject.set(x, "OptionalFields", value.asInstanceOf[js.Any])
    
    inline def setOptionalFieldsUndefined: Self = StObject.set(x, "OptionalFields", js.undefined)
    
    inline def setOptionalFieldsVarargs(value: InventoryOptionalField*): Self = StObject.set(x, "OptionalFields", js.Array(value :_*))
    
    inline def setSchedule(value: InventorySchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
  }
}
