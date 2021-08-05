package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionParameterSegment extends StObject {
  
  /** Index of the character to end this segment after. */
  var end: Double
  
  /** Index of the character to start this segment at */
  var start: Double
  
  /** The type of the underline to modify this segment. */
  var style: String
}
object CompositionParameterSegment {
  
  inline def apply(end: Double, start: Double, style: String): CompositionParameterSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionParameterSegment]
  }
  
  extension [Self <: CompositionParameterSegment](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
