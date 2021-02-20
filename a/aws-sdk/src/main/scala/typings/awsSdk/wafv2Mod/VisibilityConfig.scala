package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisibilityConfig extends StObject {
  
  /**
    * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see AWS WAF Metrics.
    */
  var CloudWatchMetricsEnabled: Boolean = js.native
  
  /**
    * A name of the CloudWatch metric. The name can contain only the characters: A-Z, a-z, 0-9, - (hyphen), and _ (underscore). The name can be from one to 128 characters long. It can't contain whitespace or metric names reserved for AWS WAF, for example "All" and "Default_Action." 
    */
  var MetricName: typings.awsSdk.wafv2Mod.MetricName = js.native
  
  /**
    * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console. 
    */
  var SampledRequestsEnabled: Boolean = js.native
}
object VisibilityConfig {
  
  @scala.inline
  def apply(CloudWatchMetricsEnabled: Boolean, MetricName: MetricName, SampledRequestsEnabled: Boolean): VisibilityConfig = {
    val __obj = js.Dynamic.literal(CloudWatchMetricsEnabled = CloudWatchMetricsEnabled.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], SampledRequestsEnabled = SampledRequestsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityConfig]
  }
  
  @scala.inline
  implicit class VisibilityConfigMutableBuilder[Self <: VisibilityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchMetricsEnabled(value: Boolean): Self = StObject.set(x, "CloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampledRequestsEnabled(value: Boolean): Self = StObject.set(x, "SampledRequestsEnabled", value.asInstanceOf[js.Any])
  }
}
