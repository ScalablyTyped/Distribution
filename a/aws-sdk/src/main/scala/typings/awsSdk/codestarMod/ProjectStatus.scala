package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectStatus extends StObject {
  
  /**
    * In the case of a project creation or deletion failure, a reason for the failure.
    */
  var reason: js.UndefOr[Reason] = js.native
  
  /**
    * The phase of completion for a project creation or deletion.
    */
  var state: State = js.native
}
object ProjectStatus {
  
  @scala.inline
  def apply(state: State): ProjectStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectStatus]
  }
  
  @scala.inline
  implicit class ProjectStatusMutableBuilder[Self <: ProjectStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
