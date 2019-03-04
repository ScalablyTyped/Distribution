package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DEPRECATED!! Please use UserField(...).IsIn* methods instead. This interface will be removed in the next release */
trait IMembership extends js.Object {
  /** DEPRECATED. Please use UserField(...).IsInSPWeb* methods instead */
  var SPWeb: IMembershipSPWeb
  /** DEPRECATED. Please use UserField(...).IsInCurrentUserGroups() instead */
  def CurrentUserGroups(): IExpression
  /** DEPRECATED. Please use UserField(...).IsInSPGroup() instead */
  def SPGroup(groupId: scala.Double): IExpression
}

object IMembership {
  @scala.inline
  def apply(
    CurrentUserGroups: js.Function0[IExpression],
    SPGroup: js.Function1[scala.Double, IExpression],
    SPWeb: IMembershipSPWeb
  ): IMembership = {
    val __obj = js.Dynamic.literal(CurrentUserGroups = CurrentUserGroups, SPGroup = SPGroup, SPWeb = SPWeb)
  
    __obj.asInstanceOf[IMembership]
  }
}

