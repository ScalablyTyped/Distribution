package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeMetricsSubscriptionConfig extends StObject {
  
  /**
    * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
    */
  var RealtimeMetricsSubscriptionStatus: typings.awsSdk.cloudfrontMod.RealtimeMetricsSubscriptionStatus = js.native
}
object RealtimeMetricsSubscriptionConfig {
  
  @scala.inline
  def apply(RealtimeMetricsSubscriptionStatus: RealtimeMetricsSubscriptionStatus): RealtimeMetricsSubscriptionConfig = {
    val __obj = js.Dynamic.literal(RealtimeMetricsSubscriptionStatus = RealtimeMetricsSubscriptionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeMetricsSubscriptionConfig]
  }
  
  @scala.inline
  implicit class RealtimeMetricsSubscriptionConfigMutableBuilder[Self <: RealtimeMetricsSubscriptionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRealtimeMetricsSubscriptionStatus(value: RealtimeMetricsSubscriptionStatus): Self = StObject.set(x, "RealtimeMetricsSubscriptionStatus", value.asInstanceOf[js.Any])
  }
}
