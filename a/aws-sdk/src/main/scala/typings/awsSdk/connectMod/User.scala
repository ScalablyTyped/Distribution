package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the user account in the directory used for identity management.
    */
  var DirectoryUserId: js.UndefOr[typings.awsSdk.connectMod.DirectoryUserId] = js.native
  
  /**
    * The identifier of the hierarchy group for the user.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsSdk.connectMod.HierarchyGroupId] = js.native
  
  /**
    * The identifier of the user account.
    */
  var Id: js.UndefOr[UserId] = js.native
  
  /**
    * Information about the user identity.
    */
  var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.native
  
  /**
    * Information about the phone configuration for the user.
    */
  var PhoneConfig: js.UndefOr[UserPhoneConfig] = js.native
  
  /**
    * The identifier of the routing profile for the user.
    */
  var RoutingProfileId: js.UndefOr[typings.awsSdk.connectMod.RoutingProfileId] = js.native
  
  /**
    * The identifiers of the security profiles for the user.
    */
  var SecurityProfileIds: js.UndefOr[typings.awsSdk.connectMod.SecurityProfileIds] = js.native
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The user name assigned to the user account.
    */
  var Username: js.UndefOr[AgentUsername] = js.native
}
object User {
  
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ARN): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setDirectoryUserId(value: DirectoryUserId): Self = this.set("DirectoryUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryUserId: Self = this.set("DirectoryUserId", js.undefined)
    
    @scala.inline
    def setHierarchyGroupId(value: HierarchyGroupId): Self = this.set("HierarchyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchyGroupId: Self = this.set("HierarchyGroupId", js.undefined)
    
    @scala.inline
    def setId(value: UserId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setIdentityInfo(value: UserIdentityInfo): Self = this.set("IdentityInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityInfo: Self = this.set("IdentityInfo", js.undefined)
    
    @scala.inline
    def setPhoneConfig(value: UserPhoneConfig): Self = this.set("PhoneConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneConfig: Self = this.set("PhoneConfig", js.undefined)
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = this.set("RoutingProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingProfileId: Self = this.set("RoutingProfileId", js.undefined)
    
    @scala.inline
    def setSecurityProfileIdsVarargs(value: SecurityProfileId*): Self = this.set("SecurityProfileIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityProfileIds(value: SecurityProfileIds): Self = this.set("SecurityProfileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityProfileIds: Self = this.set("SecurityProfileIds", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setUsername(value: AgentUsername): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
