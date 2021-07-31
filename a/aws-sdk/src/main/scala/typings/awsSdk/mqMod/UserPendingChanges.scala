package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPendingChanges extends StObject {
  
  /**
    * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
    */
  var ConsoleAccess: js.UndefOr[boolean] = js.undefined
  
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Groups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * Required. The type of change pending for the ActiveMQ user.
    */
  var PendingChange: js.UndefOr[ChangeType] = js.undefined
}
object UserPendingChanges {
  
  @scala.inline
  def apply(): UserPendingChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPendingChanges]
  }
  
  @scala.inline
  implicit class UserPendingChangesMutableBuilder[Self <: UserPendingChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsoleAccess(value: boolean): Self = StObject.set(x, "ConsoleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleAccessUndefined: Self = StObject.set(x, "ConsoleAccess", js.undefined)
    
    @scala.inline
    def setGroups(value: listOfString): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: string*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setPendingChange(value: ChangeType): Self = StObject.set(x, "PendingChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingChangeUndefined: Self = StObject.set(x, "PendingChange", js.undefined)
  }
}
