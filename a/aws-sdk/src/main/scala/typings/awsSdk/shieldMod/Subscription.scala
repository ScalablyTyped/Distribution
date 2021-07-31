package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /**
    * If ENABLED, the subscription will be automatically renewed at the end of the existing subscription period. When you initally create a subscription, AutoRenew is set to ENABLED. You can change this by submitting an UpdateSubscription request. If the UpdateSubscription request does not included a value for AutoRenew, the existing value for AutoRenew remains unchanged.
    */
  var AutoRenew: js.UndefOr[typings.awsSdk.shieldMod.AutoRenew] = js.undefined
  
  /**
    * The date and time your subscription will end.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Specifies how many protections of a given type you can create.
    */
  var Limits: js.UndefOr[typings.awsSdk.shieldMod.Limits] = js.undefined
  
  /**
    * If ENABLED, the DDoS Response Team (DRT) will use email and phone to notify contacts about escalations to the DRT and to initiate proactive customer support. If PENDING, you have requested proactive engagement and the request is pending. The status changes to ENABLED when your request is fully processed. If DISABLED, the DRT will not proactively notify contacts about escalations or to initiate proactive customer support. 
    */
  var ProactiveEngagementStatus: js.UndefOr[typings.awsSdk.shieldMod.ProactiveEngagementStatus] = js.undefined
  
  /**
    * The start time of the subscription, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Limits settings for your subscription. 
    */
  var SubscriptionLimits: typings.awsSdk.shieldMod.SubscriptionLimits
  
  /**
    * The length, in seconds, of the AWS Shield Advanced subscription for the account.
    */
  var TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds] = js.undefined
}
object Subscription {
  
  @scala.inline
  def apply(SubscriptionLimits: SubscriptionLimits): Subscription = {
    val __obj = js.Dynamic.literal(SubscriptionLimits = SubscriptionLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRenew(value: AutoRenew): Self = StObject.set(x, "AutoRenew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRenewUndefined: Self = StObject.set(x, "AutoRenew", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setLimits(value: Limits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
    
    @scala.inline
    def setLimitsVarargs(value: Limit*): Self = StObject.set(x, "Limits", js.Array(value :_*))
    
    @scala.inline
    def setProactiveEngagementStatus(value: ProactiveEngagementStatus): Self = StObject.set(x, "ProactiveEngagementStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProactiveEngagementStatusUndefined: Self = StObject.set(x, "ProactiveEngagementStatus", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setSubscriptionLimits(value: SubscriptionLimits): Self = StObject.set(x, "SubscriptionLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCommitmentInSeconds(value: DurationInSeconds): Self = StObject.set(x, "TimeCommitmentInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCommitmentInSecondsUndefined: Self = StObject.set(x, "TimeCommitmentInSeconds", js.undefined)
  }
}
