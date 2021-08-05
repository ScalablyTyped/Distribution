package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerAttributes extends StObject {
  
  /**
    * Information about the access log configuration for the load balancer. If the access log is enabled, the load balancer captures detailed information about all requests. It delivers the information to a specified S3 bucket.
    */
  var AccessLog: js.UndefOr[AwsElbLoadBalancerAccessLog] = js.undefined
  
  /**
    * Information about the connection draining configuration for the load balancer. If connection draining is enabled, the load balancer allows existing requests to complete before it shifts traffic away from a deregistered or unhealthy instance.
    */
  var ConnectionDraining: js.UndefOr[AwsElbLoadBalancerConnectionDraining] = js.undefined
  
  /**
    * Connection settings for the load balancer. If an idle timeout is configured, the load balancer allows connections to remain idle for the specified duration. When a connection is idle, no data is sent over the connection.
    */
  var ConnectionSettings: js.UndefOr[AwsElbLoadBalancerConnectionSettings] = js.undefined
  
  /**
    * Cross-zone load balancing settings for the load balancer. If cross-zone load balancing is enabled, the load balancer routes the request traffic evenly across all instances regardless of the Availability Zones.
    */
  var CrossZoneLoadBalancing: js.UndefOr[AwsElbLoadBalancerCrossZoneLoadBalancing] = js.undefined
}
object AwsElbLoadBalancerAttributes {
  
  inline def apply(): AwsElbLoadBalancerAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerAttributes]
  }
  
  extension [Self <: AwsElbLoadBalancerAttributes](x: Self) {
    
    inline def setAccessLog(value: AwsElbLoadBalancerAccessLog): Self = StObject.set(x, "AccessLog", value.asInstanceOf[js.Any])
    
    inline def setAccessLogUndefined: Self = StObject.set(x, "AccessLog", js.undefined)
    
    inline def setConnectionDraining(value: AwsElbLoadBalancerConnectionDraining): Self = StObject.set(x, "ConnectionDraining", value.asInstanceOf[js.Any])
    
    inline def setConnectionDrainingUndefined: Self = StObject.set(x, "ConnectionDraining", js.undefined)
    
    inline def setConnectionSettings(value: AwsElbLoadBalancerConnectionSettings): Self = StObject.set(x, "ConnectionSettings", value.asInstanceOf[js.Any])
    
    inline def setConnectionSettingsUndefined: Self = StObject.set(x, "ConnectionSettings", js.undefined)
    
    inline def setCrossZoneLoadBalancing(value: AwsElbLoadBalancerCrossZoneLoadBalancing): Self = StObject.set(x, "CrossZoneLoadBalancing", value.asInstanceOf[js.Any])
    
    inline def setCrossZoneLoadBalancingUndefined: Self = StObject.set(x, "CrossZoneLoadBalancing", js.undefined)
  }
}
