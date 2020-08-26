package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerAttributes extends js.Object {
  /**
    * If enabled, the load balancer captures detailed information of all requests and delivers the information to the Amazon S3 bucket that you specify. For more information, see Enable Access Logs in the Classic Load Balancers Guide.
    */
  var AccessLog: js.UndefOr[typings.awsSdk.elbMod.AccessLog] = js.native
  /**
    * This parameter is reserved.
    */
  var AdditionalAttributes: js.UndefOr[typings.awsSdk.elbMod.AdditionalAttributes] = js.native
  /**
    * If enabled, the load balancer allows existing requests to complete before the load balancer shifts traffic away from a deregistered or unhealthy instance. For more information, see Configure Connection Draining in the Classic Load Balancers Guide.
    */
  var ConnectionDraining: js.UndefOr[typings.awsSdk.elbMod.ConnectionDraining] = js.native
  /**
    * If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection) for the specified duration. By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and back-end connections of your load balancer. For more information, see Configure Idle Connection Timeout in the Classic Load Balancers Guide.
    */
  var ConnectionSettings: js.UndefOr[typings.awsSdk.elbMod.ConnectionSettings] = js.native
  /**
    * If enabled, the load balancer routes the request traffic evenly across all instances regardless of the Availability Zones. For more information, see Configure Cross-Zone Load Balancing in the Classic Load Balancers Guide.
    */
  var CrossZoneLoadBalancing: js.UndefOr[typings.awsSdk.elbMod.CrossZoneLoadBalancing] = js.native
}

object LoadBalancerAttributes {
  @scala.inline
  def apply(): LoadBalancerAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerAttributes]
  }
  @scala.inline
  implicit class LoadBalancerAttributesOps[Self <: LoadBalancerAttributes] (val x: Self) extends AnyVal {
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
    def setAccessLog(value: AccessLog): Self = this.set("AccessLog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessLog: Self = this.set("AccessLog", js.undefined)
    @scala.inline
    def setAdditionalAttributesVarargs(value: AdditionalAttribute*): Self = this.set("AdditionalAttributes", js.Array(value :_*))
    @scala.inline
    def setAdditionalAttributes(value: AdditionalAttributes): Self = this.set("AdditionalAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalAttributes: Self = this.set("AdditionalAttributes", js.undefined)
    @scala.inline
    def setConnectionDraining(value: ConnectionDraining): Self = this.set("ConnectionDraining", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionDraining: Self = this.set("ConnectionDraining", js.undefined)
    @scala.inline
    def setConnectionSettings(value: ConnectionSettings): Self = this.set("ConnectionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionSettings: Self = this.set("ConnectionSettings", js.undefined)
    @scala.inline
    def setCrossZoneLoadBalancing(value: CrossZoneLoadBalancing): Self = this.set("CrossZoneLoadBalancing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossZoneLoadBalancing: Self = this.set("CrossZoneLoadBalancing", js.undefined)
  }
  
}

