package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurroundingTextInfo extends StObject {
  
  /** The beginning position of the selection. This value indicates caret position if is no selection. */
  var anchor: Double
  
  /** The ending position of the selection. This value indicates caret position if there is no selection. */
  var focus: Double
  
  /** The text around cursor. */
  var text: String
}
object SurroundingTextInfo {
  
  inline def apply(anchor: Double, focus: Double, text: String): SurroundingTextInfo = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurroundingTextInfo]
  }
  
  extension [Self <: SurroundingTextInfo](x: Self) {
    
    inline def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: Double): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
