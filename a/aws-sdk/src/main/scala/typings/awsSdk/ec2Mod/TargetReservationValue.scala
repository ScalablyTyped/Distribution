package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetReservationValue extends StObject {
  
  /**
    * The total value of the Convertible Reserved Instances that make up the exchange. This is the sum of the list value, remaining upfront price, and additional upfront cost of the exchange.
    */
  var ReservationValue: js.UndefOr[typings.awsSdk.ec2Mod.ReservationValue] = js.undefined
  
  /**
    * The configuration of the Convertible Reserved Instances that make up the exchange.
    */
  var TargetConfiguration: js.UndefOr[typings.awsSdk.ec2Mod.TargetConfiguration] = js.undefined
}
object TargetReservationValue {
  
  @scala.inline
  def apply(): TargetReservationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetReservationValue]
  }
  
  @scala.inline
  implicit class TargetReservationValueMutableBuilder[Self <: TargetReservationValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservationValue(value: ReservationValue): Self = StObject.set(x, "ReservationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationValueUndefined: Self = StObject.set(x, "ReservationValue", js.undefined)
    
    @scala.inline
    def setTargetConfiguration(value: TargetConfiguration): Self = StObject.set(x, "TargetConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetConfigurationUndefined: Self = StObject.set(x, "TargetConfiguration", js.undefined)
  }
}
