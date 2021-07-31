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
    * The unique ID used to distinguish Savings Plans from one another.
    */
  var OfferingId: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A collection of AWS resources in a geographic area. Each AWS Region is isolated and independent of the other Regions.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
}
object SavingsPlansDetails {
  
  @scala.inline
  def apply(): SavingsPlansDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansDetails]
  }
  
  @scala.inline
  implicit class SavingsPlansDetailsMutableBuilder[Self <: SavingsPlansDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceFamily(value: GenericString): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    @scala.inline
    def setOfferingId(value: GenericString): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdUndefined: Self = StObject.set(x, "OfferingId", js.undefined)
    
    @scala.inline
    def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
