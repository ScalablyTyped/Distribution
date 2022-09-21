package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var columns: js.Array[Double]
  
  var gaps: Double
  
  var gutters: js.Array[Double]
  
  var margins: js.Array[Double]
  
  var maxWidth: Double
  
  var unit: String
}
object Columns {
  
  inline def apply(
    columns: js.Array[Double],
    gaps: Double,
    gutters: js.Array[Double],
    margins: js.Array[Double],
    maxWidth: Double,
    unit: String
  ): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], gutters = gutters.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setColumns(value: js.Array[Double]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: Double*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setGaps(value: Double): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
    
    inline def setGutters(value: js.Array[Double]): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    inline def setGuttersVarargs(value: Double*): Self = StObject.set(x, "gutters", js.Array(value*))
    
    inline def setMargins(value: js.Array[Double]): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMarginsVarargs(value: Double*): Self = StObject.set(x, "margins", js.Array(value*))
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
