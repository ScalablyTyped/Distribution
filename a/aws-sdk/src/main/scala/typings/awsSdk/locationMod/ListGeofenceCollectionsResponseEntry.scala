package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGeofenceCollectionsResponseEntry extends StObject {
  
  /**
    * The name of the geofence collection.
    */
  var CollectionName: ResourceName
  
  /**
    * The timestamp for when the geofence collection was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var CreateTime: js.Date
  
  /**
    * The description for the geofence collection
    */
  var Description: ResourceDescription
  
  /**
    * No longer used. Always returns RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.locationMod.PricingPlan] = js.undefined
  
  /**
    * No longer used. Always returns an empty string.
    */
  var PricingPlanDataSource: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a timestamp for when the resource was last updated in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var UpdateTime: js.Date
}
object ListGeofenceCollectionsResponseEntry {
  
  inline def apply(
    CollectionName: ResourceName,
    CreateTime: js.Date,
    Description: ResourceDescription,
    UpdateTime: js.Date
  ): ListGeofenceCollectionsResponseEntry = {
    val __obj = js.Dynamic.literal(CollectionName = CollectionName.asInstanceOf[js.Any], CreateTime = CreateTime.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGeofenceCollectionsResponseEntry]
  }
  
  extension [Self <: ListGeofenceCollectionsResponseEntry](x: Self) {
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSource(value: String): Self = StObject.set(x, "PricingPlanDataSource", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSourceUndefined: Self = StObject.set(x, "PricingPlanDataSource", js.undefined)
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
