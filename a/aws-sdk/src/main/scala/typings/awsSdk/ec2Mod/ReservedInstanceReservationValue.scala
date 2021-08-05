package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedInstanceReservationValue extends StObject {
  
  /**
    * The total value of the Convertible Reserved Instance that you are exchanging.
    */
  var ReservationValue: js.UndefOr[typings.awsSdk.ec2Mod.ReservationValue] = js.undefined
  
  /**
    * The ID of the Convertible Reserved Instance that you are exchanging.
    */
  var ReservedInstanceId: js.UndefOr[String] = js.undefined
}
object ReservedInstanceReservationValue {
  
  inline def apply(): ReservedInstanceReservationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstanceReservationValue]
  }
  
  extension [Self <: ReservedInstanceReservationValue](x: Self) {
    
    inline def setReservationValue(value: ReservationValue): Self = StObject.set(x, "ReservationValue", value.asInstanceOf[js.Any])
    
    inline def setReservationValueUndefined: Self = StObject.set(x, "ReservationValue", js.undefined)
    
    inline def setReservedInstanceId(value: String): Self = StObject.set(x, "ReservedInstanceId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceIdUndefined: Self = StObject.set(x, "ReservedInstanceId", js.undefined)
  }
}
