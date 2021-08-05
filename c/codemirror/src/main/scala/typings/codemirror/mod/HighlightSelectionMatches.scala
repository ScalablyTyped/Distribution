package typings.codemirror.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightSelectionMatches extends StObject {
  
  /**
    * If annotateScrollbar is enabled, the occurences will be highlighted on the scrollbar via the matchesonscrollbar addon.
    */
  var annotateScrollbar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used to specify how much time to wait, in milliseconds, before highlighting the matches (default is 100). 
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum amount of selected characters that triggers a highlight (default 2).
    */
  var minChars: js.UndefOr[Double] = js.undefined
  
  /**
    * Can be set to true or to a regexp matching the characters that make up a word.
    */
  var showToken: js.UndefOr[Boolean | RegExp] = js.undefined
  
  /**
    * The style to be used to highlight the matches (default "matchhighlight", which will correspond to CSS class cm-matchhighlight).
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Controls whether whitespace is trimmed from the selection.
    */
  var trim: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If wordsOnly is enabled, the matches will be highlighted only if the selected text is a word.
    */
  var wordsOnly: js.UndefOr[Boolean] = js.undefined
}
object HighlightSelectionMatches {
  
  inline def apply(): HighlightSelectionMatches = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightSelectionMatches]
  }
  
  extension [Self <: HighlightSelectionMatches](x: Self) {
    
    inline def setAnnotateScrollbar(value: Boolean): Self = StObject.set(x, "annotateScrollbar", value.asInstanceOf[js.Any])
    
    inline def setAnnotateScrollbarUndefined: Self = StObject.set(x, "annotateScrollbar", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setMinChars(value: Double): Self = StObject.set(x, "minChars", value.asInstanceOf[js.Any])
    
    inline def setMinCharsUndefined: Self = StObject.set(x, "minChars", js.undefined)
    
    inline def setShowToken(value: Boolean | RegExp): Self = StObject.set(x, "showToken", value.asInstanceOf[js.Any])
    
    inline def setShowTokenUndefined: Self = StObject.set(x, "showToken", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    inline def setWordsOnly(value: Boolean): Self = StObject.set(x, "wordsOnly", value.asInstanceOf[js.Any])
    
    inline def setWordsOnlyUndefined: Self = StObject.set(x, "wordsOnly", js.undefined)
  }
}
