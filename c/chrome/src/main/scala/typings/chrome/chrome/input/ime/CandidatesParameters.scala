package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CandidatesParameters extends js.Object {
  
  /** List of candidates to show in the candidate window */
  var candidates: js.Array[CandidateTemplate] = js.native
  
  /** ID of the context that owns the candidate window. */
  var contextID: Double = js.native
}
object CandidatesParameters {
  
  @scala.inline
  def apply(candidates: js.Array[CandidateTemplate], contextID: Double): CandidatesParameters = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidatesParameters]
  }
  
  @scala.inline
  implicit class CandidatesParametersOps[Self <: CandidatesParameters] (val x: Self) extends AnyVal {
    
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
    def setCandidatesVarargs(value: CandidateTemplate*): Self = this.set("candidates", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[CandidateTemplate]): Self = this.set("candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextID(value: Double): Self = this.set("contextID", value.asInstanceOf[js.Any])
  }
}
