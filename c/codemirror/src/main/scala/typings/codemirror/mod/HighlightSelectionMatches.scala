package typings.codemirror.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightSelectionMatches extends StObject {
  
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
  implicit class HighlightSelectionMatchesMutableBuilder[Self <: HighlightSelectionMatches] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotateScrollbar(value: Boolean): Self = StObject.set(x, "annotateScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotateScrollbarUndefined: Self = StObject.set(x, "annotateScrollbar", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setMinChars(value: Double): Self = StObject.set(x, "minChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCharsUndefined: Self = StObject.set(x, "minChars", js.undefined)
    
    @scala.inline
    def setShowToken(value: Boolean | RegExp): Self = StObject.set(x, "showToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTokenUndefined: Self = StObject.set(x, "showToken", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    @scala.inline
    def setWordsOnly(value: Boolean): Self = StObject.set(x, "wordsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsOnlyUndefined: Self = StObject.set(x, "wordsOnly", js.undefined)
  }
}
