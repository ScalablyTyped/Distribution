package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBandwidthRateLimitInput extends StObject {
  
  /**
    * One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete. Valid Values: UPLOAD | DOWNLOAD | ALL 
    */
  var BandwidthType: typings.awsSdk.storagegatewayMod.BandwidthType
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object DeleteBandwidthRateLimitInput {
  
  inline def apply(BandwidthType: BandwidthType, GatewayARN: GatewayARN): DeleteBandwidthRateLimitInput = {
    val __obj = js.Dynamic.literal(BandwidthType = BandwidthType.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBandwidthRateLimitInput]
  }
  
  extension [Self <: DeleteBandwidthRateLimitInput](x: Self) {
    
    inline def setBandwidthType(value: BandwidthType): Self = StObject.set(x, "BandwidthType", value.asInstanceOf[js.Any])
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
