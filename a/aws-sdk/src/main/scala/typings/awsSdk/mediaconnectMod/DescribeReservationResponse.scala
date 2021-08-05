package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservationResponse extends StObject {
  
  var Reservation: js.UndefOr[typings.awsSdk.mediaconnectMod.Reservation] = js.undefined
}
object DescribeReservationResponse {
  
  inline def apply(): DescribeReservationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservationResponse]
  }
  
  extension [Self <: DescribeReservationResponse](x: Self) {
    
    inline def setReservation(value: Reservation): Self = StObject.set(x, "Reservation", value.asInstanceOf[js.Any])
    
    inline def setReservationUndefined: Self = StObject.set(x, "Reservation", js.undefined)
  }
}
