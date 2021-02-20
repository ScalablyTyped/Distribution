package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHsmRequest extends StObject {
  
  /**
    * A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be ignored.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientToken] = js.native
  
  /**
    * The IP address to assign to the HSM's ENI. If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the subnet.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  
  /**
    * The external ID from IamRoleArn, if present.
    */
  var ExternalId: js.UndefOr[typings.awsSdk.cloudhsmMod.ExternalId] = js.native
  
  /**
    * The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
    */
  var IamRoleArn: typings.awsSdk.cloudhsmMod.IamRoleArn = js.native
  
  /**
    * The SSH public key to install on the HSM.
    */
  var SshKey: typings.awsSdk.cloudhsmMod.SshKey = js.native
  
  /**
    * The identifier of the subnet in your VPC in which to place the HSM.
    */
  var SubnetId: typings.awsSdk.cloudhsmMod.SubnetId = js.native
  
  var SubscriptionType: typings.awsSdk.cloudhsmMod.SubscriptionType = js.native
  
  /**
    * The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
    */
  var SyslogIp: js.UndefOr[IpAddress] = js.native
}
object CreateHsmRequest {
  
  @scala.inline
  def apply(IamRoleArn: IamRoleArn, SshKey: SshKey, SubnetId: SubnetId, SubscriptionType: SubscriptionType): CreateHsmRequest = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], SshKey = SshKey.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmRequest]
  }
  
  @scala.inline
  implicit class CreateHsmRequestMutableBuilder[Self <: CreateHsmRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setEniIp(value: IpAddress): Self = StObject.set(x, "EniIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEniIpUndefined: Self = StObject.set(x, "EniIp", js.undefined)
    
    @scala.inline
    def setExternalId(value: ExternalId): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshKey(value: SshKey): Self = StObject.set(x, "SshKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionType(value: SubscriptionType): Self = StObject.set(x, "SubscriptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyslogIp(value: IpAddress): Self = StObject.set(x, "SyslogIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyslogIpUndefined: Self = StObject.set(x, "SyslogIp", js.undefined)
  }
}
