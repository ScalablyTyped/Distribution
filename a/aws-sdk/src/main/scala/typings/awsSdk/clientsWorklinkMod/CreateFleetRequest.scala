package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetRequest extends StObject {
  
  /**
    * The fleet name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsWorklinkMod.DisplayName] = js.undefined
  
  /**
    * A unique name for the fleet.
    */
  var FleetName: typings.awsSdk.clientsWorklinkMod.FleetName
  
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
    */
  var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The tags to add to the resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateFleetRequest {
  
  inline def apply(FleetName: FleetName): CreateFleetRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetRequest]
  }
  
  extension [Self <: CreateFleetRequest](x: Self) {
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setFleetName(value: FleetName): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    inline def setOptimizeForEndUserLocation(value: Boolean): Self = StObject.set(x, "OptimizeForEndUserLocation", value.asInstanceOf[js.Any])
    
    inline def setOptimizeForEndUserLocationUndefined: Self = StObject.set(x, "OptimizeForEndUserLocation", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
