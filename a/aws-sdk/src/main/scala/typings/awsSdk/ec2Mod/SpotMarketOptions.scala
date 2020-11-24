package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotMarketOptions extends js.Object {
  
  /**
    * The required duration for the Spot Instances (also known as Spot blocks), in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360). The duration period starts as soon as your Spot Instance receives its instance ID. At the end of the duration period, Amazon EC2 marks the Spot Instance for termination and provides a Spot Instance termination notice, which gives the instance a two-minute warning before it terminates. You can't specify an Availability Zone group or a launch group if you specify a duration. New accounts or accounts with no previous billing history with AWS are not eligible for Spot Instances with a defined duration (also known as Spot blocks).
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.native
  
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.native
  
  /**
    * The maximum hourly price you're willing to pay for the Spot Instances. The default is the On-Demand price.
    */
  var MaxPrice: js.UndefOr[String] = js.native
  
  /**
    * The Spot Instance request type. For RunInstances, persistent Spot Instance requests are only supported when InstanceInterruptionBehavior is set to either hibernate or stop.
    */
  var SpotInstanceType: js.UndefOr[typings.awsSdk.ec2Mod.SpotInstanceType] = js.native
  
  /**
    * The end date of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ). Supported only for persistent requests.   For a persistent request, the request remains active until the ValidUntil date and time is reached. Otherwise, the request remains active until you cancel it.   For a one-time request, ValidUntil is not supported. The request remains active until all instances launch or you cancel the request.  
    */
  var ValidUntil: js.UndefOr[DateTime] = js.native
}
object SpotMarketOptions {
  
  @scala.inline
  def apply(): SpotMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotMarketOptions]
  }
  
  @scala.inline
  implicit class SpotMarketOptionsOps[Self <: SpotMarketOptions] (val x: Self) extends AnyVal {
    
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
