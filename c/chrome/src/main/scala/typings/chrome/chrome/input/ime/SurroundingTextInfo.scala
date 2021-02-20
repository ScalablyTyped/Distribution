package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SurroundingTextInfo extends StObject {
  
  /** The beginning position of the selection. This value indicates caret position if is no selection. */
  var anchor: Double = js.native
  
  /** The ending position of the selection. This value indicates caret position if there is no selection. */
  var focus: Double = js.native
  
  /** The text around cursor. */
  var text: String = js.native
}
object SurroundingTextInfo {
  
  @scala.inline
  def apply(anchor: Double, focus: Double, text: String): SurroundingTextInfo = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurroundingTextInfo]
  }
  
  @scala.inline
  implicit class SurroundingTextInfoMutableBuilder[Self <: SurroundingTextInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: Double): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
