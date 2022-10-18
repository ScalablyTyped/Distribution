package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetSummary extends StObject {
  
  /**
    * The identifier used by users to sign into the Amazon WorkLink app.
    */
  var CompanyCode: js.UndefOr[typings.awsSdk.clientsWorklinkMod.CompanyCode] = js.undefined
  
  /**
    * The time when the fleet was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the fleet to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsWorklinkMod.DisplayName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.clientsWorklinkMod.FleetArn] = js.undefined
  
  /**
    * The name of the fleet.
    */
  var FleetName: js.UndefOr[typings.awsSdk.clientsWorklinkMod.FleetName] = js.undefined
  
  /**
    * The status of the fleet.
    */
  var FleetStatus: js.UndefOr[typings.awsSdk.clientsWorklinkMod.FleetStatus] = js.undefined
  
  /**
    * The time when the fleet was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The tags attached to the resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object FleetSummary {
  
  inline def apply(): FleetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSummary]
  }
  
  extension [Self <: FleetSummary](x: Self) {
    
    inline def setCompanyCode(value: CompanyCode): Self = StObject.set(x, "CompanyCode", value.asInstanceOf[js.Any])
    
    inline def setCompanyCodeUndefined: Self = StObject.set(x, "CompanyCode", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetName(value: FleetName): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    inline def setFleetNameUndefined: Self = StObject.set(x, "FleetName", js.undefined)
    
    inline def setFleetStatus(value: FleetStatus): Self = StObject.set(x, "FleetStatus", value.asInstanceOf[js.Any])
    
    inline def setFleetStatusUndefined: Self = StObject.set(x, "FleetStatus", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
