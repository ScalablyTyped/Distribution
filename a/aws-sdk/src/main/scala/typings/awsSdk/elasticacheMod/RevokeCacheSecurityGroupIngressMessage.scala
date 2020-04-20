package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeCacheSecurityGroupIngressMessage extends js.Object {
  /**
    * The name of the cache security group to revoke ingress from.
    */
  var CacheSecurityGroupName: String = js.native
  /**
    * The name of the Amazon EC2 security group to revoke access from.
    */
  var EC2SecurityGroupName: String = js.native
  /**
    * The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an AWS access key ID - you must provide a valid AWS account number for this parameter.
    */
  var EC2SecurityGroupOwnerId: String = js.native
}

object RevokeCacheSecurityGroupIngressMessage {
  @scala.inline
  def apply(CacheSecurityGroupName: String, EC2SecurityGroupName: String, EC2SecurityGroupOwnerId: String): RevokeCacheSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName.asInstanceOf[js.Any], EC2SecurityGroupName = EC2SecurityGroupName.asInstanceOf[js.Any], EC2SecurityGroupOwnerId = EC2SecurityGroupOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeCacheSecurityGroupIngressMessage]
  }
}

