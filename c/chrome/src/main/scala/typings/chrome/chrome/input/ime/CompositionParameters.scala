package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositionParameters extends StObject {
  
  /** ID of the context where the composition text will be set */
  var contextID: Double = js.native
  
  /** Position in the text of the cursor. */
  var cursor: Double = js.native
  
  /** Optional. List of segments and their associated types. */
  var segments: js.UndefOr[js.Array[CompositionParameterSegment]] = js.native
  
  /** Optional. Position in the text that the selection ends at. */
  var selectionEnd: js.UndefOr[Double] = js.native
  
  /** Optional. Position in the text that the selection starts at. */
  var selectionStart: js.UndefOr[Double] = js.native
  
  /** Text to set */
  var text: String = js.native
}
object CompositionParameters {
  
  @scala.inline
  def apply(contextID: Double, cursor: Double, text: String): CompositionParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionParameters]
  }
  
  @scala.inline
  implicit class CompositionParametersMutableBuilder[Self <: CompositionParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegments(value: js.Array[CompositionParameterSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: CompositionParameterSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionEndUndefined: Self = StObject.set(x, "selectionEnd", js.undefined)
    
    @scala.inline
    def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStartUndefined: Self = StObject.set(x, "selectionStart", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
