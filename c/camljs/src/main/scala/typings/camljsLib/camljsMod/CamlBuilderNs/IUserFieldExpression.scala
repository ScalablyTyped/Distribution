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
    EqualToCurrentUser: () => IExpression,
    Id: () => INumberFieldExpression,
    IsInCurrentUserGroups: () => IExpression,
    IsInSPGroup: scala.Double => IExpression,
    IsInSPWebAllUsers: () => IExpression,
    IsInSPWebGroups: () => IExpression,
    IsInSPWebUsers: () => IExpression,
    Membership: IMembership,
    ValueAsText: () => ITextFieldExpression
  ): IUserFieldExpression = {
    val __obj = js.Dynamic.literal(EqualToCurrentUser = js.Any.fromFunction0(EqualToCurrentUser), Id = js.Any.fromFunction0(Id), IsInCurrentUserGroups = js.Any.fromFunction0(IsInCurrentUserGroups), IsInSPGroup = js.Any.fromFunction1(IsInSPGroup), IsInSPWebAllUsers = js.Any.fromFunction0(IsInSPWebAllUsers), IsInSPWebGroups = js.Any.fromFunction0(IsInSPWebGroups), IsInSPWebUsers = js.Any.fromFunction0(IsInSPWebUsers), Membership = Membership, ValueAsText = js.Any.fromFunction0(ValueAsText))
  
    __obj.asInstanceOf[IUserFieldExpression]
  }
}

