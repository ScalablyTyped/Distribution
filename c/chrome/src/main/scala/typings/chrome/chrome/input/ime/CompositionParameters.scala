package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositionParameters extends js.Object {
  
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
  implicit class CompositionParametersOps[Self <: CompositionParameters] (val x: Self) extends AnyVal {
    
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
    def setContextID(value: Double): Self = this.set("contextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: Double): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsVarargs(value: CompositionParameterSegment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[CompositionParameterSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setSelectionEnd(value: Double): Self = this.set("selectionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionEnd: Self = this.set("selectionEnd", js.undefined)
    
    @scala.inline
    def setSelectionStart(value: Double): Self = this.set("selectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStart: Self = this.set("selectionStart", js.undefined)
  }
}
