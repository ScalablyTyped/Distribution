package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chart.js.chart.js/dist/chunks/helpers.core.TRBLCorners> */
trait PartialTRBLCorners extends StObject {
  
  var bottomLeft: js.UndefOr[Double] = js.undefined
  
  var bottomRight: js.UndefOr[Double] = js.undefined
  
  var topLeft: js.UndefOr[Double] = js.undefined
  
  var topRight: js.UndefOr[Double] = js.undefined
}
object PartialTRBLCorners {
  
  inline def apply(): PartialTRBLCorners = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTRBLCorners]
  }
  
  extension [Self <: PartialTRBLCorners](x: Self) {
    
    inline def setBottomLeft(value: Double): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
    
    inline def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
    
    inline def setBottomRight(value: Double): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
    
    inline def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
    
    inline def setTopLeft(value: Double): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
    
    inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
    
    inline def setTopRight(value: Double): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    
    inline def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
  }
}
