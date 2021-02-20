package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticLoadBalancer extends StObject {
  
  /**
    * A list of Availability Zones.
    */
  var AvailabilityZones: js.UndefOr[Strings] = js.native
  
  /**
    * The instance's public DNS name.
    */
  var DnsName: js.UndefOr[String] = js.native
  
  /**
    * A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
    */
  var Ec2InstanceIds: js.UndefOr[Strings] = js.native
  
  /**
    * The Elastic Load Balancing instance's name.
    */
  var ElasticLoadBalancerName: js.UndefOr[String] = js.native
  
  /**
    * The ID of the layer that the instance is attached to.
    */
  var LayerId: js.UndefOr[String] = js.native
  
  /**
    * The instance's AWS region.
    */
  var Region: js.UndefOr[String] = js.native
  
  /**
    * The ID of the stack that the instance is associated with.
    */
  var StackId: js.UndefOr[String] = js.native
  
  /**
    * A list of subnet IDs, if the stack is running in a VPC.
    */
  var SubnetIds: js.UndefOr[Strings] = js.native
  
  /**
    * The VPC ID.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object ElasticLoadBalancer {
  
  @scala.inline
  def apply(): ElasticLoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticLoadBalancer]
  }
  
  @scala.inline
  implicit class ElasticLoadBalancerMutableBuilder[Self <: ElasticLoadBalancer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: Strings): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setDnsName(value: String): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    @scala.inline
    def setEc2InstanceIds(value: Strings): Self = StObject.set(x, "Ec2InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2InstanceIdsUndefined: Self = StObject.set(x, "Ec2InstanceIds", js.undefined)
    
    @scala.inline
    def setEc2InstanceIdsVarargs(value: String*): Self = StObject.set(x, "Ec2InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setElasticLoadBalancerName(value: String): Self = StObject.set(x, "ElasticLoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticLoadBalancerNameUndefined: Self = StObject.set(x, "ElasticLoadBalancerName", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "LayerId", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: Strings): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
