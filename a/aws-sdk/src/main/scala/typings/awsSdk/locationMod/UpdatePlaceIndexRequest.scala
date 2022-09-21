package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePlaceIndexRequest extends StObject {
  
  /**
    * Updates the data storage option for the place index resource.
    */
  var DataSourceConfiguration: js.UndefOr[typings.awsSdk.locationMod.DataSourceConfiguration] = js.undefined
  
  /**
    * Updates the description for the place index resource.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * The name of the place index resource to update.
    */
  var IndexName: ResourceName
  
  /**
    * No longer used. If included, the only allowed value is RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.locationMod.PricingPlan] = js.undefined
}
object UpdatePlaceIndexRequest {
  
  inline def apply(IndexName: ResourceName): UpdatePlaceIndexRequest = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePlaceIndexRequest]
  }
  
  extension [Self <: UpdatePlaceIndexRequest](x: Self) {
    
    inline def setDataSourceConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "DataSourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataSourceConfigurationUndefined: Self = StObject.set(x, "DataSourceConfiguration", js.undefined)
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIndexName(value: ResourceName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
  }
}
