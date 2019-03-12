package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DEPRECATED!! Please use UserField(...).IsInSPWeb* methods instead. This interface will be removed in the next release */
trait IMembershipSPWeb extends js.Object {
  /** DEPRECATED. Please use UserField(...).IsInSPWebAllUsers() instead */
  def AllUsers(): IExpression
  /** DEPRECATED. Please use UserField(...).IsInSPWebGroups() instead */
  def Groups(): IExpression
  /** DEPRECATED. Please use UserField(...).IsInSPWebUsers() instead */
  def Users(): IExpression
}

object IMembershipSPWeb {
  @scala.inline
  def apply(AllUsers: () => IExpression, Groups: () => IExpression, Users: () => IExpression): IMembershipSPWeb = {
    val __obj = js.Dynamic.literal(AllUsers = js.Any.fromFunction0(AllUsers), Groups = js.Any.fromFunction0(Groups), Users = js.Any.fromFunction0(Users))
  
    __obj.asInstanceOf[IMembershipSPWeb]
  }
}

