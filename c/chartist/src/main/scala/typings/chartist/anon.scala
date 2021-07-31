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
    
    @scala.inline
    def apply(): AreaBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AreaBase]
    }
    
    @scala.inline
    implicit class AreaBaseMutableBuilder[Self <: AreaBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAreaBase(value: Double): Self = StObject.set(x, "areaBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaBaseUndefined: Self = StObject.set(x, "areaBase", js.undefined)
      
      @scala.inline
      def setLineSmooth(value: js.Function | Boolean): Self = StObject.set(x, "lineSmooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineSmoothUndefined: Self = StObject.set(x, "lineSmooth", js.undefined)
      
      @scala.inline
      def setShowArea(value: Boolean): Self = StObject.set(x, "showArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAreaUndefined: Self = StObject.set(x, "showArea", js.undefined)
      
      @scala.inline
      def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
      @scala.inline
      def setShowPoint(value: Boolean): Self = StObject.set(x, "showPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPointUndefined: Self = StObject.set(x, "showPoint", js.undefined)
    }
  }
  
  trait Max extends StObject {
    
    var max: Double
    
    var min: Double
  }
  object Max {
    
    @scala.inline
    def apply(max: Double, min: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double | Date
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double | Date, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double | Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Y {
    
    @scala.inline
    def apply(): Y = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
