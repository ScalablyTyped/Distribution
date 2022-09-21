package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMapsResponseEntry extends StObject {
  
  /**
    * The timestamp for when the map resource was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.
    */
  var CreateTime: js.Date
  
  /**
    * Specifies the data provider for the associated map tiles.
    */
  var DataSource: String
  
  /**
    * The description for the map resource.
    */
  var Description: ResourceDescription
  
  /**
    * The name of the associated map resource.
    */
  var MapName: ResourceName
  
  /**
    * No longer used. Always returns RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.locationMod.PricingPlan] = js.undefined
  
  /**
    * The timestamp for when the map resource was last updated in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.
    */
  var UpdateTime: js.Date
}
object ListMapsResponseEntry {
  
  inline def apply(
    CreateTime: js.Date,
    DataSource: String,
    Description: ResourceDescription,
    MapName: ResourceName,
    UpdateTime: js.Date
  ): ListMapsResponseEntry = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], DataSource = DataSource.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], MapName = MapName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMapsResponseEntry]
  }
  
  extension [Self <: ListMapsResponseEntry](x: Self) {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
