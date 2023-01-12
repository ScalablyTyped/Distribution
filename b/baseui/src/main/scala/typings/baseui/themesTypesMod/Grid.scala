package typings.baseui.themesTypesMod

import typings.baseui.layoutGridTypesMod.CSSLengthUnit
import typings.baseui.layoutGridTypesMod.Responsive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grid extends StObject {
  
  var columns: Responsive[Double]
  
  var gaps: Responsive[Double]
  
  var gutters: Responsive[Double]
  
  var margins: Responsive[Double]
  
  var maxWidth: Double
  
  var unit: CSSLengthUnit
}
object Grid {
  
  inline def apply(
    columns: Responsive[Double],
    gaps: Responsive[Double],
    gutters: Responsive[Double],
    margins: Responsive[Double],
    maxWidth: Double,
    unit: CSSLengthUnit
  ): Grid = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], gutters = gutters.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Grid] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: Responsive[Double]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: Double*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setGaps(value: Responsive[Double]): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
    
    inline def setGapsVarargs(value: Double*): Self = StObject.set(x, "gaps", js.Array(value*))
    
    inline def setGutters(value: Responsive[Double]): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    inline def setGuttersVarargs(value: Double*): Self = StObject.set(x, "gutters", js.Array(value*))
    
    inline def setMargins(value: Responsive[Double]): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMarginsVarargs(value: Double*): Self = StObject.set(x, "margins", js.Array(value*))
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: CSSLengthUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
