package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeClusterSecurityGroupIngressMessage extends js.Object {
  
  /**
    * The IP range to be added the Amazon Redshift security group.
    */
  var CIDRIP: js.UndefOr[String] = js.native
  
  /**
    * The name of the security group to which the ingress rule is added.
    */
  var ClusterSecurityGroupName: String = js.native
  
  /**
    * The EC2 security group to be added the Amazon Redshift security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    * The AWS account number of the owner of the security group specified by the EC2SecurityGroupName parameter. The AWS Access Key ID is not an acceptable value.  Example: 111122223333 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
}
object AuthorizeClusterSecurityGroupIngressMessage {
  
  @scala.inline
  def apply(ClusterSecurityGroupName: String): AuthorizeClusterSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeClusterSecurityGroupIngressMessage]
  }
  
  @scala.inline
  implicit class AuthorizeClusterSecurityGroupIngressMessageOps[Self <: AuthorizeClusterSecurityGroupIngressMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterSecurityGroupName(value: String): Self = this.set("ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCIDRIP(value: String): Self = this.set("CIDRIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCIDRIP: Self = this.set("CIDRIP", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroupName(value: String): Self = this.set("EC2SecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEC2SecurityGroupName: Self = this.set("EC2SecurityGroupName", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroupOwnerId(value: String): Self = this.set("EC2SecurityGroupOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEC2SecurityGroupOwnerId: Self = this.set("EC2SecurityGroupOwnerId", js.undefined)
  }
}
