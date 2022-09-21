package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrackerRequest extends StObject {
  
  /**
    * Updates the description for the tracker resource.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * Updates the position filtering for the tracker resource. Valid values:    TimeBased - Location updates are evaluated against linked geofence collections, but not every location update is stored. If your update frequency is more often than 30 seconds, only one update per 30 seconds is stored for each unique device ID.     DistanceBased - If the device has moved less than 30 m (98.4 ft), location updates are ignored. Location updates within this distance are neither evaluated against linked geofence collections, nor stored. This helps control costs by reducing the number of geofence evaluations and historical device positions to paginate through. Distance-based filtering can also reduce the effects of GPS noise when displaying device trajectories on a map.     AccuracyBased - If the device has moved less than the measured accuracy, location updates are ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m, the second update is ignored if the device has moved less than 15 m. Ignored location updates are neither evaluated against linked geofence collections, nor stored. This helps educe the effects of GPS noise when displaying device trajectories on a map, and can help control costs by reducing the number of geofence evaluations.   
    */
  var PositionFiltering: js.UndefOr[typings.awsSdk.locationMod.PositionFiltering] = js.undefined
  
  /**
    * No longer used. If included, the only allowed value is RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.locationMod.PricingPlan] = js.undefined
  
  /**
    * This parameter is no longer used.
    */
  var PricingPlanDataSource: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the tracker resource to update.
    */
  var TrackerName: ResourceName
}
object UpdateTrackerRequest {
  
  inline def apply(TrackerName: ResourceName): UpdateTrackerRequest = {
    val __obj = js.Dynamic.literal(TrackerName = TrackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrackerRequest]
  }
  
  extension [Self <: UpdateTrackerRequest](x: Self) {
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setPositionFiltering(value: PositionFiltering): Self = StObject.set(x, "PositionFiltering", value.asInstanceOf[js.Any])
    
    inline def setPositionFilteringUndefined: Self = StObject.set(x, "PositionFiltering", js.undefined)
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSource(value: String): Self = StObject.set(x, "PricingPlanDataSource", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSourceUndefined: Self = StObject.set(x, "PricingPlanDataSource", js.undefined)
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
  }
}
