package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LdapServerMetadataInput extends StObject {
  
  /**
    * Fully qualified domain name of the LDAP server. Optional failover server.
    */
  var Hosts: js.UndefOr[listOfString] = js.native
  
  /**
    * Fully qualified name of the directory to search for a user’s groups.
    */
  var RoleBase: js.UndefOr[string] = js.native
  
  /**
    * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group membership query.
    */
  var RoleName: js.UndefOr[string] = js.native
  
  /**
    * The search criteria for groups.
    */
  var RoleSearchMatching: js.UndefOr[string] = js.native
  
  /**
    * The directory search scope for the role. If set to true, scope is to search the entire sub-tree.
    */
  var RoleSearchSubtree: js.UndefOr[boolean] = js.native
  
  /**
    * Service account password.
    */
  var ServiceAccountPassword: js.UndefOr[string] = js.native
  
  /**
    * Service account username.
    */
  var ServiceAccountUsername: js.UndefOr[string] = js.native
  
  /**
    * Fully qualified name of the directory where you want to search for users.
    */
  var UserBase: js.UndefOr[string] = js.native
  
  /**
    * Specifies the name of the LDAP attribute for the user group membership.
    */
  var UserRoleName: js.UndefOr[string] = js.native
  
  /**
    * The search criteria for users.
    */
  var UserSearchMatching: js.UndefOr[string] = js.native
  
  /**
    * The directory search scope for the user. If set to true, scope is to search the entire sub-tree.
    */
  var UserSearchSubtree: js.UndefOr[boolean] = js.native
}
object LdapServerMetadataInput {
  
  @scala.inline
  def apply(): LdapServerMetadataInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LdapServerMetadataInput]
  }
  
  @scala.inline
  implicit class LdapServerMetadataInputMutableBuilder[Self <: LdapServerMetadataInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHosts(value: listOfString): Self = StObject.set(x, "Hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsUndefined: Self = StObject.set(x, "Hosts", js.undefined)
    
    @scala.inline
    def setHostsVarargs(value: string*): Self = StObject.set(x, "Hosts", js.Array(value :_*))
    
    @scala.inline
    def setRoleBase(value: string): Self = StObject.set(x, "RoleBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleBaseUndefined: Self = StObject.set(x, "RoleBase", js.undefined)
    
    @scala.inline
    def setRoleName(value: string): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
    
    @scala.inline
    def setRoleSearchMatching(value: string): Self = StObject.set(x, "RoleSearchMatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleSearchMatchingUndefined: Self = StObject.set(x, "RoleSearchMatching", js.undefined)
    
    @scala.inline
    def setRoleSearchSubtree(value: boolean): Self = StObject.set(x, "RoleSearchSubtree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleSearchSubtreeUndefined: Self = StObject.set(x, "RoleSearchSubtree", js.undefined)
    
    @scala.inline
    def setServiceAccountPassword(value: string): Self = StObject.set(x, "ServiceAccountPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountPasswordUndefined: Self = StObject.set(x, "ServiceAccountPassword", js.undefined)
    
    @scala.inline
    def setServiceAccountUsername(value: string): Self = StObject.set(x, "ServiceAccountUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountUsernameUndefined: Self = StObject.set(x, "ServiceAccountUsername", js.undefined)
    
    @scala.inline
    def setUserBase(value: string): Self = StObject.set(x, "UserBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserBaseUndefined: Self = StObject.set(x, "UserBase", js.undefined)
    
    @scala.inline
    def setUserRoleName(value: string): Self = StObject.set(x, "UserRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRoleNameUndefined: Self = StObject.set(x, "UserRoleName", js.undefined)
    
    @scala.inline
    def setUserSearchMatching(value: string): Self = StObject.set(x, "UserSearchMatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSearchMatchingUndefined: Self = StObject.set(x, "UserSearchMatching", js.undefined)
    
    @scala.inline
    def setUserSearchSubtree(value: boolean): Self = StObject.set(x, "UserSearchSubtree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSearchSubtreeUndefined: Self = StObject.set(x, "UserSearchSubtree", js.undefined)
  }
}
