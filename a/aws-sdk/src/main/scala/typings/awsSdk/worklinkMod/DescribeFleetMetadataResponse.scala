package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetMetadataResponse extends StObject {
  
  /**
    * The identifier used by users to sign in to the Amazon WorkLink app.
    */
  var CompanyCode: js.UndefOr[typings.awsSdk.worklinkMod.CompanyCode] = js.native
  
  /**
    * The time that the fleet was created.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
  
  /**
    * The name of the fleet.
    */
  var FleetName: js.UndefOr[typings.awsSdk.worklinkMod.FleetName] = js.native
  
  /**
    * The current state of the fleet.
    */
  var FleetStatus: js.UndefOr[typings.awsSdk.worklinkMod.FleetStatus] = js.native
  
  /**
    * The time that the fleet was last updated.
    */
  var LastUpdatedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
    */
  var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.native
  
  /**
    * The tags attached to the resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object DescribeFleetMetadataResponse {
  
  @scala.inline
  def apply(): DescribeFleetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetMetadataResponse]
  }
  
  @scala.inline
  implicit class DescribeFleetMetadataResponseMutableBuilder[Self <: DescribeFleetMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanyCode(value: CompanyCode): Self = StObject.set(x, "CompanyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyCodeUndefined: Self = StObject.set(x, "CompanyCode", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: DateTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setFleetName(value: FleetName): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetNameUndefined: Self = StObject.set(x, "FleetName", js.undefined)
    
    @scala.inline
    def setFleetStatus(value: FleetStatus): Self = StObject.set(x, "FleetStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetStatusUndefined: Self = StObject.set(x, "FleetStatus", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: DateTime): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
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
