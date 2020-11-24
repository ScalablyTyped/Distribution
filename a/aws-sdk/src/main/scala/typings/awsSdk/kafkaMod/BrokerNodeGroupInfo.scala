package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerNodeGroupInfo extends js.Object {
  
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
  implicit class BrokerNodeGroupInfoOps[Self <: BrokerNodeGroupInfo] (val x: Self) extends AnyVal {
    
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
    def setClientSubnetsVarargs(value: string*): Self = this.set("ClientSubnets", js.Array(value :_*))
    
    @scala.inline
    def setClientSubnets(value: listOfString): Self = this.set("ClientSubnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: stringMin5Max32): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerAZDistribution(value: BrokerAZDistribution): Self = this.set("BrokerAZDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerAZDistribution: Self = this.set("BrokerAZDistribution", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: string*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: listOfString): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    
    @scala.inline
    def setStorageInfo(value: StorageInfo): Self = this.set("StorageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageInfo: Self = this.set("StorageInfo", js.undefined)
  }
}
