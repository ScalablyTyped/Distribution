package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerAttribute extends js.Object {
  /**
    * The name of the attribute. The following attributes are supported by both Application Load Balancers and Network Load Balancers:    access_logs.s3.enabled - Indicates whether access logs are enabled. The value is true or false. The default is false.    access_logs.s3.bucket - The name of the S3 bucket for the access logs. This attribute is required if access logs are enabled. The bucket must exist in the same region as the load balancer and have a bucket policy that grants Elastic Load Balancing permissions to write to the bucket.    access_logs.s3.prefix - The prefix for the location in the S3 bucket for the access logs.    deletion_protection.enabled - Indicates whether deletion protection is enabled. The value is true or false. The default is false.   The following attributes are supported by only Application Load Balancers:    idle_timeout.timeout_seconds - The idle timeout value, in seconds. The valid range is 1-4000 seconds. The default is 60 seconds.    routing.http.drop_invalid_header_fields.enabled - Indicates whether HTTP headers with invalid header fields are removed by the load balancer (true) or routed to targets (false). The default is false.    routing.http2.enabled - Indicates whether HTTP/2 is enabled. The value is true or false. The default is true.   The following attributes are supported by only Network Load Balancers:    load_balancing.cross_zone.enabled - Indicates whether cross-zone load balancing is enabled. The value is true or false. The default is false.  
    */
  var Key: js.UndefOr[LoadBalancerAttributeKey] = js.native
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[LoadBalancerAttributeValue] = js.native
}

object LoadBalancerAttribute {
  @scala.inline
  def apply(Key: LoadBalancerAttributeKey = null, Value: LoadBalancerAttributeValue = null): LoadBalancerAttribute = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerAttribute]
  }
}

