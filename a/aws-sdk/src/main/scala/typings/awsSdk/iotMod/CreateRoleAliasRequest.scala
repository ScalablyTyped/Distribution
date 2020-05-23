package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoleAliasRequest extends js.Object {
  /**
    * How long (in seconds) the credentials will be valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.native
  /**
    * The role alias that points to a role ARN. This allows you to change the role without having to update the device.
    */
  var roleAlias: RoleAlias = js.native
  /**
    * The role ARN.
    */
  var roleArn: RoleArn = js.native
  /**
    * Metadata which can be used to manage the role alias.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateRoleAliasRequest {
  @scala.inline
  def apply(
    roleAlias: RoleAlias,
    roleArn: RoleArn,
    credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined,
    tags: TagList = null
  ): CreateRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(credentialDurationSeconds)) __obj.updateDynamic("credentialDurationSeconds")(credentialDurationSeconds.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoleAliasRequest]
  }
}

