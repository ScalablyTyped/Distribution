package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DEPRECATED!! Please use UserField(...).IsInSPWeb* methods instead. This interface will be removed in the next release */
trait IMembershipSPWeb extends StObject {
  
  /** DEPRECATED. Please use UserField(...).IsInSPWebAllUsers() instead */
  def AllUsers(): IExpression
  
  /** DEPRECATED. Please use UserField(...).IsInSPWebGroups() instead */
  def Groups(): IExpression
  
  /** DEPRECATED. Please use UserField(...).IsInSPWebUsers() instead */
  def Users(): IExpression
}
object IMembershipSPWeb {
  
  inline def apply(AllUsers: () => IExpression, Groups: () => IExpression, Users: () => IExpression): IMembershipSPWeb = {
    val __obj = js.Dynamic.literal(AllUsers = js.Any.fromFunction0(AllUsers), Groups = js.Any.fromFunction0(Groups), Users = js.Any.fromFunction0(Users))
    __obj.asInstanceOf[IMembershipSPWeb]
  }
  
  extension [Self <: IMembershipSPWeb](x: Self) {
    
    inline def setAllUsers(value: () => IExpression): Self = StObject.set(x, "AllUsers", js.Any.fromFunction0(value))
    
    inline def setGroups(value: () => IExpression): Self = StObject.set(x, "Groups", js.Any.fromFunction0(value))
    
    inline def setUsers(value: () => IExpression): Self = StObject.set(x, "Users", js.Any.fromFunction0(value))
  }
}
