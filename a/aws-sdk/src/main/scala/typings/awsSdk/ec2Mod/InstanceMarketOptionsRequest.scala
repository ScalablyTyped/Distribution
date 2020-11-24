package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceMarketOptionsRequest extends js.Object {
  
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[typings.awsSdk.ec2Mod.MarketType] = js.native
  
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[SpotMarketOptions] = js.native
}
object InstanceMarketOptionsRequest {
  
  @scala.inline
  def apply(): InstanceMarketOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMarketOptionsRequest]
  }
  
  @scala.inline
  implicit class InstanceMarketOptionsRequestOps[Self <: InstanceMarketOptionsRequest] (val x: Self) extends AnyVal {
    
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
    def setSpotOptions(value: SpotMarketOptions): Self = this.set("SpotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotOptions: Self = this.set("SpotOptions", js.undefined)
  }
}
