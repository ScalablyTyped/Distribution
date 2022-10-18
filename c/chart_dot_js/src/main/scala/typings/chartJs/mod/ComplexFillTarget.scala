package typings.chartJs.mod

import typings.chartJs.typesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplexFillTarget extends StObject {
  
  /**
    * If no color is set, the default color will be the background color of the chart.
    */
  var above: Color
  
  /**
    * Same as the above.
    */
  var below: Color
  
  /**
    * The accepted values are the same as the filling mode values, so you may use absolute and relative dataset indexes and/or boundaries.
    */
  var target: FillTarget
}
object ComplexFillTarget {
  
  inline def apply(above: Color, below: Color, target: FillTarget): ComplexFillTarget = {
    val __obj = js.Dynamic.literal(above = above.asInstanceOf[js.Any], below = below.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexFillTarget]
  }
  
  extension [Self <: ComplexFillTarget](x: Self) {
    
    inline def setAbove(value: Color): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
    
    inline def setBelow(value: Color): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: FillTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
