package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAnomalySubscriptionRequest extends js.Object {
  
  /**
    *  The update to the frequency value at which subscribers will receive notifications. 
    */
  var Frequency: js.UndefOr[AnomalySubscriptionFrequency] = js.native
  
  /**
    *  A list of cost anomaly subscription ARNs. 
    */
  var MonitorArnList: js.UndefOr[Values] = js.native
  
  /**
    *  The update to the subscriber list. 
    */
  var Subscribers: js.UndefOr[typings.awsSdk.costexplorerMod.Subscribers] = js.native
  
  /**
    *  A cost anomaly subscription Amazon Resource Name (ARN). 
    */
  var SubscriptionArn: GenericString = js.native
  
  /**
    *  The subscription's new name. 
    */
  var SubscriptionName: js.UndefOr[GenericString] = js.native
  
  /**
    *  The update to the threshold value for receiving notifications. 
    */
  var Threshold: js.UndefOr[NullableNonNegativeDouble] = js.native
}
object UpdateAnomalySubscriptionRequest {
  
  @scala.inline
  def apply(SubscriptionArn: GenericString): UpdateAnomalySubscriptionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnomalySubscriptionRequest]
  }
  
  @scala.inline
  implicit class UpdateAnomalySubscriptionRequestOps[Self <: UpdateAnomalySubscriptionRequest] (val x: Self) extends AnyVal {
    
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
    def setSubscriptionArn(value: GenericString): Self = this.set("SubscriptionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequency(value: AnomalySubscriptionFrequency): Self = this.set("Frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("Frequency", js.undefined)
    
    @scala.inline
    def setMonitorArnListVarargs(value: Value*): Self = this.set("MonitorArnList", js.Array(value :_*))
    
    @scala.inline
    def setMonitorArnList(value: Values): Self = this.set("MonitorArnList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorArnList: Self = this.set("MonitorArnList", js.undefined)
    
    @scala.inline
    def setSubscribersVarargs(value: Subscriber*): Self = this.set("Subscribers", js.Array(value :_*))
    
    @scala.inline
    def setSubscribers(value: Subscribers): Self = this.set("Subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribers: Self = this.set("Subscribers", js.undefined)
    
    @scala.inline
    def setSubscriptionName(value: GenericString): Self = this.set("SubscriptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionName: Self = this.set("SubscriptionName", js.undefined)
    
    @scala.inline
    def setThreshold(value: NullableNonNegativeDouble): Self = this.set("Threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("Threshold", js.undefined)
  }
}
