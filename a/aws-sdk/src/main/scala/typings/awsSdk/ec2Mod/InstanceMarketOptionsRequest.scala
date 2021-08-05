package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceMarketOptionsRequest extends StObject {
  
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[typings.awsSdk.ec2Mod.MarketType] = js.undefined
  
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[SpotMarketOptions] = js.undefined
}
object InstanceMarketOptionsRequest {
  
  inline def apply(): InstanceMarketOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMarketOptionsRequest]
  }
  
  extension [Self <: InstanceMarketOptionsRequest](x: Self) {
    
    inline def setMarketType(value: MarketType): Self = StObject.set(x, "MarketType", value.asInstanceOf[js.Any])
    
    inline def setMarketTypeUndefined: Self = StObject.set(x, "MarketType", js.undefined)
    
    inline def setSpotOptions(value: SpotMarketOptions): Self = StObject.set(x, "SpotOptions", value.asInstanceOf[js.Any])
    
    inline def setSpotOptionsUndefined: Self = StObject.set(x, "SpotOptions", js.undefined)
  }
}
