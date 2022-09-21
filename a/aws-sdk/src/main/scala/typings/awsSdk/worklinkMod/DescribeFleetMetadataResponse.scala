package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetMetadataResponse extends StObject {
  
  /**
    * The identifier used by users to sign in to the Amazon WorkLink app.
    */
  var CompanyCode: js.UndefOr[typings.awsSdk.worklinkMod.CompanyCode] = js.undefined
  
  /**
    * The time that the fleet was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.undefined
  
  /**
    * The name of the fleet.
    */
  var FleetName: js.UndefOr[typings.awsSdk.worklinkMod.FleetName] = js.undefined
  
  /**
    * The current state of the fleet.
    */
  var FleetStatus: js.UndefOr[typings.awsSdk.worklinkMod.FleetStatus] = js.undefined
  
  /**
    * The time that the fleet was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
    */
  var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tags attached to the resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object DescribeFleetMetadataResponse {
  
  inline def apply(): DescribeFleetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetMetadataResponse]
  }
  
  extension [Self <: DescribeFleetMetadataResponse](x: Self) {
    
    inline def setCompanyCode(value: CompanyCode): Self = StObject.set(x, "CompanyCode", value.asInstanceOf[js.Any])
    
    inline def setCompanyCodeUndefined: Self = StObject.set(x, "CompanyCode", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setFleetName(value: FleetName): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    inline def setFleetNameUndefined: Self = StObject.set(x, "FleetName", js.undefined)
    
    inline def setFleetStatus(value: FleetStatus): Self = StObject.set(x, "FleetStatus", value.asInstanceOf[js.Any])
    
    inline def setFleetStatusUndefined: Self = StObject.set(x, "FleetStatus", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setOptimizeForEndUserLocation(value: Boolean): Self = StObject.set(x, "OptimizeForEndUserLocation", value.asInstanceOf[js.Any])
    
    inline def setOptimizeForEndUserLocationUndefined: Self = StObject.set(x, "OptimizeForEndUserLocation", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
