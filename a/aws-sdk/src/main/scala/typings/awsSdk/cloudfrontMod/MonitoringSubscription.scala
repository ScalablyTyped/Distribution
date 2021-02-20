package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringSubscription extends StObject {
  
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
  implicit class MonitoringSubscriptionMutableBuilder[Self <: MonitoringSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRealtimeMetricsSubscriptionConfig(value: RealtimeMetricsSubscriptionConfig): Self = StObject.set(x, "RealtimeMetricsSubscriptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeMetricsSubscriptionConfigUndefined: Self = StObject.set(x, "RealtimeMetricsSubscriptionConfig", js.undefined)
  }
}
