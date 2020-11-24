package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateSpotMarketOptions extends js.Object {
  
  /**
    * The required duration for the Spot Instances (also known as Spot blocks), in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.native
  
  /**
    * The behavior when a Spot Instance is interrupted.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.native
  
  /**
    * The maximum hourly price you're willing to pay for the Spot Instances.
    */
  var MaxPrice: js.UndefOr[String] = js.native
  
  /**
    * The Spot Instance request type.
    */
  var SpotInstanceType: js.UndefOr[typings.awsSdk.ec2Mod.SpotInstanceType] = js.native
  
  /**
    * The end date of the request. For a one-time request, the request remains active until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until it is canceled or this date and time is reached.
    */
  var ValidUntil: js.UndefOr[DateTime] = js.native
}
object LaunchTemplateSpotMarketOptions {
  
  @scala.inline
  def apply(): LaunchTemplateSpotMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpotMarketOptions]
  }
  
  @scala.inline
  implicit class LaunchTemplateSpotMarketOptionsOps[Self <: LaunchTemplateSpotMarketOptions] (val x: Self) extends AnyVal {
    
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
    def setBlockDurationMinutes(value: Integer): Self = this.set("BlockDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDurationMinutes: Self = this.set("BlockDurationMinutes", js.undefined)
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = this.set("InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInterruptionBehavior: Self = this.set("InstanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setMaxPrice(value: String): Self = this.set("MaxPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPrice: Self = this.set("MaxPrice", js.undefined)
    
    @scala.inline
    def setSpotInstanceType(value: SpotInstanceType): Self = this.set("SpotInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotInstanceType: Self = this.set("SpotInstanceType", js.undefined)
    
    @scala.inline
    def setValidUntil(value: DateTime): Self = this.set("ValidUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidUntil: Self = this.set("ValidUntil", js.undefined)
  }
}
