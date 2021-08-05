package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchBrackets extends StObject {
  
  /**
    * Only use the character after the start position, never the one before it.
    */
  var afterCursor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Don't highlight a bracket in a line longer than this. Defaults to 1000.
    */
  var maxHighlightLineLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Ignore lines longer than this. Defaults to 10000.
    */
  var maxScanLineLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Stop after scanning this amount of lines without a successful match. Defaults to 1000.
    */
  var maxScanLines: js.UndefOr[Double] = js.undefined
  
  /**
    * Causes only matches where both brackets are at the same side of the start position to be considered.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object MatchBrackets {
  
  inline def apply(): MatchBrackets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchBrackets]
  }
  
  extension [Self <: MatchBrackets](x: Self) {
    
    inline def setAfterCursor(value: Boolean): Self = StObject.set(x, "afterCursor", value.asInstanceOf[js.Any])
    
    inline def setAfterCursorUndefined: Self = StObject.set(x, "afterCursor", js.undefined)
    
    inline def setMaxHighlightLineLength(value: Double): Self = StObject.set(x, "maxHighlightLineLength", value.asInstanceOf[js.Any])
    
    inline def setMaxHighlightLineLengthUndefined: Self = StObject.set(x, "maxHighlightLineLength", js.undefined)
    
    inline def setMaxScanLineLength(value: Double): Self = StObject.set(x, "maxScanLineLength", value.asInstanceOf[js.Any])
    
    inline def setMaxScanLineLengthUndefined: Self = StObject.set(x, "maxScanLineLength", js.undefined)
    
    inline def setMaxScanLines(value: Double): Self = StObject.set(x, "maxScanLines", value.asInstanceOf[js.Any])
    
    inline def setMaxScanLinesUndefined: Self = StObject.set(x, "maxScanLines", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
