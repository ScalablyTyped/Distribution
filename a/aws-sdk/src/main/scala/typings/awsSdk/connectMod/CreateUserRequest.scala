package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserRequest extends js.Object {
  /**
    * The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate users from your directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an error is returned.
    */
  var DirectoryUserId: js.UndefOr[typings.awsSdk.connectMod.DirectoryUserId] = js.native
  /**
    * The identifier of the hierarchy group for the user.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsSdk.connectMod.HierarchyGroupId] = js.native
  /**
    * The information about the identity of the user.
    */
  var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
    */
  var Password: js.UndefOr[typings.awsSdk.connectMod.Password] = js.native
  /**
    * The phone settings for the user.
    */
  var PhoneConfig: UserPhoneConfig = js.native
  /**
    * The identifier of the routing profile for the user.
    */
  var RoutingProfileId: typings.awsSdk.connectMod.RoutingProfileId = js.native
  /**
    * The identifier of the security profile for the user.
    */
  var SecurityProfileIds: typings.awsSdk.connectMod.SecurityProfileIds = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  /**
    * The user name for the account. For instances not using SAML for identity management, the user name can include up to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters from [a-zA-Z0-9_-.\@]+.
    */
  var Username: AgentUsername = js.native
}

object CreateUserRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    PhoneConfig: UserPhoneConfig,
    RoutingProfileId: RoutingProfileId,
    SecurityProfileIds: SecurityProfileIds,
    Username: AgentUsername
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], PhoneConfig = PhoneConfig.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any], SecurityProfileIds = SecurityProfileIds.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  @scala.inline
  implicit class CreateUserRequestOps[Self <: CreateUserRequest] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneConfig(value: UserPhoneConfig): Self = this.set("PhoneConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = this.set("RoutingProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityProfileIdsVarargs(value: SecurityProfileId*): Self = this.set("SecurityProfileIds", js.Array(value :_*))
    @scala.inline
    def setSecurityProfileIds(value: SecurityProfileIds): Self = this.set("SecurityProfileIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: AgentUsername): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryUserId(value: DirectoryUserId): Self = this.set("DirectoryUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryUserId: Self = this.set("DirectoryUserId", js.undefined)
    @scala.inline
    def setHierarchyGroupId(value: HierarchyGroupId): Self = this.set("HierarchyGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHierarchyGroupId: Self = this.set("HierarchyGroupId", js.undefined)
    @scala.inline
    def setIdentityInfo(value: UserIdentityInfo): Self = this.set("IdentityInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityInfo: Self = this.set("IdentityInfo", js.undefined)
    @scala.inline
    def setPassword(value: Password): Self = this.set("Password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

