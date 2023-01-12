package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandidatesParameters extends StObject {
  
  /** List of candidates to show in the candidate window */
  var candidates: js.Array[CandidateTemplate]
  
  /** ID of the context that owns the candidate window. */
  var contextID: Double
}
object CandidatesParameters {
  
  inline def apply(candidates: js.Array[CandidateTemplate], contextID: Double): CandidatesParameters = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidatesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CandidatesParameters] (val x: Self) extends AnyVal {
    
    inline def setCandidates(value: js.Array[CandidateTemplate]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: CandidateTemplate*): Self = StObject.set(x, "candidates", js.Array(value*))
    
    inline def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
  }
}
