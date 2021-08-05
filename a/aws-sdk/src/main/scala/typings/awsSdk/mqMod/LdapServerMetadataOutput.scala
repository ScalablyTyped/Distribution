package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LdapServerMetadataOutput extends StObject {
  
  /**
    * Fully qualified domain name of the LDAP server. Optional failover server.
    */
  var Hosts: js.UndefOr[listOfString] = js.undefined
  
  /**
    * Fully qualified name of the directory to search for a user’s groups.
    */
  var RoleBase: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group membership query.
    */
  var RoleName: js.UndefOr[string] = js.undefined
  
  /**
    * The search criteria for groups.
    */
  var RoleSearchMatching: js.UndefOr[string] = js.undefined
  
  /**
    * The directory search scope for the role. If set to true, scope is to search the entire sub-tree.
    */
  var RoleSearchSubtree: js.UndefOr[boolean] = js.undefined
  
  /**
    * Service account username.
    */
  var ServiceAccountUsername: js.UndefOr[string] = js.undefined
  
  /**
    * Fully qualified name of the directory where you want to search for users.
    */
  var UserBase: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies the name of the LDAP attribute for the user group membership.
    */
  var UserRoleName: js.UndefOr[string] = js.undefined
  
  /**
    * The search criteria for users.
    */
  var UserSearchMatching: js.UndefOr[string] = js.undefined
  
  /**
    * The directory search scope for the user. If set to true, scope is to search the entire sub-tree.
    */
  var UserSearchSubtree: js.UndefOr[boolean] = js.undefined
}
object LdapServerMetadataOutput {
  
  inline def apply(): LdapServerMetadataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LdapServerMetadataOutput]
  }
  
  extension [Self <: LdapServerMetadataOutput](x: Self) {
    
    inline def setHosts(value: listOfString): Self = StObject.set(x, "Hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "Hosts", js.undefined)
    
    inline def setHostsVarargs(value: string*): Self = StObject.set(x, "Hosts", js.Array(value :_*))
    
    inline def setRoleBase(value: string): Self = StObject.set(x, "RoleBase", value.asInstanceOf[js.Any])
    
    inline def setRoleBaseUndefined: Self = StObject.set(x, "RoleBase", js.undefined)
    
    inline def setRoleName(value: string): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
    
    inline def setRoleSearchMatching(value: string): Self = StObject.set(x, "RoleSearchMatching", value.asInstanceOf[js.Any])
    
    inline def setRoleSearchMatchingUndefined: Self = StObject.set(x, "RoleSearchMatching", js.undefined)
    
    inline def setRoleSearchSubtree(value: boolean): Self = StObject.set(x, "RoleSearchSubtree", value.asInstanceOf[js.Any])
    
    inline def setRoleSearchSubtreeUndefined: Self = StObject.set(x, "RoleSearchSubtree", js.undefined)
    
    inline def setServiceAccountUsername(value: string): Self = StObject.set(x, "ServiceAccountUsername", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUsernameUndefined: Self = StObject.set(x, "ServiceAccountUsername", js.undefined)
    
    inline def setUserBase(value: string): Self = StObject.set(x, "UserBase", value.asInstanceOf[js.Any])
    
    inline def setUserBaseUndefined: Self = StObject.set(x, "UserBase", js.undefined)
    
    inline def setUserRoleName(value: string): Self = StObject.set(x, "UserRoleName", value.asInstanceOf[js.Any])
    
    inline def setUserRoleNameUndefined: Self = StObject.set(x, "UserRoleName", js.undefined)
    
    inline def setUserSearchMatching(value: string): Self = StObject.set(x, "UserSearchMatching", value.asInstanceOf[js.Any])
    
    inline def setUserSearchMatchingUndefined: Self = StObject.set(x, "UserSearchMatching", js.undefined)
    
    inline def setUserSearchSubtree(value: boolean): Self = StObject.set(x, "UserSearchSubtree", value.asInstanceOf[js.Any])
    
    inline def setUserSearchSubtreeUndefined: Self = StObject.set(x, "UserSearchSubtree", js.undefined)
  }
}
