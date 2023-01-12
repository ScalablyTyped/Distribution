package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionParameters extends StObject {
  
  /** ID of the context where the composition text will be set */
  var contextID: Double
  
  /** Position in the text of the cursor. */
  var cursor: Double
  
  /** Optional. List of segments and their associated types. */
  var segments: js.UndefOr[js.Array[CompositionParameterSegment]] = js.undefined
  
  /** Optional. Position in the text that the selection ends at. */
  var selectionEnd: js.UndefOr[Double] = js.undefined
  
  /** Optional. Position in the text that the selection starts at. */
  var selectionStart: js.UndefOr[Double] = js.undefined
  
  /** Text to set */
  var text: String
}
object CompositionParameters {
  
  inline def apply(contextID: Double, cursor: Double, text: String): CompositionParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositionParameters] (val x: Self) extends AnyVal {
    
    inline def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
    
    inline def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: js.Array[CompositionParameterSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: CompositionParameterSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
    
    inline def setSelectionEndUndefined: Self = StObject.set(x, "selectionEnd", js.undefined)
    
    inline def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
    
    inline def setSelectionStartUndefined: Self = StObject.set(x, "selectionStart", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
