package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The given name of the user.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * Boolean value to determine whether the user is granted Poweruser privileges.
    */
  var GrantPoweruserPrivileges: js.UndefOr[BooleanEnumType] = js.native
  /**
    * The locale of the user.
    */
  var Locale: js.UndefOr[LocaleType] = js.native
  /**
    * The amount of storage for the user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.native
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * The time zone ID of the user.
    */
  var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.native
  /**
    * The type of the user.
    */
  var Type: js.UndefOr[UserType] = js.native
  /**
    * The ID of the user.
    */
  var UserId: IdType = js.native
}

object UpdateUserRequest {
  @scala.inline
  def apply(UserId: IdType): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  @scala.inline
  implicit class UpdateUserRequestOps[Self <: UpdateUserRequest] (val x: Self) extends AnyVal {
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
    def setUserId(value: IdType): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    @scala.inline
    def setGivenName(value: UserAttributeValueType): Self = this.set("GivenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("GivenName", js.undefined)
    @scala.inline
    def setGrantPoweruserPrivileges(value: BooleanEnumType): Self = this.set("GrantPoweruserPrivileges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantPoweruserPrivileges: Self = this.set("GrantPoweruserPrivileges", js.undefined)
    @scala.inline
    def setLocale(value: LocaleType): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("Locale", js.undefined)
    @scala.inline
    def setStorageRule(value: StorageRuleType): Self = this.set("StorageRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageRule: Self = this.set("StorageRule", js.undefined)
    @scala.inline
    def setSurname(value: UserAttributeValueType): Self = this.set("Surname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurname: Self = this.set("Surname", js.undefined)
    @scala.inline
    def setTimeZoneId(value: TimeZoneIdType): Self = this.set("TimeZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZoneId: Self = this.set("TimeZoneId", js.undefined)
    @scala.inline
    def setType(value: UserType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

