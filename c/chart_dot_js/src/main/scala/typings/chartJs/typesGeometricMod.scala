package typings.chartJs

import typings.chartJs.anon.PartialTRBLCorners
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGeometricMod {
  
  trait ChartArea extends StObject {
    
    var bottom: Double
    
    var height: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
    
    var width: Double
  }
  object ChartArea {
    
    inline def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): ChartArea = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartArea]
    }
    
    extension [Self <: ChartArea](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type CornerRadius = Double | PartialTRBLCorners
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoundedRect extends StObject {
    
    var h: Double
    
    var radius: js.UndefOr[CornerRadius] = js.undefined
    
    var w: Double
    
    var x: Double
    
    var y: Double
  }
  object RoundedRect {
    
    inline def apply(h: Double, w: Double, x: Double, y: Double): RoundedRect = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoundedRect]
    }
    
    extension [Self <: RoundedRect](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: CornerRadius): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait TRBL extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object TRBL {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): TRBL = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[TRBL]
    }
    
    extension [Self <: TRBL](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait TRBLCorners extends StObject {
    
    var bottomLeft: Double
    
    var bottomRight: Double
    
    var topLeft: Double
    
    var topRight: Double
  }
  object TRBLCorners {
    
    inline def apply(bottomLeft: Double, bottomRight: Double, topLeft: Double, topRight: Double): TRBLCorners = {
      val __obj = js.Dynamic.literal(bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TRBLCorners]
    }
    
    extension [Self <: TRBLCorners](x: Self) {
      
      inline def setBottomLeft(value: Double): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomRight(value: Double): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: Double): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopRight(value: Double): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
}
