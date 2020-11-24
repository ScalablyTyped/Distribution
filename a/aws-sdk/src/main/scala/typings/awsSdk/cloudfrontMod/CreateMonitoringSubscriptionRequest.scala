package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMonitoringSubscriptionRequest extends js.Object {
  
  /**
    * The ID of the distribution that you are enabling metrics for.
    */
  var DistributionId: String = js.native
  
  /**
    * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
    */
  var MonitoringSubscription: typings.awsSdk.cloudfrontMod.MonitoringSubscription = js.native
}
object CreateMonitoringSubscriptionRequest {
  
  @scala.inline
  def apply(DistributionId: String, MonitoringSubscription: MonitoringSubscription): CreateMonitoringSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any], MonitoringSubscription = MonitoringSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMonitoringSubscriptionRequest]
  }
  
  @scala.inline
  implicit class CreateMonitoringSubscriptionRequestOps[Self <: CreateMonitoringSubscriptionRequest] (val x: Self) extends AnyVal {
    
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
    def setDistributionId(value: String): Self = this.set("DistributionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringSubscription(value: MonitoringSubscription): Self = this.set("MonitoringSubscription", value.asInstanceOf[js.Any])
  }
}
