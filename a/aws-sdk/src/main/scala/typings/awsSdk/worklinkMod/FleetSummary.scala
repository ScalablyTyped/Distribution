package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetSummary extends StObject {
  
  /**
    * The identifier used by users to sign into the Amazon WorkLink app.
    */
  var CompanyCode: js.UndefOr[typings.awsSdk.worklinkMod.CompanyCode] = js.undefined
  
  /**
    * The time when the fleet was created.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The name of the fleet to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.worklinkMod.FleetArn] = js.undefined
  
  /**
    * The name of the fleet.
    */
  var FleetName: js.UndefOr[typings.awsSdk.worklinkMod.FleetName] = js.undefined
  
  /**
    * The status of the fleet.
    */
  var FleetStatus: js.UndefOr[typings.awsSdk.worklinkMod.FleetStatus] = js.undefined
  
  /**
    * The time when the fleet was last updated.
    */
  var LastUpdatedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The tags attached to the resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object FleetSummary {
  
  @scala.inline
  def apply(): FleetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSummary]
  }
  
  @scala.inline
  implicit class FleetSummaryMutableBuilder[Self <: FleetSummary] (val x: Self) extends AnyVal {
    
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
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
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
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
