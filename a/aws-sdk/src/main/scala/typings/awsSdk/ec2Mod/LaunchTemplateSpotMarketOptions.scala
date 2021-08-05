package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateSpotMarketOptions extends StObject {
  
  /**
    * The required duration for the Spot Instances (also known as Spot blocks), in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.undefined
  
  /**
    * The behavior when a Spot Instance is interrupted.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.undefined
  
  /**
    * The maximum hourly price you're willing to pay for the Spot Instances.
    */
  var MaxPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The Spot Instance request type.
    */
  var SpotInstanceType: js.UndefOr[typings.awsSdk.ec2Mod.SpotInstanceType] = js.undefined
  
  /**
    * The end date of the request. For a one-time request, the request remains active until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until it is canceled or this date and time is reached.
    */
  var ValidUntil: js.UndefOr[DateTime] = js.undefined
}
object LaunchTemplateSpotMarketOptions {
  
  inline def apply(): LaunchTemplateSpotMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpotMarketOptions]
  }
  
  extension [Self <: LaunchTemplateSpotMarketOptions](x: Self) {
    
    inline def setBlockDurationMinutes(value: Integer): Self = StObject.set(x, "BlockDurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setBlockDurationMinutesUndefined: Self = StObject.set(x, "BlockDurationMinutes", js.undefined)
    
    inline def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = StObject.set(x, "InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "InstanceInterruptionBehavior", js.undefined)
    
    inline def setMaxPrice(value: String): Self = StObject.set(x, "MaxPrice", value.asInstanceOf[js.Any])
    
    inline def setMaxPriceUndefined: Self = StObject.set(x, "MaxPrice", js.undefined)
    
    inline def setSpotInstanceType(value: SpotInstanceType): Self = StObject.set(x, "SpotInstanceType", value.asInstanceOf[js.Any])
    
    inline def setSpotInstanceTypeUndefined: Self = StObject.set(x, "SpotInstanceType", js.undefined)
    
    inline def setValidUntil(value: DateTime): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
