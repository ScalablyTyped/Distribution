package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpotDatafeedSubscriptionResult extends StObject {
  
  /**
    * The Spot Instance data feed subscription.
    */
  var SpotDatafeedSubscription: js.UndefOr[typings.awsSdk.ec2Mod.SpotDatafeedSubscription] = js.undefined
}
object DescribeSpotDatafeedSubscriptionResult {
  
  inline def apply(): DescribeSpotDatafeedSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotDatafeedSubscriptionResult]
  }
  
  extension [Self <: DescribeSpotDatafeedSubscriptionResult](x: Self) {
    
    inline def setSpotDatafeedSubscription(value: SpotDatafeedSubscription): Self = StObject.set(x, "SpotDatafeedSubscription", value.asInstanceOf[js.Any])
    
    inline def setSpotDatafeedSubscriptionUndefined: Self = StObject.set(x, "SpotDatafeedSubscription", js.undefined)
  }
}
