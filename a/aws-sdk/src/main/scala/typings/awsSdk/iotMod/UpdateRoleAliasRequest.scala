package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoleAliasRequest extends js.Object {
  /**
    * The number of seconds the credential will be valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.native
  /**
    * The role alias to update.
    */
  var roleAlias: RoleAlias = js.native
  /**
    * The role ARN.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object UpdateRoleAliasRequest {
  @scala.inline
  def apply(
    roleAlias: RoleAlias,
    credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined,
    roleArn: RoleArn = null
  ): UpdateRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
    if (!js.isUndefined(credentialDurationSeconds)) __obj.updateDynamic("credentialDurationSeconds")(credentialDurationSeconds.get.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleAliasRequest]
  }
}

