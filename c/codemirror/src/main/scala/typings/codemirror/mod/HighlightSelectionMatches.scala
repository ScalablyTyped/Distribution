package typings.codemirror.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightSelectionMatches extends js.Object {
  
  /**
    * If annotateScrollbar is enabled, the occurences will be highlighted on the scrollbar via the matchesonscrollbar addon.
    */
  var annotateScrollbar: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to specify how much time to wait, in milliseconds, before highlighting the matches (default is 100). 
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Minimum amount of selected characters that triggers a highlight (default 2).
    */
  var minChars: js.UndefOr[Double] = js.native
  
  /**
    * Can be set to true or to a regexp matching the characters that make up a word.
    */
  var showToken: js.UndefOr[Boolean | RegExp] = js.native
  
  /**
    * The style to be used to highlight the matches (default "matchhighlight", which will correspond to CSS class cm-matchhighlight).
    */
  var style: js.UndefOr[String] = js.native
  
  /**
    * Controls whether whitespace is trimmed from the selection.
    */
  var trim: js.UndefOr[Boolean] = js.native
  
  /**
    * If wordsOnly is enabled, the matches will be highlighted only if the selected text is a word.
    */
  var wordsOnly: js.UndefOr[Boolean] = js.native
}
object HighlightSelectionMatches {
  
  @scala.inline
  def apply(): HighlightSelectionMatches = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightSelectionMatches]
  }
  
  @scala.inline
  implicit class HighlightSelectionMatchesOps[Self <: HighlightSelectionMatches] (val x: Self) extends AnyVal {
    
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
    def setAnnotateScrollbar(value: Boolean): Self = this.set("annotateScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotateScrollbar: Self = this.set("annotateScrollbar", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setMinChars(value: Double): Self = this.set("minChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinChars: Self = this.set("minChars", js.undefined)
    
    @scala.inline
    def setShowToken(value: Boolean | RegExp): Self = this.set("showToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowToken: Self = this.set("showToken", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setWordsOnly(value: Boolean): Self = this.set("wordsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordsOnly: Self = this.set("wordsOnly", js.undefined)
  }
}
