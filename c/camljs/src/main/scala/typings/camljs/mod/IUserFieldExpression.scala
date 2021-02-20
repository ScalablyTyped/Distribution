package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUserFieldExpression extends StObject {
  
  /** Checks whether the value of the User field is equal to id of the current user */
  def EqualToCurrentUser(): IExpression = js.native
  
  /** Specifies that id of the user will be used for further comparisons. */
  def Id(): INumberFieldExpression = js.native
  
  /** Checks whether the group specified by the value of the field includes the current user. */
  def IsInCurrentUserGroups(): IExpression = js.native
  
  /** Checks whether the user specified by the value of the field is member of the specified SharePoint Group. */
  def IsInSPGroup(groupId: Double): IExpression = js.native
  
  /** Checks whether the user specified by the value of the field is in current SPWeb users. */
  def IsInSPWebAllUsers(): IExpression = js.native
  
  /** Checks whether the user specified by the value of the field is member of current SPWeb groups. */
  def IsInSPWebGroups(): IExpression = js.native
  
  /** Checks whether the user specified by the value of the field has received the rights to the site directly (not through a group). */
  def IsInSPWebUsers(): IExpression = js.native
  
  /** DEPRECATED. Please use IsIn* methods instead. This property will be removed in next release(!!) */
  var Membership: IMembership = js.native
  
  /** Specifies that lookup target field value will be used for further comparisons. */
  def ValueAsText(): ITextFieldExpression = js.native
}
object IUserFieldExpression {
  
  @scala.inline
  def apply(
    EqualToCurrentUser: () => IExpression,
    Id: () => INumberFieldExpression,
    IsInCurrentUserGroups: () => IExpression,
    IsInSPGroup: Double => IExpression,
    IsInSPWebAllUsers: () => IExpression,
    IsInSPWebGroups: () => IExpression,
    IsInSPWebUsers: () => IExpression,
    Membership: IMembership,
    ValueAsText: () => ITextFieldExpression
  ): IUserFieldExpression = {
    val __obj = js.Dynamic.literal(EqualToCurrentUser = js.Any.fromFunction0(EqualToCurrentUser), Id = js.Any.fromFunction0(Id), IsInCurrentUserGroups = js.Any.fromFunction0(IsInCurrentUserGroups), IsInSPGroup = js.Any.fromFunction1(IsInSPGroup), IsInSPWebAllUsers = js.Any.fromFunction0(IsInSPWebAllUsers), IsInSPWebGroups = js.Any.fromFunction0(IsInSPWebGroups), IsInSPWebUsers = js.Any.fromFunction0(IsInSPWebUsers), Membership = Membership.asInstanceOf[js.Any], ValueAsText = js.Any.fromFunction0(ValueAsText))
    __obj.asInstanceOf[IUserFieldExpression]
  }
  
  @scala.inline
  implicit class IUserFieldExpressionMutableBuilder[Self <: IUserFieldExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEqualToCurrentUser(value: () => IExpression): Self = StObject.set(x, "EqualToCurrentUser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: () => INumberFieldExpression): Self = StObject.set(x, "Id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInCurrentUserGroups(value: () => IExpression): Self = StObject.set(x, "IsInCurrentUserGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInSPGroup(value: Double => IExpression): Self = StObject.set(x, "IsInSPGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsInSPWebAllUsers(value: () => IExpression): Self = StObject.set(x, "IsInSPWebAllUsers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInSPWebGroups(value: () => IExpression): Self = StObject.set(x, "IsInSPWebGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInSPWebUsers(value: () => IExpression): Self = StObject.set(x, "IsInSPWebUsers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMembership(value: IMembership): Self = StObject.set(x, "Membership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAsText(value: () => ITextFieldExpression): Self = StObject.set(x, "ValueAsText", js.Any.fromFunction0(value))
  }
}
