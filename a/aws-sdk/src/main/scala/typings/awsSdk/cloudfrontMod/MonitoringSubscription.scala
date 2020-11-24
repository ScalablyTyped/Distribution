package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringSubscription extends js.Object {
  
  /**
    * A subscription configuration for additional CloudWatch metrics.
    */
  var RealtimeMetricsSubscriptionConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.RealtimeMetricsSubscriptionConfig] = js.native
}
object MonitoringSubscription {
  
  @scala.inline
  def apply(): MonitoringSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringSubscription]
  }
  
  @scala.inline
  implicit class MonitoringSubscriptionOps[Self <: MonitoringSubscription] (val x: Self) extends AnyVal {
    
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
    def setRealtimeMetricsSubscriptionConfig(value: RealtimeMetricsSubscriptionConfig): Self = this.set("RealtimeMetricsSubscriptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealtimeMetricsSubscriptionConfig: Self = this.set("RealtimeMetricsSubscriptionConfig", js.undefined)
  }
}
