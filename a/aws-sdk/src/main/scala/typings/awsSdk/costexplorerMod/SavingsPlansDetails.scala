package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansDetails extends StObject {
  
  /**
    * A group of instance types that Savings Plans applies to.
    */
  var InstanceFamily: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The unique ID that's used to distinguish Savings Plans from one another.
    */
  var OfferingId: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A collection of Amazon Web Services resources in a geographic area. Each Amazon Web Services Region is isolated and independent of the other Regions.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
}
object SavingsPlansDetails {
  
  inline def apply(): SavingsPlansDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansDetails]
  }
  
  extension [Self <: SavingsPlansDetails](x: Self) {
    
    inline def setInstanceFamily(value: GenericString): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    inline def setOfferingId(value: GenericString): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    inline def setOfferingIdUndefined: Self = StObject.set(x, "OfferingId", js.undefined)
    
    inline def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
