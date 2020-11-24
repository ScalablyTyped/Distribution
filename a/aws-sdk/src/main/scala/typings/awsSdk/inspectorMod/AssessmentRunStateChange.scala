package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssessmentRunStateChange extends js.Object {
  
  /**
    * The assessment run state.
    */
  var state: AssessmentRunState = js.native
  
  /**
    * The last time the assessment run state changed.
    */
  var stateChangedAt: Timestamp = js.native
}
object AssessmentRunStateChange {
  
  @scala.inline
  def apply(state: AssessmentRunState, stateChangedAt: Timestamp): AssessmentRunStateChange = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], stateChangedAt = stateChangedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunStateChange]
  }
  
  @scala.inline
  implicit class AssessmentRunStateChangeOps[Self <: AssessmentRunStateChange] (val x: Self) extends AnyVal {
    
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
    def setState(value: AssessmentRunState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangedAt(value: Timestamp): Self = this.set("stateChangedAt", value.asInstanceOf[js.Any])
  }
}
