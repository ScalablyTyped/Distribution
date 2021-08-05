package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateInstanceMarketOptionsRequest extends StObject {
  
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[typings.awsSdk.ec2Mod.MarketType] = js.undefined
  
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptionsRequest] = js.undefined
}
object LaunchTemplateInstanceMarketOptionsRequest {
  
  inline def apply(): LaunchTemplateInstanceMarketOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptionsRequest]
  }
  
  extension [Self <: LaunchTemplateInstanceMarketOptionsRequest](x: Self) {
    
    inline def setMarketType(value: MarketType): Self = StObject.set(x, "MarketType", value.asInstanceOf[js.Any])
    
    inline def setMarketTypeUndefined: Self = StObject.set(x, "MarketType", js.undefined)
    
    inline def setSpotOptions(value: LaunchTemplateSpotMarketOptionsRequest): Self = StObject.set(x, "SpotOptions", value.asInstanceOf[js.Any])
    
    inline def setSpotOptionsUndefined: Self = StObject.set(x, "SpotOptions", js.undefined)
  }
}
