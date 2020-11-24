package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnomalySubscription extends js.Object {
  
  /**
    *  Your unique account identifier. 
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  
  /**
    *  The frequency at which anomaly reports are sent over email. 
    */
  var Frequency: AnomalySubscriptionFrequency = js.native
  
  /**
    *  A list of cost anomaly monitors. 
    */
  var MonitorArnList: Values = js.native
  
  /**
    *  A list of subscribers to notify. 
    */
  var Subscribers: typings.awsSdk.costexplorerMod.Subscribers = js.native
  
  /**
    *  The AnomalySubscription Amazon Resource Name (ARN). 
    */
  var SubscriptionArn: js.UndefOr[GenericString] = js.native
  
  /**
    *  The name for the subscription. 
    */
  var SubscriptionName: GenericString = js.native
  
  /**
    *  The dollar value that triggers a notification if the threshold is exceeded. 
    */
  var Threshold: NullableNonNegativeDouble = js.native
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
  implicit class AnomalySubscriptionOps[Self <: AnomalySubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFrequency(value: AnomalySubscriptionFrequency): Self = this.set("Frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorArnListVarargs(value: Value*): Self = this.set("MonitorArnList", js.Array(value :_*))
    
    @scala.inline
    def setMonitorArnList(value: Values): Self = this.set("MonitorArnList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersVarargs(value: Subscriber*): Self = this.set("Subscribers", js.Array(value :_*))
    
    @scala.inline
    def setSubscribers(value: Subscribers): Self = this.set("Subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionName(value: GenericString): Self = this.set("SubscriptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: NullableNonNegativeDouble): Self = this.set("Threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountId(value: GenericString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setSubscriptionArn(value: GenericString): Self = this.set("SubscriptionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionArn: Self = this.set("SubscriptionArn", js.undefined)
  }
}
