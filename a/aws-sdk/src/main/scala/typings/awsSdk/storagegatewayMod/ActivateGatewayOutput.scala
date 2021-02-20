package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivateGatewayOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}
object ActivateGatewayOutput {
  
  @scala.inline
  def apply(): ActivateGatewayOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivateGatewayOutput]
  }
  
  @scala.inline
  implicit class ActivateGatewayOutputMutableBuilder[Self <: ActivateGatewayOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
