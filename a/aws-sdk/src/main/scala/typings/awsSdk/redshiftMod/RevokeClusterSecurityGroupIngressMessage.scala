package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeClusterSecurityGroupIngressMessage extends StObject {
  
  /**
    * The IP range for which to revoke access. This range must be a valid Classless Inter-Domain Routing (CIDR) block of IP addresses. If CIDRIP is specified, EC2SecurityGroupName and EC2SecurityGroupOwnerId cannot be provided. 
    */
  var CIDRIP: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the security Group from which to revoke the ingress rule.
    */
  var ClusterSecurityGroupName: String
  
  /**
    * The name of the EC2 Security Group whose access is to be revoked. If EC2SecurityGroupName is specified, EC2SecurityGroupOwnerId must also be provided and CIDRIP cannot be provided. 
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS account number of the owner of the security group specified in the EC2SecurityGroupName parameter. The AWS access key ID is not an acceptable value. If EC2SecurityGroupOwnerId is specified, EC2SecurityGroupName must also be provided. and CIDRIP cannot be provided.  Example: 111122223333 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
}
object RevokeClusterSecurityGroupIngressMessage {
  
  @scala.inline
  def apply(ClusterSecurityGroupName: String): RevokeClusterSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeClusterSecurityGroupIngressMessage]
  }
  
  @scala.inline
  implicit class RevokeClusterSecurityGroupIngressMessageMutableBuilder[Self <: RevokeClusterSecurityGroupIngressMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCIDRIP(value: String): Self = StObject.set(x, "CIDRIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCIDRIPUndefined: Self = StObject.set(x, "CIDRIP", js.undefined)
    
    @scala.inline
    def setClusterSecurityGroupName(value: String): Self = StObject.set(x, "ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupName(value: String): Self = StObject.set(x, "EC2SecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupNameUndefined: Self = StObject.set(x, "EC2SecurityGroupName", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroupOwnerId(value: String): Self = StObject.set(x, "EC2SecurityGroupOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupOwnerIdUndefined: Self = StObject.set(x, "EC2SecurityGroupOwnerId", js.undefined)
  }
}
