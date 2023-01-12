package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorPositionParameters extends StObject {
  
  /** ID of the candidate to select. */
  var candidateID: Double
  
  /** ID of the context that owns the candidate window. */
  var contextID: Double
}
object CursorPositionParameters {
  
  inline def apply(candidateID: Double, contextID: Double): CursorPositionParameters = {
    val __obj = js.Dynamic.literal(candidateID = candidateID.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorPositionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CursorPositionParameters] (val x: Self) extends AnyVal {
    
    inline def setCandidateID(value: Double): Self = StObject.set(x, "candidateID", value.asInstanceOf[js.Any])
    
    inline def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
  }
}
