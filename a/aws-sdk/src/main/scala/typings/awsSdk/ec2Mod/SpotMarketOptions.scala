package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotMarketOptions extends StObject {
  
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
  implicit class SpotMarketOptionsMutableBuilder[Self <: SpotMarketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockDurationMinutes(value: Integer): Self = StObject.set(x, "BlockDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDurationMinutesUndefined: Self = StObject.set(x, "BlockDurationMinutes", js.undefined)
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = StObject.set(x, "InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "InstanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setMaxPrice(value: String): Self = StObject.set(x, "MaxPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPriceUndefined: Self = StObject.set(x, "MaxPrice", js.undefined)
    
    @scala.inline
    def setSpotInstanceType(value: SpotInstanceType): Self = StObject.set(x, "SpotInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstanceTypeUndefined: Self = StObject.set(x, "SpotInstanceType", js.undefined)
    
    @scala.inline
    def setValidUntil(value: DateTime): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
