package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapedLine extends StObject {
  
  // bottom y-coordinate for the line
  var baseline: Double
  
  // top y-coordinate for the line
  var bottom: Double
  
  // baseline y-coordinate for the line
  var runs: js.Array[GlyphRun]
  
  var textRange: Range
  
  // first and last character offsets for the line (derived from runs[])
  var top: Double
}
object ShapedLine {
  
  inline def apply(baseline: Double, bottom: Double, runs: js.Array[GlyphRun], textRange: Range, top: Double): ShapedLine = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], textRange = textRange.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapedLine]
  }
  
  extension [Self <: ShapedLine](x: Self) {
    
    inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setRuns(value: js.Array[GlyphRun]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    inline def setRunsVarargs(value: GlyphRun*): Self = StObject.set(x, "runs", js.Array(value*))
    
    inline def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
