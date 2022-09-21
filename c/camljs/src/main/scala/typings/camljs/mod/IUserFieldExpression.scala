package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserFieldExpression extends StObject {
  
  /** Checks whether the value of the User field is equal to id of the current user */
  def EqualToCurrentUser(): IExpression
  
  /** Specifies that id of the user will be used for further comparisons. */
  def Id(): INumberFieldExpression
  
  /** Checks whether the group specified by the value of the field includes the current user. */
  def IsInCurrentUserGroups(): IExpression
  
  /** Checks whether the user specified by the value of the field is member of the specified SharePoint Group. */
  def IsInSPGroup(groupId: Double): IExpression
  
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
  
  inline def apply(
    EqualToCurrentUser: () => IExpression,
    Id: () => INumberFieldExpression,
    IsInCurrentUserGroups: () => IExpression,
    IsInSPGroup: Double => IExpression,
    IsInSPWebAllUsers: () => IExpression,
    IsInSPWebGroups: () => IExpression,
    IsInSPWebUsers: () => IExpression,
    ValueAsText: () => ITextFieldExpression
  ): IUserFieldExpression = {
    val __obj = js.Dynamic.literal(EqualToCurrentUser = js.Any.fromFunction0(EqualToCurrentUser), Id = js.Any.fromFunction0(Id), IsInCurrentUserGroups = js.Any.fromFunction0(IsInCurrentUserGroups), IsInSPGroup = js.Any.fromFunction1(IsInSPGroup), IsInSPWebAllUsers = js.Any.fromFunction0(IsInSPWebAllUsers), IsInSPWebGroups = js.Any.fromFunction0(IsInSPWebGroups), IsInSPWebUsers = js.Any.fromFunction0(IsInSPWebUsers), ValueAsText = js.Any.fromFunction0(ValueAsText))
    __obj.asInstanceOf[IUserFieldExpression]
  }
  
  extension [Self <: IUserFieldExpression](x: Self) {
    
    inline def setEqualToCurrentUser(value: () => IExpression): Self = StObject.set(x, "EqualToCurrentUser", js.Any.fromFunction0(value))
    
    inline def setId(value: () => INumberFieldExpression): Self = StObject.set(x, "Id", js.Any.fromFunction0(value))
    
    inline def setIsInCurrentUserGroups(value: () => IExpression): Self = StObject.set(x, "IsInCurrentUserGroups", js.Any.fromFunction0(value))
    
    inline def setIsInSPGroup(value: Double => IExpression): Self = StObject.set(x, "IsInSPGroup", js.Any.fromFunction1(value))
    
    inline def setIsInSPWebAllUsers(value: () => IExpression): Self = StObject.set(x, "IsInSPWebAllUsers", js.Any.fromFunction0(value))
    
    inline def setIsInSPWebGroups(value: () => IExpression): Self = StObject.set(x, "IsInSPWebGroups", js.Any.fromFunction0(value))
    
    inline def setIsInSPWebUsers(value: () => IExpression): Self = StObject.set(x, "IsInSPWebUsers", js.Any.fromFunction0(value))
    
    inline def setValueAsText(value: () => ITextFieldExpression): Self = StObject.set(x, "ValueAsText", js.Any.fromFunction0(value))
  }
}
