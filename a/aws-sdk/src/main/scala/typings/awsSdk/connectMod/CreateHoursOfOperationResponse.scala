package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHoursOfOperationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the hours of operation.
    */
  var HoursOfOperationArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the hours of operation.
    */
  var HoursOfOperationId: js.UndefOr[typings.awsSdk.connectMod.HoursOfOperationId] = js.undefined
}
object CreateHoursOfOperationResponse {
  
  inline def apply(): CreateHoursOfOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHoursOfOperationResponse]
  }
  
  extension [Self <: CreateHoursOfOperationResponse](x: Self) {
    
    inline def setHoursOfOperationArn(value: ARN): Self = StObject.set(x, "HoursOfOperationArn", value.asInstanceOf[js.Any])
    
    inline def setHoursOfOperationArnUndefined: Self = StObject.set(x, "HoursOfOperationArn", js.undefined)
    
    inline def setHoursOfOperationId(value: HoursOfOperationId): Self = StObject.set(x, "HoursOfOperationId", value.asInstanceOf[js.Any])
    
    inline def setHoursOfOperationIdUndefined: Self = StObject.set(x, "HoursOfOperationId", js.undefined)
  }
}
