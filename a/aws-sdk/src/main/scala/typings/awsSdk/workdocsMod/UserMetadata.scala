package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserMetadata extends js.Object {
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.native
  /**
    * The given name of the user before a rename operation.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * The ID of the user.
    */
  var Id: js.UndefOr[IdType] = js.native
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[UsernameType] = js.native
}

object UserMetadata {
  @scala.inline
  def apply(): UserMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMetadata]
  }
  @scala.inline
  implicit class UserMetadataOps[Self <: UserMetadata] (val x: Self) extends AnyVal {
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
    def setEmailAddress(value: EmailAddressType): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("EmailAddress", js.undefined)
    @scala.inline
    def setGivenName(value: UserAttributeValueType): Self = this.set("GivenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("GivenName", js.undefined)
    @scala.inline
    def setId(value: IdType): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setSurname(value: UserAttributeValueType): Self = this.set("Surname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurname: Self = this.set("Surname", js.undefined)
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
  
}

