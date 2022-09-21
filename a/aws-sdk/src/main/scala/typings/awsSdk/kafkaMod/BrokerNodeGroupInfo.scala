package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerNodeGroupInfo extends StObject {
  
  /**
    * 
    The distribution of broker nodes across Availability Zones. This is an optional parameter. If you don't specify it, Amazon MSK gives it the value DEFAULT. You can also explicitly set this parameter to the value DEFAULT. No other values are currently allowed.
    Amazon MSK distributes the broker nodes evenly across the Availability Zones that correspond to the subnets you provide when you create the cluster.
    
    */
  var BrokerAZDistribution: js.UndefOr[typings.awsSdk.kafkaMod.BrokerAZDistribution] = js.undefined
  
  /**
    * 
    The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume data. Client subnets can't occupy the Availability Zone with ID use use1-az3.
    
    */
  var ClientSubnets: listOfString
  
  /**
    * 
    Information about the broker access configuration.
    
    */
  var ConnectivityInfo: js.UndefOr[typings.awsSdk.kafkaMod.ConnectivityInfo] = js.undefined
  
  /**
    * 
    The type of Amazon EC2 instances to use for Apache Kafka brokers. The following instance types are allowed: kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge,
  kafka.m5.4xlarge, kafka.m5.12xlarge, and kafka.m5.24xlarge.
    
    */
  var InstanceType: stringMin5Max32
  
  /**
    * 
    The AWS security groups to associate with the elastic network interfaces in order to specify who can connect to and communicate with the Amazon MSK cluster. If you don't specify a security group, Amazon MSK uses the default security group associated with the VPC.
    
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * 
    Contains information about storage volumes attached to MSK broker nodes.
    
    */
  var StorageInfo: js.UndefOr[typings.awsSdk.kafkaMod.StorageInfo] = js.undefined
}
object BrokerNodeGroupInfo {
  
  inline def apply(ClientSubnets: listOfString, InstanceType: stringMin5Max32): BrokerNodeGroupInfo = {
    val __obj = js.Dynamic.literal(ClientSubnets = ClientSubnets.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerNodeGroupInfo]
  }
  
  extension [Self <: BrokerNodeGroupInfo](x: Self) {
    
    inline def setBrokerAZDistribution(value: BrokerAZDistribution): Self = StObject.set(x, "BrokerAZDistribution", value.asInstanceOf[js.Any])
    
    inline def setBrokerAZDistributionUndefined: Self = StObject.set(x, "BrokerAZDistribution", js.undefined)
    
    inline def setClientSubnets(value: listOfString): Self = StObject.set(x, "ClientSubnets", value.asInstanceOf[js.Any])
    
    inline def setClientSubnetsVarargs(value: string*): Self = StObject.set(x, "ClientSubnets", js.Array(value*))
    
    inline def setConnectivityInfo(value: ConnectivityInfo): Self = StObject.set(x, "ConnectivityInfo", value.asInstanceOf[js.Any])
    
    inline def setConnectivityInfoUndefined: Self = StObject.set(x, "ConnectivityInfo", js.undefined)
    
    inline def setInstanceType(value: stringMin5Max32): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroups(value: listOfString): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setStorageInfo(value: StorageInfo): Self = StObject.set(x, "StorageInfo", value.asInstanceOf[js.Any])
    
    inline def setStorageInfoUndefined: Self = StObject.set(x, "StorageInfo", js.undefined)
  }
}
