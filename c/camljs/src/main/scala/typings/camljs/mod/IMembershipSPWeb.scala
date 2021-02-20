package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DEPRECATED!! Please use UserField(...).IsInSPWeb* methods instead. This interface will be removed in the next release */
@js.native
trait IMembershipSPWeb extends StObject {
  
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
  implicit class IMembershipSPWebMutableBuilder[Self <: IMembershipSPWeb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllUsers(value: () => IExpression): Self = StObject.set(x, "AllUsers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroups(value: () => IExpression): Self = StObject.set(x, "Groups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUsers(value: () => IExpression): Self = StObject.set(x, "Users", js.Any.fromFunction0(value))
  }
}
