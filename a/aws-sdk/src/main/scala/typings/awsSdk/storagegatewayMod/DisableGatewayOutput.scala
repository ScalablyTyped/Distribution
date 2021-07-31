package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableGatewayOutput extends StObject {
  
  /**
    * The unique Amazon Resource Name (ARN) of the disabled gateway.
    */
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
}
object DisableGatewayOutput {
  
  @scala.inline
  def apply(): DisableGatewayOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableGatewayOutput]
  }
  
  @scala.inline
  implicit class DisableGatewayOutputMutableBuilder[Self <: DisableGatewayOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
