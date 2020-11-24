package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OidcMemberDefinition extends js.Object {
  
  /**
    * A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made up of a group of private workers.
    */
  var Groups: typings.awsSdk.sagemakerMod.Groups = js.native
}
object OidcMemberDefinition {
  
  @scala.inline
  def apply(Groups: Groups): OidcMemberDefinition = {
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[OidcMemberDefinition]
  }
  
  @scala.inline
  implicit class OidcMemberDefinitionOps[Self <: OidcMemberDefinition] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: Group*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: Groups): Self = this.set("Groups", value.asInstanceOf[js.Any])
  }
}
