package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeCacheSecurityGroupIngressMessage extends js.Object {
  /**
    * The cache security group that allows network ingress.
    */
  var CacheSecurityGroupName: String = js.native
  /**
    * The Amazon EC2 security group to be authorized for ingress to the cache security group.
    */
  var EC2SecurityGroupName: String = js.native
  /**
    * The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an AWS access key ID - you must provide a valid AWS account number for this parameter.
    */
  var EC2SecurityGroupOwnerId: String = js.native
}

object AuthorizeCacheSecurityGroupIngressMessage {
  @scala.inline
  def apply(CacheSecurityGroupName: String, EC2SecurityGroupName: String, EC2SecurityGroupOwnerId: String): AuthorizeCacheSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName.asInstanceOf[js.Any], EC2SecurityGroupName = EC2SecurityGroupName.asInstanceOf[js.Any], EC2SecurityGroupOwnerId = EC2SecurityGroupOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeCacheSecurityGroupIngressMessage]
  }
}

