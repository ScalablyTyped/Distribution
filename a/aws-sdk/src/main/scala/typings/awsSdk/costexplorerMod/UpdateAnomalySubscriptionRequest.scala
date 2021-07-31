package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnomalySubscriptionRequest extends StObject {
  
  /**
    *  The update to the frequency value at which subscribers will receive notifications. 
    */
  var Frequency: js.UndefOr[AnomalySubscriptionFrequency] = js.undefined
  
  /**
    *  A list of cost anomaly subscription ARNs. 
    */
  var MonitorArnList: js.UndefOr[Values] = js.undefined
  
  /**
    *  The update to the subscriber list. 
    */
  var Subscribers: js.UndefOr[typings.awsSdk.costexplorerMod.Subscribers] = js.undefined
  
  /**
    *  A cost anomaly subscription Amazon Resource Name (ARN). 
    */
  var SubscriptionArn: GenericString
  
  /**
    *  The subscription's new name. 
    */
  var SubscriptionName: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  The update to the threshold value for receiving notifications. 
    */
  var Threshold: js.UndefOr[NullableNonNegativeDouble] = js.undefined
}
object UpdateAnomalySubscriptionRequest {
  
  @scala.inline
  def apply(SubscriptionArn: GenericString): UpdateAnomalySubscriptionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnomalySubscriptionRequest]
  }
  
  @scala.inline
  implicit class UpdateAnomalySubscriptionRequestMutableBuilder[Self <: UpdateAnomalySubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: AnomalySubscriptionFrequency): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
    
    @scala.inline
    def setMonitorArnList(value: Values): Self = StObject.set(x, "MonitorArnList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorArnListUndefined: Self = StObject.set(x, "MonitorArnList", js.undefined)
    
    @scala.inline
    def setMonitorArnListVarargs(value: Value*): Self = StObject.set(x, "MonitorArnList", js.Array(value :_*))
    
    @scala.inline
    def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersUndefined: Self = StObject.set(x, "Subscribers", js.undefined)
    
    @scala.inline
    def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptionArn(value: GenericString): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionName(value: GenericString): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNameUndefined: Self = StObject.set(x, "SubscriptionName", js.undefined)
    
    @scala.inline
    def setThreshold(value: NullableNonNegativeDouble): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
  }
}
