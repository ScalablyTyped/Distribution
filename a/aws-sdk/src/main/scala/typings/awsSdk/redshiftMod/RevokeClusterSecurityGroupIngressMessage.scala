package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeClusterSecurityGroupIngressMessage extends js.Object {
  /**
    * The IP range for which to revoke access. This range must be a valid Classless Inter-Domain Routing (CIDR) block of IP addresses. If CIDRIP is specified, EC2SecurityGroupName and EC2SecurityGroupOwnerId cannot be provided. 
    */
  var CIDRIP: js.UndefOr[String] = js.native
  /**
    * The name of the security Group from which to revoke the ingress rule.
    */
  var ClusterSecurityGroupName: String = js.native
  /**
    * The name of the EC2 Security Group whose access is to be revoked. If EC2SecurityGroupName is specified, EC2SecurityGroupOwnerId must also be provided and CIDRIP cannot be provided. 
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The AWS account number of the owner of the security group specified in the EC2SecurityGroupName parameter. The AWS access key ID is not an acceptable value. If EC2SecurityGroupOwnerId is specified, EC2SecurityGroupName must also be provided. and CIDRIP cannot be provided.  Example: 111122223333 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
}

object RevokeClusterSecurityGroupIngressMessage {
  @scala.inline
  def apply(ClusterSecurityGroupName: String): RevokeClusterSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeClusterSecurityGroupIngressMessage]
  }
  @scala.inline
  implicit class RevokeClusterSecurityGroupIngressMessageOps[Self <: RevokeClusterSecurityGroupIngressMessage] (val x: Self) extends AnyVal {
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

