package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPendingChanges extends js.Object {
  
  /**
    * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
    */
  var ConsoleAccess: js.UndefOr[boolean] = js.native
  
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Groups: js.UndefOr[listOfString] = js.native
  
  /**
    * Required. The type of change pending for the ActiveMQ user.
    */
  var PendingChange: js.UndefOr[ChangeType] = js.native
}
object UserPendingChanges {
  
  @scala.inline
  def apply(): UserPendingChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPendingChanges]
  }
  
  @scala.inline
  implicit class UserPendingChangesOps[Self <: UserPendingChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConsoleAccess(value: boolean): Self = this.set("ConsoleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsoleAccess: Self = this.set("ConsoleAccess", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: string*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: listOfString): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    
    @scala.inline
    def setPendingChange(value: ChangeType): Self = this.set("PendingChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingChange: Self = this.set("PendingChange", js.undefined)
  }
}
