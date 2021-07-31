package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetRequest extends StObject {
  
  /**
    * The fleet name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.undefined
  
  /**
    * A unique name for the fleet.
    */
  var FleetName: typings.awsSdk.worklinkMod.FleetName
  
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
  
  @scala.inline
  def apply(FleetName: FleetName): CreateFleetRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetRequest]
  }
  
  @scala.inline
  implicit class CreateFleetRequestMutableBuilder[Self <: CreateFleetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setFleetName(value: FleetName): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeForEndUserLocation(value: Boolean): Self = StObject.set(x, "OptimizeForEndUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeForEndUserLocationUndefined: Self = StObject.set(x, "OptimizeForEndUserLocation", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
