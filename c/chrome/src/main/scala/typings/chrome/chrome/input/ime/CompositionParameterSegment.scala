package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositionParameterSegment extends StObject {
  
  /** Index of the character to end this segment after. */
  var end: Double = js.native
  
  /** Index of the character to start this segment at */
  var start: Double = js.native
  
  /** The type of the underline to modify this segment. */
  var style: String = js.native
}
object CompositionParameterSegment {
  
  @scala.inline
  def apply(end: Double, start: Double, style: String): CompositionParameterSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionParameterSegment]
  }
  
  @scala.inline
  implicit class CompositionParameterSegmentMutableBuilder[Self <: CompositionParameterSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
