package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationUtilizationGroup extends StObject {
  
  /**
    * The attributes for this group of reservations.
    */
  var Attributes: js.UndefOr[typings.awsSdk.costexplorerMod.Attributes] = js.undefined
  
  /**
    * The key for a specific reservation attribute.
    */
  var Key: js.UndefOr[ReservationGroupKey] = js.undefined
  
  /**
    * How much you used this group of reservations.
    */
  var Utilization: js.UndefOr[ReservationAggregates] = js.undefined
  
  /**
    * The value of a specific reservation attribute.
    */
  var Value: js.UndefOr[ReservationGroupValue] = js.undefined
}
object ReservationUtilizationGroup {
  
  @scala.inline
  def apply(): ReservationUtilizationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationUtilizationGroup]
  }
  
  @scala.inline
  implicit class ReservationUtilizationGroupMutableBuilder[Self <: ReservationUtilizationGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setKey(value: ReservationGroupKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setUtilization(value: ReservationAggregates): Self = StObject.set(x, "Utilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilizationUndefined: Self = StObject.set(x, "Utilization", js.undefined)
    
    @scala.inline
    def setValue(value: ReservationGroupValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
