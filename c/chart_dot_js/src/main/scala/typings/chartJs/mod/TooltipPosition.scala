package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipPosition extends StObject {
  
  var x: Double
  
  var xAlign: js.UndefOr[TooltipXAlignment] = js.undefined
  
  var y: Double
  
  var yAlign: js.UndefOr[TooltipYAlignment] = js.undefined
}
object TooltipPosition {
  
  inline def apply(x: Double, y: Double): TooltipPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipPosition]
  }
  
  extension [Self <: TooltipPosition](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXAlign(value: TooltipXAlignment): Self = StObject.set(x, "xAlign", value.asInstanceOf[js.Any])
    
    inline def setXAlignUndefined: Self = StObject.set(x, "xAlign", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYAlign(value: TooltipYAlignment): Self = StObject.set(x, "yAlign", value.asInstanceOf[js.Any])
    
    inline def setYAlignUndefined: Self = StObject.set(x, "yAlign", js.undefined)
  }
}
