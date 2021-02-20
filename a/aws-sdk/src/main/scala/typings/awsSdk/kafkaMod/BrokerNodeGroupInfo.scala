package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerNodeGroupInfo extends StObject {
  
  /**
    * 
    The distribution of broker nodes across Availability Zones. This is an optional parameter. If you don't specify it, Amazon MSK gives it the value DEFAULT. You can also explicitly set this parameter to the value DEFAULT. No other values are currently allowed.
    Amazon MSK distributes the broker nodes evenly across the Availability Zones that correspond to the subnets you provide when you create the cluster.
    
    */
  var BrokerAZDistribution: js.UndefOr[typings.awsSdk.kafkaMod.BrokerAZDistribution] = js.native
  
  /**
    * 
    The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume data. Client subnets can't be in Availability Zone us-east-1e.
    
    */
  var ClientSubnets: listOfString = js.native
  
  /**
    * 
    The type of Amazon EC2 instances to use for Kafka brokers. The following instance types are allowed: kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge,
  kafka.m5.4xlarge, kafka.m5.12xlarge, and kafka.m5.24xlarge.
    
    */
  var InstanceType: stringMin5Max32 = js.native
  
  /**
    * 
    The AWS security groups to associate with the elastic network interfaces in order to specify who can connect to and communicate with the Amazon MSK cluster. If you don't specify a security group, Amazon MSK uses the default security group associated with the VPC.
    
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.native
  
  /**
    * 
    Contains information about storage volumes attached to MSK broker nodes.
    
    */
  var StorageInfo: js.UndefOr[typings.awsSdk.kafkaMod.StorageInfo] = js.native
}
object BrokerNodeGroupInfo {
  
  @scala.inline
  def apply(ClientSubnets: listOfString, InstanceType: stringMin5Max32): BrokerNodeGroupInfo = {
    val __obj = js.Dynamic.literal(ClientSubnets = ClientSubnets.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerNodeGroupInfo]
  }
  
  @scala.inline
  implicit class BrokerNodeGroupInfoMutableBuilder[Self <: BrokerNodeGroupInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerAZDistribution(value: BrokerAZDistribution): Self = StObject.set(x, "BrokerAZDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerAZDistributionUndefined: Self = StObject.set(x, "BrokerAZDistribution", js.undefined)
    
    @scala.inline
    def setClientSubnets(value: listOfString): Self = StObject.set(x, "ClientSubnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSubnetsVarargs(value: string*): Self = StObject.set(x, "ClientSubnets", js.Array(value :_*))
    
    @scala.inline
    def setInstanceType(value: stringMin5Max32): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroups(value: listOfString): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setStorageInfo(value: StorageInfo): Self = StObject.set(x, "StorageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageInfoUndefined: Self = StObject.set(x, "StorageInfo", js.undefined)
  }
}
