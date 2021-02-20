package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CursorPositionParameters extends StObject {
  
  /** ID of the candidate to select. */
  var candidateID: Double = js.native
  
  /** ID of the context that owns the candidate window. */
  var contextID: Double = js.native
}
object CursorPositionParameters {
  
  @scala.inline
  def apply(candidateID: Double, contextID: Double): CursorPositionParameters = {
    val __obj = js.Dynamic.literal(candidateID = candidateID.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorPositionParameters]
  }
  
  @scala.inline
  implicit class CursorPositionParametersMutableBuilder[Self <: CursorPositionParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidateID(value: Double): Self = StObject.set(x, "candidateID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
  }
}
