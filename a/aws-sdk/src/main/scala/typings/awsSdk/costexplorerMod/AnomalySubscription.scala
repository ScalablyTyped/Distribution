package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalySubscription extends StObject {
  
  /**
    *  Your unique account identifier. 
    */
  var AccountId: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  The frequency at which anomaly reports are sent over email. 
    */
  var Frequency: AnomalySubscriptionFrequency
  
  /**
    *  A list of cost anomaly monitors. 
    */
  var MonitorArnList: Values
  
  /**
    *  A list of subscribers to notify. 
    */
  var Subscribers: typings.awsSdk.costexplorerMod.Subscribers
  
  /**
    *  The AnomalySubscription Amazon Resource Name (ARN). 
    */
  var SubscriptionArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  The name for the subscription. 
    */
  var SubscriptionName: GenericString
  
  /**
    *  The dollar value that triggers a notification if the threshold is exceeded. 
    */
  var Threshold: NullableNonNegativeDouble
}
object AnomalySubscription {
  
  @scala.inline
  def apply(
    Frequency: AnomalySubscriptionFrequency,
    MonitorArnList: Values,
    Subscribers: Subscribers,
    SubscriptionName: GenericString,
    Threshold: NullableNonNegativeDouble
  ): AnomalySubscription = {
    val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any], MonitorArnList = MonitorArnList.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalySubscription]
  }
  
  @scala.inline
  implicit class AnomalySubscriptionMutableBuilder[Self <: AnomalySubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: GenericString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setFrequency(value: AnomalySubscriptionFrequency): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorArnList(value: Values): Self = StObject.set(x, "MonitorArnList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorArnListVarargs(value: Value*): Self = StObject.set(x, "MonitorArnList", js.Array(value :_*))
    
    @scala.inline
    def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptionArn(value: GenericString): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionArnUndefined: Self = StObject.set(x, "SubscriptionArn", js.undefined)
    
    @scala.inline
    def setSubscriptionName(value: GenericString): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: NullableNonNegativeDouble): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
  }
}
