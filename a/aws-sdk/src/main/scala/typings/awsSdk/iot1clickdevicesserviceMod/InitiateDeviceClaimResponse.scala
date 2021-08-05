package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitiateDeviceClaimResponse extends StObject {
  
  /**
    * The device's final claim state.
    */
  var State: js.UndefOr[string] = js.undefined
}
object InitiateDeviceClaimResponse {
  
  inline def apply(): InitiateDeviceClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateDeviceClaimResponse]
  }
  
  extension [Self <: InitiateDeviceClaimResponse](x: Self) {
    
    inline def setState(value: string): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
