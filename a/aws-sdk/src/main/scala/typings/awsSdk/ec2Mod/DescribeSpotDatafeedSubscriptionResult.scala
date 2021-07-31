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
  
  @scala.inline
  def apply(): DescribeSpotDatafeedSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotDatafeedSubscriptionResult]
  }
  
  @scala.inline
  implicit class DescribeSpotDatafeedSubscriptionResultMutableBuilder[Self <: DescribeSpotDatafeedSubscriptionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpotDatafeedSubscription(value: SpotDatafeedSubscription): Self = StObject.set(x, "SpotDatafeedSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotDatafeedSubscriptionUndefined: Self = StObject.set(x, "SpotDatafeedSubscription", js.undefined)
  }
}
