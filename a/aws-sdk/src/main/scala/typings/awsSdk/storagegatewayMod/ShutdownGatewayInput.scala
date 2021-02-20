package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShutdownGatewayInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}
object ShutdownGatewayInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): ShutdownGatewayInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShutdownGatewayInput]
  }
  
  @scala.inline
  implicit class ShutdownGatewayInputMutableBuilder[Self <: ShutdownGatewayInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
