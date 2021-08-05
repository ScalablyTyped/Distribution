package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAvailabilityMonitorTestOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
}
object StartAvailabilityMonitorTestOutput {
  
  inline def apply(): StartAvailabilityMonitorTestOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAvailabilityMonitorTestOutput]
  }
  
  extension [Self <: StartAvailabilityMonitorTestOutput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
