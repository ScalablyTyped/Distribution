package typings.awsSdk.ec2instanceconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendSSHPublicKeyRequest extends js.Object {
  /**
    * The availability zone the EC2 instance was launched in.
    */
  var AvailabilityZone: typings.awsSdk.ec2instanceconnectMod.AvailabilityZone = js.native
  /**
    * The EC2 instance you wish to publish the SSH key to.
    */
  var InstanceId: typings.awsSdk.ec2instanceconnectMod.InstanceId = js.native
  /**
    * The OS user on the EC2 instance whom the key may be used to authenticate as.
    */
  var InstanceOSUser: typings.awsSdk.ec2instanceconnectMod.InstanceOSUser = js.native
  /**
    * The public key to be published to the instance. To use it after publication you must have the matching private key.
    */
  var SSHPublicKey: typings.awsSdk.ec2instanceconnectMod.SSHPublicKey = js.native
}

object SendSSHPublicKeyRequest {
  @scala.inline
  def apply(
    AvailabilityZone: AvailabilityZone,
    InstanceId: InstanceId,
    InstanceOSUser: InstanceOSUser,
    SSHPublicKey: SSHPublicKey
  ): SendSSHPublicKeyRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], InstanceOSUser = InstanceOSUser.asInstanceOf[js.Any], SSHPublicKey = SSHPublicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendSSHPublicKeyRequest]
  }
}

