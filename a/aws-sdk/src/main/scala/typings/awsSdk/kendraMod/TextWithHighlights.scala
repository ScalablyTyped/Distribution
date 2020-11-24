package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextWithHighlights extends js.Object {
  
  /**
    * The beginning and end of the text that should be highlighted.
    */
  var Highlights: js.UndefOr[HighlightList] = js.native
  
  /**
    * The text to display to the user.
    */
  var Text: js.UndefOr[String] = js.native
}
object TextWithHighlights {
  
  @scala.inline
  def apply(): TextWithHighlights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextWithHighlights]
  }
  
  @scala.inline
  implicit class TextWithHighlightsOps[Self <: TextWithHighlights] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHighlightsVarargs(value: Highlight*): Self = this.set("Highlights", js.Array(value :_*))
    
    @scala.inline
    def setHighlights(value: HighlightList): Self = this.set("Highlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlights: Self = this.set("Highlights", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
  }
}
