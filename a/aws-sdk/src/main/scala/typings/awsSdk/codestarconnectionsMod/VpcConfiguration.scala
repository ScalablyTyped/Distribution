package typings.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfiguration extends StObject {
  
  /**
    * The ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var SecurityGroupIds: typings.awsSdk.codestarconnectionsMod.SecurityGroupIds
  
  /**
    * The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var SubnetIds: typings.awsSdk.codestarconnectionsMod.SubnetIds
  
  /**
    * The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your provider type is installed.
    */
  var TlsCertificate: js.UndefOr[typings.awsSdk.codestarconnectionsMod.TlsCertificate] = js.undefined
  
  /**
    * The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var VpcId: typings.awsSdk.codestarconnectionsMod.VpcId
}
object VpcConfiguration {
  
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds, VpcId: VpcId): VpcConfiguration = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfiguration]
  }
  
  @scala.inline
  implicit class VpcConfigurationMutableBuilder[Self <: VpcConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTlsCertificate(value: TlsCertificate): Self = StObject.set(x, "TlsCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsCertificateUndefined: Self = StObject.set(x, "TlsCertificate", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
