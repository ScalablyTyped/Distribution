package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.  The ARN is never reused if the connection is deleted. 
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ConnectionArn] = js.native
  /**
    * The name of the connection. Connection names must be unique in an AWS user account.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ConnectionName] = js.native
  /**
    * The current status of the connection. 
    */
  var ConnectionStatus: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ConnectionStatus] = js.native
  /**
    * The name of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.
    */
  var OwnerAccountId: js.UndefOr[AccountId] = js.native
  /**
    * The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ProviderType] = js.native
}

object Connection {
  @scala.inline
  def apply(
    ConnectionArn: ConnectionArn = null,
    ConnectionName: ConnectionName = null,
    ConnectionStatus: ConnectionStatus = null,
    OwnerAccountId: AccountId = null,
    ProviderType: ProviderType = null
  ): Connection = {
    val __obj = js.Dynamic.literal()
    if (ConnectionArn != null) __obj.updateDynamic("ConnectionArn")(ConnectionArn.asInstanceOf[js.Any])
    if (ConnectionName != null) __obj.updateDynamic("ConnectionName")(ConnectionName.asInstanceOf[js.Any])
    if (ConnectionStatus != null) __obj.updateDynamic("ConnectionStatus")(ConnectionStatus.asInstanceOf[js.Any])
    if (OwnerAccountId != null) __obj.updateDynamic("OwnerAccountId")(OwnerAccountId.asInstanceOf[js.Any])
    if (ProviderType != null) __obj.updateDynamic("ProviderType")(ProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

