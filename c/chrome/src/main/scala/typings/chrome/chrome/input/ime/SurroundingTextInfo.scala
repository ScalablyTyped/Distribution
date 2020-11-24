package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SurroundingTextInfo extends js.Object {
  
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
  implicit class SurroundingTextInfoOps[Self <: SurroundingTextInfo] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: Double): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: Double): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
