package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateInstanceMarketOptions extends StObject {
  
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[typings.awsSdk.ec2Mod.MarketType] = js.undefined
  
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptions] = js.undefined
}
object LaunchTemplateInstanceMarketOptions {
  
  @scala.inline
  def apply(): LaunchTemplateInstanceMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptions]
  }
  
  @scala.inline
  implicit class LaunchTemplateInstanceMarketOptionsMutableBuilder[Self <: LaunchTemplateInstanceMarketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarketType(value: MarketType): Self = StObject.set(x, "MarketType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketTypeUndefined: Self = StObject.set(x, "MarketType", js.undefined)
    
    @scala.inline
    def setSpotOptions(value: LaunchTemplateSpotMarketOptions): Self = StObject.set(x, "SpotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotOptionsUndefined: Self = StObject.set(x, "SpotOptions", js.undefined)
  }
}
