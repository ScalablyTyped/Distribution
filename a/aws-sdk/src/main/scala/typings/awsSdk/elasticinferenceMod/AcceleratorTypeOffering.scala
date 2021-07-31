package typings.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceleratorTypeOffering extends StObject {
  
  /**
    *  The name of the Elastic Inference Accelerator type. 
    */
  var acceleratorType: js.UndefOr[AcceleratorTypeName] = js.undefined
  
  /**
    *  The location for the offering. It will return either the region, availability zone or availability zone id for the offering depending on the locationType value. 
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    *  The location type for the offering. It can assume the following values: region: defines that the offering is at the regional level. availability-zone: defines that the offering is at the availability zone level. availability-zone-id: defines that the offering is at the availability zone level, defined by the availability zone id. 
    */
  var locationType: js.UndefOr[LocationType] = js.undefined
}
object AcceleratorTypeOffering {
  
  @scala.inline
  def apply(): AcceleratorTypeOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorTypeOffering]
  }
  
  @scala.inline
  implicit class AcceleratorTypeOfferingMutableBuilder[Self <: AcceleratorTypeOffering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorType(value: AcceleratorTypeName): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationType(value: LocationType): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
