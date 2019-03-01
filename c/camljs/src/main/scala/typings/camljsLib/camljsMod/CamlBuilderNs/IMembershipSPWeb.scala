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
  def apply(
    AllUsers: js.Function0[IExpression],
    Groups: js.Function0[IExpression],
    Users: js.Function0[IExpression]
  ): IMembershipSPWeb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllUsers")(AllUsers)
    __obj.updateDynamic("Groups")(Groups)
    __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[IMembershipSPWeb]
  }
}

