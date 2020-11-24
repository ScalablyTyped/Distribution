package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LdapServerMetadataOutput extends js.Object {
  
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
object LdapServerMetadataOutput {
  
  @scala.inline
  def apply(): LdapServerMetadataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LdapServerMetadataOutput]
  }
  
  @scala.inline
  implicit class LdapServerMetadataOutputOps[Self <: LdapServerMetadataOutput] (val x: Self) extends AnyVal {
    
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
    def setHostsVarargs(value: string*): Self = this.set("Hosts", js.Array(value :_*))
    
    @scala.inline
    def setHosts(value: listOfString): Self = this.set("Hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosts: Self = this.set("Hosts", js.undefined)
    
    @scala.inline
    def setRoleBase(value: string): Self = this.set("RoleBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleBase: Self = this.set("RoleBase", js.undefined)
    
    @scala.inline
    def setRoleName(value: string): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("RoleName", js.undefined)
    
    @scala.inline
    def setRoleSearchMatching(value: string): Self = this.set("RoleSearchMatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleSearchMatching: Self = this.set("RoleSearchMatching", js.undefined)
    
    @scala.inline
    def setRoleSearchSubtree(value: boolean): Self = this.set("RoleSearchSubtree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleSearchSubtree: Self = this.set("RoleSearchSubtree", js.undefined)
    
    @scala.inline
    def setServiceAccountUsername(value: string): Self = this.set("ServiceAccountUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountUsername: Self = this.set("ServiceAccountUsername", js.undefined)
    
    @scala.inline
    def setUserBase(value: string): Self = this.set("UserBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserBase: Self = this.set("UserBase", js.undefined)
    
    @scala.inline
    def setUserRoleName(value: string): Self = this.set("UserRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRoleName: Self = this.set("UserRoleName", js.undefined)
    
    @scala.inline
    def setUserSearchMatching(value: string): Self = this.set("UserSearchMatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserSearchMatching: Self = this.set("UserSearchMatching", js.undefined)
    
    @scala.inline
    def setUserSearchSubtree(value: boolean): Self = this.set("UserSearchSubtree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserSearchSubtree: Self = this.set("UserSearchSubtree", js.undefined)
  }
}
