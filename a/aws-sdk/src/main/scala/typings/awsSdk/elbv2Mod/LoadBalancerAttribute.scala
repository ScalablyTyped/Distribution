package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerAttribute extends StObject {
  
  /**
    * The name of the attribute. The following attribute is supported by all load balancers:    deletion_protection.enabled - Indicates whether deletion protection is enabled. The value is true or false. The default is false.   The following attributes are supported by both Application Load Balancers and Network Load Balancers:    access_logs.s3.enabled - Indicates whether access logs are enabled. The value is true or false. The default is false.    access_logs.s3.bucket - The name of the S3 bucket for the access logs. This attribute is required if access logs are enabled. The bucket must exist in the same region as the load balancer and have a bucket policy that grants Elastic Load Balancing permissions to write to the bucket.    access_logs.s3.prefix - The prefix for the location in the S3 bucket for the access logs.   The following attributes are supported by only Application Load Balancers:    idle_timeout.timeout_seconds - The idle timeout value, in seconds. The valid range is 1-4000 seconds. The default is 60 seconds.    routing.http.desync_mitigation_mode - Determines how the load balancer handles requests that might pose a security risk to your application. The possible values are monitor, defensive, and strictest. The default is defensive.    routing.http.drop_invalid_header_fields.enabled - Indicates whether HTTP headers with invalid header fields are removed by the load balancer (true) or routed to targets (false). The default is false.    routing.http2.enabled - Indicates whether HTTP/2 is enabled. The value is true or false. The default is true. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens.    waf.fail_open.enabled - Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is unable to forward the request to AWS WAF. The value is true or false. The default is false.   The following attribute is supported by Network Load Balancers and Gateway Load Balancers:    load_balancing.cross_zone.enabled - Indicates whether cross-zone load balancing is enabled. The value is true or false. The default is false.  
    */
  var Key: js.UndefOr[LoadBalancerAttributeKey] = js.native
  
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[LoadBalancerAttributeValue] = js.native
}
object LoadBalancerAttribute {
  
  @scala.inline
  def apply(): LoadBalancerAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerAttribute]
  }
  
  @scala.inline
  implicit class LoadBalancerAttributeMutableBuilder[Self <: LoadBalancerAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: LoadBalancerAttributeKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValue(value: LoadBalancerAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
