package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMonitoringSubscriptionResult extends js.Object {
  
  /**
    * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
    */
  var MonitoringSubscription: js.UndefOr[typings.awsSdk.cloudfrontMod.MonitoringSubscription] = js.native
}
object GetMonitoringSubscriptionResult {
  
  @scala.inline
  def apply(): GetMonitoringSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMonitoringSubscriptionResult]
  }
  
  @scala.inline
  implicit class GetMonitoringSubscriptionResultOps[Self <: GetMonitoringSubscriptionResult] (val x: Self) extends AnyVal {
    
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
    def setMonitoringSubscription(value: MonitoringSubscription): Self = this.set("MonitoringSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringSubscription: Self = this.set("MonitoringSubscription", js.undefined)
  }
}
