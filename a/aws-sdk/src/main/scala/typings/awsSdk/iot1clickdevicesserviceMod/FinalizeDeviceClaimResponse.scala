package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalizeDeviceClaimResponse extends StObject {
  
  /**
    * The device's final claim state.
    */
  var State: js.UndefOr[string] = js.undefined
}
object FinalizeDeviceClaimResponse {
  
  inline def apply(): FinalizeDeviceClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinalizeDeviceClaimResponse]
  }
  
  extension [Self <: FinalizeDeviceClaimResponse](x: Self) {
    
    inline def setState(value: string): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
