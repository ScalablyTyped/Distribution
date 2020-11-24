package typings.awsSdk.ec2instanceconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class SendSSHPublicKeyRequestOps[Self <: SendSSHPublicKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilityZone(value: AvailabilityZone): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceOSUser(value: InstanceOSUser): Self = this.set("InstanceOSUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSHPublicKey(value: SSHPublicKey): Self = this.set("SSHPublicKey", value.asInstanceOf[js.Any])
  }
}
