package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSummary extends StObject {
  
  /**
    * The type of change pending for the broker user.
    */
  var PendingChange: js.UndefOr[ChangeType] = js.undefined
  
  /**
    * Required. The username of the broker user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: js.UndefOr[string] = js.undefined
}
object UserSummary {
  
  @scala.inline
  def apply(): UserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSummary]
  }
  
  @scala.inline
  implicit class UserSummaryMutableBuilder[Self <: UserSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPendingChange(value: ChangeType): Self = StObject.set(x, "PendingChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingChangeUndefined: Self = StObject.set(x, "PendingChange", js.undefined)
    
    @scala.inline
    def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
