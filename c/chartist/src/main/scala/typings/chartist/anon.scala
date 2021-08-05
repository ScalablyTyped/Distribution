package typings.chartist

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AreaBase extends StObject {
    
    var areaBase: js.UndefOr[Double] = js.undefined
    
    var lineSmooth: js.UndefOr[js.Function | Boolean] = js.undefined
    
    var showArea: js.UndefOr[Boolean] = js.undefined
    
    var showLine: js.UndefOr[Boolean] = js.undefined
    
    var showPoint: js.UndefOr[Boolean] = js.undefined
  }
  object AreaBase {
    
    inline def apply(): AreaBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AreaBase]
    }
    
    extension [Self <: AreaBase](x: Self) {
      
      inline def setAreaBase(value: Double): Self = StObject.set(x, "areaBase", value.asInstanceOf[js.Any])
      
      inline def setAreaBaseUndefined: Self = StObject.set(x, "areaBase", js.undefined)
      
      inline def setLineSmooth(value: js.Function | Boolean): Self = StObject.set(x, "lineSmooth", value.asInstanceOf[js.Any])
      
      inline def setLineSmoothUndefined: Self = StObject.set(x, "lineSmooth", js.undefined)
      
      inline def setShowArea(value: Boolean): Self = StObject.set(x, "showArea", value.asInstanceOf[js.Any])
      
      inline def setShowAreaUndefined: Self = StObject.set(x, "showArea", js.undefined)
      
      inline def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      inline def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
      inline def setShowPoint(value: Boolean): Self = StObject.set(x, "showPoint", value.asInstanceOf[js.Any])
      
      inline def setShowPointUndefined: Self = StObject.set(x, "showPoint", js.undefined)
    }
  }
  
  trait Max extends StObject {
    
    var max: Double
    
    var min: Double
  }
  object Max {
    
    inline def apply(max: Double, min: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double | Date
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double | Date, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double | Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Y {
    
    inline def apply(): Y = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Y]
    }
    
    extension [Self <: Y](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
