package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetGroupAttribute extends StObject {
  
  /**
    * The name of the attribute. The following attribute is supported by all load balancers:    deregistration_delay.timeout_seconds - The amount of time, in seconds, for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds. If the target is a Lambda function, this attribute is not supported.   The following attributes are supported by both Application Load Balancers and Network Load Balancers:    stickiness.enabled - Indicates whether sticky sessions are enabled. The value is true or false. The default is false.    stickiness.type - The type of sticky sessions. The possible values are lb_cookie for Application Load Balancers or source_ip for Network Load Balancers.   The following attributes are supported only if the load balancer is an Application Load Balancer and the target is an instance or an IP address:    load_balancing.algorithm.type - The load balancing algorithm determines how the load balancer selects targets when routing requests. The value is round_robin or least_outstanding_requests. The default is round_robin.    slow_start.duration_seconds - The time period, in seconds, during which a newly registered target receives an increasing share of the traffic to the target group. After this time period ends, the target receives its full share of traffic. The range is 30-900 seconds (15 minutes). The default is 0 seconds (disabled).    stickiness.lb_cookie.duration_seconds - The time period, in seconds, during which requests from a client should be routed to the same target. After this time period expires, the load balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).   The following attribute is supported only if the load balancer is an Application Load Balancer and the target is a Lambda function:    lambda.multi_value_headers.enabled - Indicates whether the request and response headers that are exchanged between the load balancer and the Lambda function include arrays of values or strings. The value is true or false. The default is false. If the value is false and the request contains a duplicate header field name or query parameter key, the load balancer uses the last value sent by the client.   The following attributes are supported only by Network Load Balancers:    deregistration_delay.connection_termination.enabled - Indicates whether the load balancer terminates connections at the end of the deregistration timeout. The value is true or false. The default is false.    proxy_protocol_v2.enabled - Indicates whether Proxy Protocol version 2 is enabled. The value is true or false. The default is false.  
    */
  var Key: js.UndefOr[TargetGroupAttributeKey] = js.undefined
  
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[TargetGroupAttributeValue] = js.undefined
}
object TargetGroupAttribute {
  
  @scala.inline
  def apply(): TargetGroupAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupAttribute]
  }
  
  @scala.inline
  implicit class TargetGroupAttributeMutableBuilder[Self <: TargetGroupAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: TargetGroupAttributeKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValue(value: TargetGroupAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
