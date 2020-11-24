package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerAttributes extends js.Object {
  
  /**
    * Information about the access log configuration for the load balancer. If the access log is enabled, the load balancer captures detailed information about all requests. It delivers the information to a specified S3 bucket.
    */
  var AccessLog: js.UndefOr[AwsElbLoadBalancerAccessLog] = js.native
  
  /**
    * Information about the connection draining configuration for the load balancer. If connection draining is enabled, the load balancer allows existing requests to complete before it shifts traffic away from a deregistered or unhealthy instance.
    */
  var ConnectionDraining: js.UndefOr[AwsElbLoadBalancerConnectionDraining] = js.native
  
  /**
    * Connection settings for the load balancer. If an idle timeout is configured, the load balancer allows connections to remain idle for the specified duration. When a connection is idle, no data is sent over the connection.
    */
  var ConnectionSettings: js.UndefOr[AwsElbLoadBalancerConnectionSettings] = js.native
  
  /**
    * Cross-zone load balancing settings for the load balancer. If cross-zone load balancing is enabled, the load balancer routes the request traffic evenly across all instances regardless of the Availability Zones.
    */
  var CrossZoneLoadBalancing: js.UndefOr[AwsElbLoadBalancerCrossZoneLoadBalancing] = js.native
}
object AwsElbLoadBalancerAttributes {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerAttributes]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerAttributesOps[Self <: AwsElbLoadBalancerAttributes] (val x: Self) extends AnyVal {
    
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
    def setAccessLog(value: AwsElbLoadBalancerAccessLog): Self = this.set("AccessLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLog: Self = this.set("AccessLog", js.undefined)
    
    @scala.inline
    def setConnectionDraining(value: AwsElbLoadBalancerConnectionDraining): Self = this.set("ConnectionDraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionDraining: Self = this.set("ConnectionDraining", js.undefined)
    
    @scala.inline
    def setConnectionSettings(value: AwsElbLoadBalancerConnectionSettings): Self = this.set("ConnectionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionSettings: Self = this.set("ConnectionSettings", js.undefined)
    
    @scala.inline
    def setCrossZoneLoadBalancing(value: AwsElbLoadBalancerCrossZoneLoadBalancing): Self = this.set("CrossZoneLoadBalancing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossZoneLoadBalancing: Self = this.set("CrossZoneLoadBalancing", js.undefined)
  }
}
