package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAvailabilityMonitorTestInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object StartAvailabilityMonitorTestInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): StartAvailabilityMonitorTestInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAvailabilityMonitorTestInput]
  }
  
  @scala.inline
  implicit class StartAvailabilityMonitorTestInputMutableBuilder[Self <: StartAvailabilityMonitorTestInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
