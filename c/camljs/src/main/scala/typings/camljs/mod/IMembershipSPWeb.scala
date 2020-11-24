package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DEPRECATED!! Please use UserField(...).IsInSPWeb* methods instead. This interface will be removed in the next release */
@js.native
trait IMembershipSPWeb extends js.Object {
  
  /** DEPRECATED. Please use UserField(...).IsInSPWebAllUsers() instead */
  def AllUsers(): IExpression = js.native
  
  /** DEPRECATED. Please use UserField(...).IsInSPWebGroups() instead */
  def Groups(): IExpression = js.native
  
  /** DEPRECATED. Please use UserField(...).IsInSPWebUsers() instead */
  def Users(): IExpression = js.native
}
object IMembershipSPWeb {
  
  @scala.inline
  def apply(AllUsers: () => IExpression, Groups: () => IExpression, Users: () => IExpression): IMembershipSPWeb = {
    val __obj = js.Dynamic.literal(AllUsers = js.Any.fromFunction0(AllUsers), Groups = js.Any.fromFunction0(Groups), Users = js.Any.fromFunction0(Users))
    __obj.asInstanceOf[IMembershipSPWeb]
  }
  
  @scala.inline
  implicit class IMembershipSPWebOps[Self <: IMembershipSPWeb] (val x: Self) extends AnyVal {
    
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
    def setAllUsers(value: () => IExpression): Self = this.set("AllUsers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroups(value: () => IExpression): Self = this.set("Groups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUsers(value: () => IExpression): Self = this.set("Users", js.Any.fromFunction0(value))
  }
}
