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
    * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM) certificate. Required when Protocols is set to FTPS.
    */
  var Certificate: js.UndefOr[typings.awsSdk.transferMod.Certificate] = js.native
  /**
    * The virtual private cloud (VPC) endpoint settings that you configured for your file transfer protocol-enabled server.
    */
  var EndpointDetails: js.UndefOr[typings.awsSdk.transferMod.EndpointDetails] = js.native
  /**
    * The type of endpoint that your file transfer protocol-enabled server is connected to. If your server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[typings.awsSdk.transferMod.EndpointType] = js.native
  /**
    * Contains the message-digest algorithm (MD5) hash of a file transfer protocol-enabled server's host key. This value is equivalent to the output of the ssh-keygen -l -E md5 -f my-new-server-key command.
    */
  var HostKeyFingerprint: js.UndefOr[typings.awsSdk.transferMod.HostKeyFingerprint] = js.native
  /**
    * Specifies information to call a customer-supplied authentication API. This field is not populated when the IdentityProviderType of a file transfer protocol-enabled server is SERVICE_MANAGED.
    */
  var IdentityProviderDetails: js.UndefOr[typings.awsSdk.transferMod.IdentityProviderDetails] = js.native
  /**
    * Defines the mode of authentication method enabled for this service. A value of SERVICE_MANAGED means that you are using this file transfer protocol-enabled server to store and access user credentials within the service. A value of API_GATEWAY indicates that you have integrated an API Gateway endpoint that will be invoked for authenticating your user into the service.
    */
  var IdentityProviderType: js.UndefOr[typings.awsSdk.transferMod.IdentityProviderType] = js.native
  /**
    * An AWS Identity and Access Management (IAM) entity that allows a file transfer protocol-enabled server to turn on Amazon CloudWatch logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
    */
  var LoggingRole: js.UndefOr[Role] = js.native
  /**
    * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint. The available protocols are:   Secure Shell (SSH) File Transfer Protocol (SFTP): File transfer over SSH   File Transfer Protocol Secure (FTPS): File transfer with TLS encryption   File Transfer Protocol (FTP): Unencrypted file transfer  
    */
  var Protocols: js.UndefOr[typings.awsSdk.transferMod.Protocols] = js.native
  /**
    * Unique system-assigned identifier for a file transfer protocol-enabled server that you instantiate.
    */
  var ServerId: js.UndefOr[typings.awsSdk.transferMod.ServerId] = js.native
  /**
    * The condition of a file transfer protocol-enabled server for the server that was described. A value of ONLINE indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicate that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[typings.awsSdk.transferMod.State] = js.native
  /**
    * Contains the key-value pairs that you can use to search for and group file transfer protocol-enabled servers that were assigned to the server that was described.
    */
  var Tags: js.UndefOr[typings.awsSdk.transferMod.Tags] = js.native
  /**
    * The number of users that are assigned to a file transfer protocol-enabled server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[typings.awsSdk.transferMod.UserCount] = js.native
}

object DescribedServer {
  @scala.inline
  def apply(
    Arn: Arn,
    Certificate: Certificate = null,
    EndpointDetails: EndpointDetails = null,
    EndpointType: EndpointType = null,
    HostKeyFingerprint: HostKeyFingerprint = null,
    IdentityProviderDetails: IdentityProviderDetails = null,
    IdentityProviderType: IdentityProviderType = null,
    LoggingRole: Role = null,
    Protocols: Protocols = null,
    ServerId: ServerId = null,
    State: State = null,
    Tags: Tags = null,
    UserCount: js.UndefOr[UserCount] = js.undefined
  ): DescribedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    if (EndpointDetails != null) __obj.updateDynamic("EndpointDetails")(EndpointDetails.asInstanceOf[js.Any])
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (HostKeyFingerprint != null) __obj.updateDynamic("HostKeyFingerprint")(HostKeyFingerprint.asInstanceOf[js.Any])
    if (IdentityProviderDetails != null) __obj.updateDynamic("IdentityProviderDetails")(IdentityProviderDetails.asInstanceOf[js.Any])
    if (IdentityProviderType != null) __obj.updateDynamic("IdentityProviderType")(IdentityProviderType.asInstanceOf[js.Any])
    if (LoggingRole != null) __obj.updateDynamic("LoggingRole")(LoggingRole.asInstanceOf[js.Any])
    if (Protocols != null) __obj.updateDynamic("Protocols")(Protocols.asInstanceOf[js.Any])
    if (ServerId != null) __obj.updateDynamic("ServerId")(ServerId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(UserCount)) __obj.updateDynamic("UserCount")(UserCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedServer]
  }
}

