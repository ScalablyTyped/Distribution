package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineMetrics extends StObject {
  
  /**
    * The final computed ascent for the line. This can be impacted by
    * the strut, height, scaling, as well as outlying runs that are very tall.
    */
  var ascent: Double
  
  /** The y position of the baseline for this line from the top of the paragraph. */
  var baseline: Double
  
  /**
    * The final computed descent for the line. This can be impacted by
    * the strut, height, scaling, as well as outlying runs that are very tall.
    */
  var descent: Double
  
  var endExcludingWhitespaces: Double
  
  var endIncludingNewline: Double
  
  /** The index in the text buffer the line ends. */
  var endIndex: Double
  
  /** round(ascent + descent) */
  var height: Double
  
  /** True if the line ends in a hard break (e.g. newline) */
  var isHardBreak: Boolean
  
  /** The left edge of the line. The right edge can be obtained with `left + width` */
  var left: Double
  
  /** Zero indexed line number. */
  var lineNumber: Double
  
  /** The index in the text buffer the line begins. */
  var startIndex: Double
  
  /** width of the line */
  var width: Double
}
object LineMetrics {
  
  inline def apply(
    ascent: Double,
    baseline: Double,
    descent: Double,
    endExcludingWhitespaces: Double,
    endIncludingNewline: Double,
    endIndex: Double,
    height: Double,
    isHardBreak: Boolean,
    left: Double,
    lineNumber: Double,
    startIndex: Double,
    width: Double
  ): LineMetrics = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], endExcludingWhitespaces = endExcludingWhitespaces.asInstanceOf[js.Any], endIncludingNewline = endIncludingNewline.asInstanceOf[js.Any], endIndex = endIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isHardBreak = isHardBreak.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineMetrics]
  }
  
  extension [Self <: LineMetrics](x: Self) {
    
    inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
    
    inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
    
    inline def setEndExcludingWhitespaces(value: Double): Self = StObject.set(x, "endExcludingWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setEndIncludingNewline(value: Double): Self = StObject.set(x, "endIncludingNewline", value.asInstanceOf[js.Any])
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsHardBreak(value: Boolean): Self = StObject.set(x, "isHardBreak", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
