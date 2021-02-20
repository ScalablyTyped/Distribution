package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerAttributes extends StObject {
  
  /**
    * If enabled, the load balancer captures detailed information of all requests and delivers the information to the Amazon S3 bucket that you specify. For more information, see Enable Access Logs in the Classic Load Balancers Guide.
    */
  var AccessLog: js.UndefOr[typings.awsSdk.elbMod.AccessLog] = js.native
  
  /**
    * Any additional attributes.
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
  implicit class LoadBalancerAttributesMutableBuilder[Self <: LoadBalancerAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLog(value: AccessLog): Self = StObject.set(x, "AccessLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLogUndefined: Self = StObject.set(x, "AccessLog", js.undefined)
    
    @scala.inline
    def setAdditionalAttributes(value: AdditionalAttributes): Self = StObject.set(x, "AdditionalAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalAttributesUndefined: Self = StObject.set(x, "AdditionalAttributes", js.undefined)
    
    @scala.inline
    def setAdditionalAttributesVarargs(value: AdditionalAttribute*): Self = StObject.set(x, "AdditionalAttributes", js.Array(value :_*))
    
    @scala.inline
    def setConnectionDraining(value: ConnectionDraining): Self = StObject.set(x, "ConnectionDraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionDrainingUndefined: Self = StObject.set(x, "ConnectionDraining", js.undefined)
    
    @scala.inline
    def setConnectionSettings(value: ConnectionSettings): Self = StObject.set(x, "ConnectionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionSettingsUndefined: Self = StObject.set(x, "ConnectionSettings", js.undefined)
    
    @scala.inline
    def setCrossZoneLoadBalancing(value: CrossZoneLoadBalancing): Self = StObject.set(x, "CrossZoneLoadBalancing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossZoneLoadBalancingUndefined: Self = StObject.set(x, "CrossZoneLoadBalancing", js.undefined)
  }
}
