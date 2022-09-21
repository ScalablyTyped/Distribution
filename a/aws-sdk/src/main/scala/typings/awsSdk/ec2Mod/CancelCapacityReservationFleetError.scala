package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelCapacityReservationFleetError extends StObject {
  
  /**
    * The error code.
    */
  var Code: js.UndefOr[CancelCapacityReservationFleetErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[CancelCapacityReservationFleetErrorMessage] = js.undefined
}
object CancelCapacityReservationFleetError {
  
  inline def apply(): CancelCapacityReservationFleetError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelCapacityReservationFleetError]
  }
  
  extension [Self <: CancelCapacityReservationFleetError](x: Self) {
    
    inline def setCode(value: CancelCapacityReservationFleetErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: CancelCapacityReservationFleetErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
