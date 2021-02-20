package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGatewayInformationOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: js.UndefOr[String] = js.native
}
object UpdateGatewayInformationOutput {
  
  @scala.inline
  def apply(): UpdateGatewayInformationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGatewayInformationOutput]
  }
  
  @scala.inline
  implicit class UpdateGatewayInformationOutputMutableBuilder[Self <: UpdateGatewayInformationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setGatewayName(value: String): Self = StObject.set(x, "GatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayNameUndefined: Self = StObject.set(x, "GatewayName", js.undefined)
  }
}
