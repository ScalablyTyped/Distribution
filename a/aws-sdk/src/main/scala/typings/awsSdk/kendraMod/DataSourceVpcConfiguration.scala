package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceVpcConfiguration extends StObject {
  
  /**
    * A list of identifiers of security groups within your Amazon VPC. The security groups should enable Amazon Kendra to connect to the data source.
    */
  var SecurityGroupIds: SecurityGroupIdList
  
  /**
    * A list of identifiers for subnets within your Amazon VPC. The subnets should be able to connect to each other in the VPC, and they should have outgoing access to the Internet through a NAT device.
    */
  var SubnetIds: SubnetIdList
}
object DataSourceVpcConfiguration {
  
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIdList, SubnetIds: SubnetIdList): DataSourceVpcConfiguration = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceVpcConfiguration]
  }
  
  @scala.inline
  implicit class DataSourceVpcConfigurationMutableBuilder[Self <: DataSourceVpcConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: VpcSecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}
