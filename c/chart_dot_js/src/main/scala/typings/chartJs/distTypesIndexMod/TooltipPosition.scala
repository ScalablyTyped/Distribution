package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesGeometricMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipPosition
  extends StObject
     with Point {
  
  var xAlign: js.UndefOr[TooltipXAlignment] = js.undefined
  
  var yAlign: js.UndefOr[TooltipYAlignment] = js.undefined
}
object TooltipPosition {
  
  inline def apply(x: Double, y: Double): TooltipPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipPosition] (val x: Self) extends AnyVal {
    
    inline def setXAlign(value: TooltipXAlignment): Self = StObject.set(x, "xAlign", value.asInstanceOf[js.Any])
    
    inline def setXAlignUndefined: Self = StObject.set(x, "xAlign", js.undefined)
    
    inline def setYAlign(value: TooltipYAlignment): Self = StObject.set(x, "yAlign", value.asInstanceOf[js.Any])
    
    inline def setYAlignUndefined: Self = StObject.set(x, "yAlign", js.undefined)
  }
}
