package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeDBSecurityGroupIngressMessage extends StObject {
  
  /**
    *  The IP range to revoke access from. Must be a valid CIDR range. If CIDRIP is specified, EC2SecurityGroupName, EC2SecurityGroupId and EC2SecurityGroupOwnerId can't be provided. 
    */
  var CIDRIP: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB security group to revoke ingress from.
    */
  var DBSecurityGroupName: String
  
  /**
    *  The id of the EC2 security group to revoke access from. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
    */
  var EC2SecurityGroupId: js.UndefOr[String] = js.undefined
  
  /**
    *  The name of the EC2 security group to revoke access from. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    *  The AWS account number of the owner of the EC2 security group specified in the EC2SecurityGroupName parameter. The AWS access key ID isn't an acceptable value. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
}
object RevokeDBSecurityGroupIngressMessage {
  
  @scala.inline
  def apply(DBSecurityGroupName: String): RevokeDBSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(DBSecurityGroupName = DBSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeDBSecurityGroupIngressMessage]
  }
  
  @scala.inline
  implicit class RevokeDBSecurityGroupIngressMessageMutableBuilder[Self <: RevokeDBSecurityGroupIngressMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCIDRIP(value: String): Self = StObject.set(x, "CIDRIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCIDRIPUndefined: Self = StObject.set(x, "CIDRIP", js.undefined)
    
    @scala.inline
    def setDBSecurityGroupName(value: String): Self = StObject.set(x, "DBSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupId(value: String): Self = StObject.set(x, "EC2SecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupIdUndefined: Self = StObject.set(x, "EC2SecurityGroupId", js.undefined)
    
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
