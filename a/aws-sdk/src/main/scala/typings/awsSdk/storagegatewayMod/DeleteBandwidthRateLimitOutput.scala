package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBandwidthRateLimitOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
}
object DeleteBandwidthRateLimitOutput {
  
  @scala.inline
  def apply(): DeleteBandwidthRateLimitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBandwidthRateLimitOutput]
  }
  
  @scala.inline
  implicit class DeleteBandwidthRateLimitOutputMutableBuilder[Self <: DeleteBandwidthRateLimitOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
