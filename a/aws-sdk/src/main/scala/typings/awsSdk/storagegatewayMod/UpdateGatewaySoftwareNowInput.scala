package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewaySoftwareNowInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object UpdateGatewaySoftwareNowInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): UpdateGatewaySoftwareNowInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewaySoftwareNowInput]
  }
  
  @scala.inline
  implicit class UpdateGatewaySoftwareNowInputMutableBuilder[Self <: UpdateGatewaySoftwareNowInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
