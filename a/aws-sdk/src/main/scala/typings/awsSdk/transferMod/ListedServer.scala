package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedServer extends js.Object {
  /**
    * Specifies the unique Amazon Resource Name (ARN) for a file transfer protocol-enabled server to be listed.
    */
  var Arn: typings.awsSdk.transferMod.Arn = js.native
  /**
    * Specifies the type of VPC endpoint that your file transfer protocol-enabled server is connected to. If your server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[typings.awsSdk.transferMod.EndpointType] = js.native
  /**
    * Specifies the authentication method used to validate a user for a file transfer protocol-enabled server that was specified. This can include Secure Shell (SSH), user name and password combinations, or your own custom authentication method. Valid values include SERVICE_MANAGED or API_GATEWAY.
    */
  var IdentityProviderType: js.UndefOr[typings.awsSdk.transferMod.IdentityProviderType] = js.native
  /**
    * Specifies the AWS Identity and Access Management (IAM) role that allows a file transfer protocol-enabled server to turn on Amazon CloudWatch logging.
    */
  var LoggingRole: js.UndefOr[Role] = js.native
  /**
    * Specifies the unique system assigned identifier for a file transfer protocol-enabled servers that were listed.
    */
  var ServerId: js.UndefOr[typings.awsSdk.transferMod.ServerId] = js.native
  /**
    * Specifies the condition of a file transfer protocol-enabled server for the server that was described. A value of ONLINE indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicate that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[typings.awsSdk.transferMod.State] = js.native
  /**
    * Specifies the number of users that are assigned to a file transfer protocol-enabled server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[typings.awsSdk.transferMod.UserCount] = js.native
}

object ListedServer {
  @scala.inline
  def apply(
    Arn: Arn,
    EndpointType: EndpointType = null,
    IdentityProviderType: IdentityProviderType = null,
    LoggingRole: Role = null,
    ServerId: ServerId = null,
    State: State = null,
    UserCount: js.UndefOr[UserCount] = js.undefined
  ): ListedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (IdentityProviderType != null) __obj.updateDynamic("IdentityProviderType")(IdentityProviderType.asInstanceOf[js.Any])
    if (LoggingRole != null) __obj.updateDynamic("LoggingRole")(LoggingRole.asInstanceOf[js.Any])
    if (ServerId != null) __obj.updateDynamic("ServerId")(ServerId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (!js.isUndefined(UserCount)) __obj.updateDynamic("UserCount")(UserCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedServer]
  }
}

