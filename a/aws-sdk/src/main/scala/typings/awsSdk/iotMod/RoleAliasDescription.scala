package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAliasDescription extends js.Object {
  /**
    * The UNIX timestamp of when the role alias was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The number of seconds for which the credential is valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.native
  /**
    * The UNIX timestamp of when the role alias was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The role alias owner.
    */
  var owner: js.UndefOr[AwsAccountId] = js.native
  /**
    * The role alias.
    */
  var roleAlias: js.UndefOr[RoleAlias] = js.native
  /**
    * The ARN of the role alias.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.native
  /**
    * The role ARN.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object RoleAliasDescription {
  @scala.inline
  def apply(): RoleAliasDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleAliasDescription]
  }
  @scala.inline
  implicit class RoleAliasDescriptionOps[Self <: RoleAliasDescription] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: DateType): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setCredentialDurationSeconds(value: CredentialDurationSeconds): Self = this.set("credentialDurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentialDurationSeconds: Self = this.set("credentialDurationSeconds", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setOwner(value: AwsAccountId): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRoleAlias(value: RoleAlias): Self = this.set("roleAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleAlias: Self = this.set("roleAlias", js.undefined)
    @scala.inline
    def setRoleAliasArn(value: RoleAliasArn): Self = this.set("roleAliasArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleAliasArn: Self = this.set("roleAliasArn", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

