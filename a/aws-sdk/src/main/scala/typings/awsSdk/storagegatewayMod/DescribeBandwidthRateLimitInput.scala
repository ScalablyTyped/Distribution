package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBandwidthRateLimitInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object DescribeBandwidthRateLimitInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeBandwidthRateLimitInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBandwidthRateLimitInput]
  }
  
  @scala.inline
  implicit class DescribeBandwidthRateLimitInputMutableBuilder[Self <: DescribeBandwidthRateLimitInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
