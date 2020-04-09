package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibilityConfig extends js.Object {
  /**
    * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see AWS WAF Metrics.
    */
  var CloudWatchMetricsEnabled: Boolean = js.native
  /**
    * A name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS WAF, for example "All" and "Default_Action." You can't change a MetricName after you create a VisibilityConfig.
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
}

