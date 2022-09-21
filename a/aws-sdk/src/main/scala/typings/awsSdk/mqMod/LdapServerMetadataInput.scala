package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LdapServerMetadataInput extends StObject {
  
  /**
    * Specifies the location of the LDAP server such as AWS Directory Service for Microsoft Active Directory . Optional failover server.
    */
  var Hosts: listOfString
  
  /**
    * The distinguished name of the node in the directory information tree (DIT) to search for roles or groups. For example, ou=group, ou=corp, dc=corp,
    dc=example, dc=com.
    */
  var RoleBase: string
  
  /**
    * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group membership query.
    */
  var RoleName: js.UndefOr[string] = js.undefined
  
  /**
    * The LDAP search filter used to find roles within the roleBase. The distinguished name of the user matched by userSearchMatching is substituted into the {0} placeholder in the search filter. The client's username is substituted into the {1} placeholder. For example, if you set this option to (member=uid={1})for the user janedoe, the search filter becomes (member=uid=janedoe) after string substitution. It matches all role entries that have a member attribute equal to uid=janedoe under the subtree selected by the roleBase.
    */
  var RoleSearchMatching: string
  
  /**
    * The directory search scope for the role. If set to true, scope is to search the entire subtree.
    */
  var RoleSearchSubtree: js.UndefOr[boolean] = js.undefined
  
  /**
    * Service account password. A service account is an account in your LDAP server that has access to initiate a connection. For example, cn=admin,dc=corp, dc=example,
    dc=com.
    */
  var ServiceAccountPassword: string
  
  /**
    * Service account username. A service account is an account in your LDAP server that has access to initiate a connection. For example, cn=admin,dc=corp, dc=example,
    dc=com.
    */
  var ServiceAccountUsername: string
  
  /**
    * Select a particular subtree of the directory information tree (DIT) to search for user entries. The subtree is specified by a DN, which specifies the base node of the subtree. For example, by setting this option to ou=Users,ou=corp, dc=corp,
    dc=example, dc=com, the search for user entries is restricted to the subtree beneath ou=Users, ou=corp, dc=corp, dc=example, dc=com.
    */
  var UserBase: string
  
  /**
    * Specifies the name of the LDAP attribute for the user group membership.
    */
  var UserRoleName: js.UndefOr[string] = js.undefined
  
  /**
    * The LDAP search filter used to find users within the userBase. The client's username is substituted into the {0} placeholder in the search filter. For example, if this option is set to (uid={0}) and the received username is janedoe, the search filter becomes (uid=janedoe) after string substitution. It will result in matching an entry like uid=janedoe, ou=Users,ou=corp, dc=corp, dc=example,
    dc=com.
    */
  var UserSearchMatching: string
  
  /**
    * The directory search scope for the user. If set to true, scope is to search the entire subtree.
    */
  var UserSearchSubtree: js.UndefOr[boolean] = js.undefined
}
object LdapServerMetadataInput {
  
  inline def apply(
    Hosts: listOfString,
    RoleBase: string,
    RoleSearchMatching: string,
    ServiceAccountPassword: string,
    ServiceAccountUsername: string,
    UserBase: string,
    UserSearchMatching: string
  ): LdapServerMetadataInput = {
    val __obj = js.Dynamic.literal(Hosts = Hosts.asInstanceOf[js.Any], RoleBase = RoleBase.asInstanceOf[js.Any], RoleSearchMatching = RoleSearchMatching.asInstanceOf[js.Any], ServiceAccountPassword = ServiceAccountPassword.asInstanceOf[js.Any], ServiceAccountUsername = ServiceAccountUsername.asInstanceOf[js.Any], UserBase = UserBase.asInstanceOf[js.Any], UserSearchMatching = UserSearchMatching.asInstanceOf[js.Any])
    __obj.asInstanceOf[LdapServerMetadataInput]
  }
  
  extension [Self <: LdapServerMetadataInput](x: Self) {
    
    inline def setHosts(value: listOfString): Self = StObject.set(x, "Hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsVarargs(value: string*): Self = StObject.set(x, "Hosts", js.Array(value*))
    
    inline def setRoleBase(value: string): Self = StObject.set(x, "RoleBase", value.asInstanceOf[js.Any])
    
    inline def setRoleName(value: string): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
    
    inline def setRoleSearchMatching(value: string): Self = StObject.set(x, "RoleSearchMatching", value.asInstanceOf[js.Any])
    
    inline def setRoleSearchSubtree(value: boolean): Self = StObject.set(x, "RoleSearchSubtree", value.asInstanceOf[js.Any])
    
    inline def setRoleSearchSubtreeUndefined: Self = StObject.set(x, "RoleSearchSubtree", js.undefined)
    
    inline def setServiceAccountPassword(value: string): Self = StObject.set(x, "ServiceAccountPassword", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUsername(value: string): Self = StObject.set(x, "ServiceAccountUsername", value.asInstanceOf[js.Any])
    
    inline def setUserBase(value: string): Self = StObject.set(x, "UserBase", value.asInstanceOf[js.Any])
    
    inline def setUserRoleName(value: string): Self = StObject.set(x, "UserRoleName", value.asInstanceOf[js.Any])
    
    inline def setUserRoleNameUndefined: Self = StObject.set(x, "UserRoleName", js.undefined)
    
    inline def setUserSearchMatching(value: string): Self = StObject.set(x, "UserSearchMatching", value.asInstanceOf[js.Any])
    
    inline def setUserSearchSubtree(value: boolean): Self = StObject.set(x, "UserSearchSubtree", value.asInstanceOf[js.Any])
    
    inline def setUserSearchSubtreeUndefined: Self = StObject.set(x, "UserSearchSubtree", js.undefined)
  }
}
