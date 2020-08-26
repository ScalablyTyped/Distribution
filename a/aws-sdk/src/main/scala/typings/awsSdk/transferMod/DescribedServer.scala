package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribedServer extends js.Object {
  /**
    * Specifies the unique Amazon Resource Name (ARN) for a file transfer protocol-enabled server to be described.
    */
  var Arn: typings.awsSdk.transferMod.Arn = js.native
  /**
    * Specifies the ARN of the AWS Certificate Manager (ACM) certificate. Required when Protocols is set to FTPS.
    */
  var Certificate: js.UndefOr[typings.awsSdk.transferMod.Certificate] = js.native
  /**
    * Specifies the virtual private cloud (VPC) endpoint settings that you configured for your file transfer protocol-enabled server.
    */
  var EndpointDetails: js.UndefOr[typings.awsSdk.transferMod.EndpointDetails] = js.native
  /**
    * Defines the type of endpoint that your file transfer protocol-enabled server is connected to. If your server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[typings.awsSdk.transferMod.EndpointType] = js.native
  /**
    * Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the output of the ssh-keygen -l -f my-new-server-key command.
    */
  var HostKeyFingerprint: js.UndefOr[typings.awsSdk.transferMod.HostKeyFingerprint] = js.native
  /**
    * Specifies information to call a customer-supplied authentication API. This field is not populated when the IdentityProviderType of a file transfer protocol-enabled server is SERVICE_MANAGED.
    */
  var IdentityProviderDetails: js.UndefOr[typings.awsSdk.transferMod.IdentityProviderDetails] = js.native
  /**
    * Specifies the mode of authentication method enabled for this service. A value of SERVICE_MANAGED means that you are using this file transfer protocol-enabled server to store and access user credentials within the service. A value of API_GATEWAY indicates that you have integrated an API Gateway endpoint that will be invoked for authenticating your user into the service.
    */
  var IdentityProviderType: js.UndefOr[typings.awsSdk.transferMod.IdentityProviderType] = js.native
  /**
    * Specifies the AWS Identity and Access Management (IAM) role that allows a file transfer protocol-enabled server to turn on Amazon CloudWatch logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
    */
  var LoggingRole: js.UndefOr[Role] = js.native
  /**
    * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint. The available protocols are:    SFTP (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH    FTPS (File Transfer Protocol Secure): File transfer with TLS encryption    FTP (File Transfer Protocol): Unencrypted file transfer  
    */
  var Protocols: js.UndefOr[typings.awsSdk.transferMod.Protocols] = js.native
  /**
    * Specifies the unique system-assigned identifier for a file transfer protocol-enabled server that you instantiate.
    */
  var ServerId: js.UndefOr[typings.awsSdk.transferMod.ServerId] = js.native
  /**
    * Specifies the condition of a file transfer protocol-enabled server for the server that was described. A value of ONLINE indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicate that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[typings.awsSdk.transferMod.State] = js.native
  /**
    * Specifies the key-value pairs that you can use to search for and group file transfer protocol-enabled servers that were assigned to the server that was described.
    */
  var Tags: js.UndefOr[typings.awsSdk.transferMod.Tags] = js.native
  /**
    * Specifies the number of users that are assigned to a file transfer protocol-enabled server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[typings.awsSdk.transferMod.UserCount] = js.native
}

object DescribedServer {
  @scala.inline
  def apply(Arn: Arn): DescribedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedServer]
  }
  @scala.inline
  implicit class DescribedServerOps[Self <: DescribedServer] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificate(value: Certificate): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificate: Self = this.set("Certificate", js.undefined)
    @scala.inline
    def setEndpointDetails(value: EndpointDetails): Self = this.set("EndpointDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointDetails: Self = this.set("EndpointDetails", js.undefined)
    @scala.inline
    def setEndpointType(value: EndpointType): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointType: Self = this.set("EndpointType", js.undefined)
    @scala.inline
    def setHostKeyFingerprint(value: HostKeyFingerprint): Self = this.set("HostKeyFingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostKeyFingerprint: Self = this.set("HostKeyFingerprint", js.undefined)
    @scala.inline
    def setIdentityProviderDetails(value: IdentityProviderDetails): Self = this.set("IdentityProviderDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityProviderDetails: Self = this.set("IdentityProviderDetails", js.undefined)
    @scala.inline
    def setIdentityProviderType(value: IdentityProviderType): Self = this.set("IdentityProviderType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityProviderType: Self = this.set("IdentityProviderType", js.undefined)
    @scala.inline
    def setLoggingRole(value: Role): Self = this.set("LoggingRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingRole: Self = this.set("LoggingRole", js.undefined)
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = this.set("Protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: Protocols): Self = this.set("Protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("Protocols", js.undefined)
    @scala.inline
    def setServerId(value: ServerId): Self = this.set("ServerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerId: Self = this.set("ServerId", js.undefined)
    @scala.inline
    def setState(value: State): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setUserCount(value: UserCount): Self = this.set("UserCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserCount: Self = this.set("UserCount", js.undefined)
  }
  
}

