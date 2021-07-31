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
  
  @scala.inline
  def apply(): LaunchTemplateInstanceMarketOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptionsRequest]
  }
  
  @scala.inline
  implicit class LaunchTemplateInstanceMarketOptionsRequestMutableBuilder[Self <: LaunchTemplateInstanceMarketOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarketType(value: MarketType): Self = StObject.set(x, "MarketType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketTypeUndefined: Self = StObject.set(x, "MarketType", js.undefined)
    
    @scala.inline
    def setSpotOptions(value: LaunchTemplateSpotMarketOptionsRequest): Self = StObject.set(x, "SpotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotOptionsUndefined: Self = StObject.set(x, "SpotOptions", js.undefined)
  }
}
