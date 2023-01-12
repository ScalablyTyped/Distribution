package typings.colormap

import typings.colormap.colormapStrings.float
import typings.colormap.colormapStrings.hex
import typings.colormap.colormapStrings.rgba
import typings.colormap.colormapStrings.rgbaString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alpha[T /* <: hex | rgbaString | rgba | float */] extends StObject {
    
    var alpha: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var colormap: js.UndefOr[String | js.Array[Index]] = js.undefined
    
    var format: js.UndefOr[T] = js.undefined
    
    var nshades: js.UndefOr[Double] = js.undefined
  }
  object Alpha {
    
    inline def apply[T /* <: hex | rgbaString | rgba | float */](): Alpha[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alpha[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alpha[?], T /* <: hex | rgbaString | rgba | float */] (val x: Self & Alpha[T]) extends AnyVal {
      
      inline def setAlpha(value: Double | js.Array[Double]): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setAlphaVarargs(value: Double*): Self = StObject.set(x, "alpha", js.Array(value*))
      
      inline def setColormap(value: String | js.Array[Index]): Self = StObject.set(x, "colormap", value.asInstanceOf[js.Any])
      
      inline def setColormapUndefined: Self = StObject.set(x, "colormap", js.undefined)
      
      inline def setColormapVarargs(value: Index*): Self = StObject.set(x, "colormap", js.Array(value*))
      
      inline def setFormat(value: T): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setNshades(value: Double): Self = StObject.set(x, "nshades", value.asInstanceOf[js.Any])
      
      inline def setNshadesUndefined: Self = StObject.set(x, "nshades", js.undefined)
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var rgb: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  }
  object Index {
    
    inline def apply(
      index: Double,
      rgb: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setRgb(value: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
    }
  }
}
