package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibilityConfig extends StObject {
  
  /**
    * A boolean indicating whether the associated resource sends metrics to Amazon CloudWatch. For the list of available metrics, see WAF Metrics.
    */
  var CloudWatchMetricsEnabled: Boolean
  
  /**
    * A name of the Amazon CloudWatch metric. The name can contain only the characters: A-Z, a-z, 0-9, - (hyphen), and _ (underscore). The name can be from one to 128 characters long. It can't contain whitespace or metric names reserved for WAF, for example All and Default_Action. 
    */
  var MetricName: typings.awsSdk.clientsWafv2Mod.MetricName
  
  /**
    * A boolean indicating whether WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the WAF console. 
    */
  var SampledRequestsEnabled: Boolean
}
object VisibilityConfig {
  
  inline def apply(CloudWatchMetricsEnabled: Boolean, MetricName: MetricName, SampledRequestsEnabled: Boolean): VisibilityConfig = {
    val __obj = js.Dynamic.literal(CloudWatchMetricsEnabled = CloudWatchMetricsEnabled.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], SampledRequestsEnabled = SampledRequestsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityConfig]
  }
  
  extension [Self <: VisibilityConfig](x: Self) {
    
    inline def setCloudWatchMetricsEnabled(value: Boolean): Self = StObject.set(x, "CloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setSampledRequestsEnabled(value: Boolean): Self = StObject.set(x, "SampledRequestsEnabled", value.asInstanceOf[js.Any])
  }
}
