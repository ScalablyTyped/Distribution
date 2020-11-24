package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateInstanceMarketOptions extends js.Object {
  
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[typings.awsSdk.ec2Mod.MarketType] = js.native
  
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptions] = js.native
}
object LaunchTemplateInstanceMarketOptions {
  
  @scala.inline
  def apply(): LaunchTemplateInstanceMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptions]
  }
  
  @scala.inline
  implicit class LaunchTemplateInstanceMarketOptionsOps[Self <: LaunchTemplateInstanceMarketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMarketType(value: MarketType): Self = this.set("MarketType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketType: Self = this.set("MarketType", js.undefined)
    
    @scala.inline
    def setSpotOptions(value: LaunchTemplateSpotMarketOptions): Self = this.set("SpotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotOptions: Self = this.set("SpotOptions", js.undefined)
  }
}
