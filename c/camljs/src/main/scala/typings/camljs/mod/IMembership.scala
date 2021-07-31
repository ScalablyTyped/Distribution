package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DEPRECATED!! Please use UserField(...).IsIn* methods instead. This interface will be removed in the next release */
trait IMembership extends StObject {
  
  /** DEPRECATED. Please use UserField(...).IsInCurrentUserGroups() instead */
  def CurrentUserGroups(): IExpression
  
  /** DEPRECATED. Please use UserField(...).IsInSPGroup() instead */
  def SPGroup(groupId: Double): IExpression
  
  /** DEPRECATED. Please use UserField(...).IsInSPWeb* methods instead */
  var SPWeb: IMembershipSPWeb
}
object IMembership {
  
  @scala.inline
  def apply(CurrentUserGroups: () => IExpression, SPGroup: Double => IExpression, SPWeb: IMembershipSPWeb): IMembership = {
    val __obj = js.Dynamic.literal(CurrentUserGroups = js.Any.fromFunction0(CurrentUserGroups), SPGroup = js.Any.fromFunction1(SPGroup), SPWeb = SPWeb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMembership]
  }
  
  @scala.inline
  implicit class IMembershipMutableBuilder[Self <: IMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentUserGroups(value: () => IExpression): Self = StObject.set(x, "CurrentUserGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSPGroup(value: Double => IExpression): Self = StObject.set(x, "SPGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSPWeb(value: IMembershipSPWeb): Self = StObject.set(x, "SPWeb", value.asInstanceOf[js.Any])
  }
}
