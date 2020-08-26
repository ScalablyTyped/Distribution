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
  def apply(Arn: Arn): ListedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedServer]
  }
  @scala.inline
  implicit class ListedServerOps[Self <: ListedServer] (val x: Self) extends AnyVal {
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
    def setEndpointType(value: EndpointType): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointType: Self = this.set("EndpointType", js.undefined)
    @scala.inline
    def setIdentityProviderType(value: IdentityProviderType): Self = this.set("IdentityProviderType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityProviderType: Self = this.set("IdentityProviderType", js.undefined)
    @scala.inline
    def setLoggingRole(value: Role): Self = this.set("LoggingRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingRole: Self = this.set("LoggingRole", js.undefined)
    @scala.inline
    def setServerId(value: ServerId): Self = this.set("ServerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerId: Self = this.set("ServerId", js.undefined)
    @scala.inline
    def setState(value: State): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setUserCount(value: UserCount): Self = this.set("UserCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserCount: Self = this.set("UserCount", js.undefined)
  }
  
}

