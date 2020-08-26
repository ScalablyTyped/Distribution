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
  def apply(roleAlias: RoleAlias, roleArn: RoleArn): CreateRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoleAliasRequest]
  }
  @scala.inline
  implicit class CreateRoleAliasRequestOps[Self <: CreateRoleAliasRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoleAlias(value: RoleAlias): Self = this.set("roleAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentialDurationSeconds(value: CredentialDurationSeconds): Self = this.set("credentialDurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentialDurationSeconds: Self = this.set("credentialDurationSeconds", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

