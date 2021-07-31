package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the user account in the directory used for identity management.
    */
  var DirectoryUserId: js.UndefOr[typings.awsSdk.connectMod.DirectoryUserId] = js.undefined
  
  /**
    * The identifier of the hierarchy group for the user.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsSdk.connectMod.HierarchyGroupId] = js.undefined
  
  /**
    * The identifier of the user account.
    */
  var Id: js.UndefOr[UserId] = js.undefined
  
  /**
    * Information about the user identity.
    */
  var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined
  
  /**
    * Information about the phone configuration for the user.
    */
  var PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined
  
  /**
    * The identifier of the routing profile for the user.
    */
  var RoutingProfileId: js.UndefOr[typings.awsSdk.connectMod.RoutingProfileId] = js.undefined
  
  /**
    * The identifiers of the security profiles for the user.
    */
  var SecurityProfileIds: js.UndefOr[typings.awsSdk.connectMod.SecurityProfileIds] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The user name assigned to the user account.
    */
  var Username: js.UndefOr[AgentUsername] = js.undefined
}
object User {
  
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setDirectoryUserId(value: DirectoryUserId): Self = StObject.set(x, "DirectoryUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryUserIdUndefined: Self = StObject.set(x, "DirectoryUserId", js.undefined)
    
    @scala.inline
    def setHierarchyGroupId(value: HierarchyGroupId): Self = StObject.set(x, "HierarchyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyGroupIdUndefined: Self = StObject.set(x, "HierarchyGroupId", js.undefined)
    
    @scala.inline
    def setId(value: UserId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIdentityInfo(value: UserIdentityInfo): Self = StObject.set(x, "IdentityInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityInfoUndefined: Self = StObject.set(x, "IdentityInfo", js.undefined)
    
    @scala.inline
    def setPhoneConfig(value: UserPhoneConfig): Self = StObject.set(x, "PhoneConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneConfigUndefined: Self = StObject.set(x, "PhoneConfig", js.undefined)
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileIdUndefined: Self = StObject.set(x, "RoutingProfileId", js.undefined)
    
    @scala.inline
    def setSecurityProfileIds(value: SecurityProfileIds): Self = StObject.set(x, "SecurityProfileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileIdsUndefined: Self = StObject.set(x, "SecurityProfileIds", js.undefined)
    
    @scala.inline
    def setSecurityProfileIdsVarargs(value: SecurityProfileId*): Self = StObject.set(x, "SecurityProfileIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setUsername(value: AgentUsername): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
