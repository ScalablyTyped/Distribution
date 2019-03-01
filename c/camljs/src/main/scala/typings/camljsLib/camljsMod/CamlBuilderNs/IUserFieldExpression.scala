package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserFieldExpression extends js.Object {
  /** DEPRECATED. Please use IsIn* methods instead. This property will be removed in next release(!!) */
  var Membership: IMembership
  /** Checks whether the value of the User field is equal to id of the current user */
  def EqualToCurrentUser(): IExpression
  /** Specifies that id of the user will be used for further comparisons. */
  def Id(): INumberFieldExpression
  /** Checks whether the group specified by the value of the field includes the current user. */
  def IsInCurrentUserGroups(): IExpression
  /** Checks whether the user specified by the value of the field is member of the specified SharePoint Group. */
  def IsInSPGroup(groupId: scala.Double): IExpression
  /** Checks whether the user specified by the value of the field is in current SPWeb users. */
  def IsInSPWebAllUsers(): IExpression
  /** Checks whether the user specified by the value of the field is member of current SPWeb groups. */
  def IsInSPWebGroups(): IExpression
  /** Checks whether the user specified by the value of the field has received the rights to the site directly (not through a group). */
  def IsInSPWebUsers(): IExpression
  /** Specifies that lookup target field value will be used for further comparisons. */
  def ValueAsText(): ITextFieldExpression
}

object IUserFieldExpression {
  @scala.inline
  def apply(
    EqualToCurrentUser: js.Function0[IExpression],
    Id: js.Function0[INumberFieldExpression],
    IsInCurrentUserGroups: js.Function0[IExpression],
    IsInSPGroup: js.Function1[scala.Double, IExpression],
    IsInSPWebAllUsers: js.Function0[IExpression],
    IsInSPWebGroups: js.Function0[IExpression],
    IsInSPWebUsers: js.Function0[IExpression],
    Membership: IMembership,
    ValueAsText: js.Function0[ITextFieldExpression]
  ): IUserFieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EqualToCurrentUser")(EqualToCurrentUser)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("IsInCurrentUserGroups")(IsInCurrentUserGroups)
    __obj.updateDynamic("IsInSPGroup")(IsInSPGroup)
    __obj.updateDynamic("IsInSPWebAllUsers")(IsInSPWebAllUsers)
    __obj.updateDynamic("IsInSPWebGroups")(IsInSPWebGroups)
    __obj.updateDynamic("IsInSPWebUsers")(IsInSPWebUsers)
    __obj.updateDynamic("Membership")(Membership)
    __obj.updateDynamic("ValueAsText")(ValueAsText)
    __obj.asInstanceOf[IUserFieldExpression]
  }
}

