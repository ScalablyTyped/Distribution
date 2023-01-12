package typings.cobe

import typings.std.HTMLCanvasElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(canvas: HTMLCanvasElement, opts: Options): Any = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("cobe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Marker extends StObject {
    
    var location: js.Tuple2[Double, Double]
    
    var size: Double
  }
  object Marker {
    
    inline def apply(location: js.Tuple2[Double, Double], size: Double): Marker = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Marker] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var baseColor: js.UndefOr[js.Array[Double]] = js.undefined
    
    var dark: js.UndefOr[Double] = js.undefined
    
    var devicePixelRatio: js.UndefOr[Double] = js.undefined
    
    var diffuse: js.UndefOr[Double] = js.undefined
    
    var glowColor: js.UndefOr[js.Array[Double]] = js.undefined
    
    var height: Double
    
    var mapBrightness: js.UndefOr[Double] = js.undefined
    
    var mapSamples: js.UndefOr[Double] = js.undefined
    
    var markerColor: js.UndefOr[js.Array[Double]] = js.undefined
    
    var markers: js.Array[Marker]
    
    var onRender: js.UndefOr[js.Function1[/* state */ Record[String, Any], Unit]] = js.undefined
    
    var phi: js.UndefOr[Double] = js.undefined
    
    var theta: js.UndefOr[Double] = js.undefined
    
    var width: Double
  }
  object Options {
    
    inline def apply(height: Double, markers: js.Array[Marker], width: Double): Options = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBaseColor(value: js.Array[Double]): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      inline def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      inline def setBaseColorVarargs(value: Double*): Self = StObject.set(x, "baseColor", js.Array(value*))
      
      inline def setDark(value: Double): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      inline def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setDevicePixelRatioUndefined: Self = StObject.set(x, "devicePixelRatio", js.undefined)
      
      inline def setDiffuse(value: Double): Self = StObject.set(x, "diffuse", value.asInstanceOf[js.Any])
      
      inline def setDiffuseUndefined: Self = StObject.set(x, "diffuse", js.undefined)
      
      inline def setGlowColor(value: js.Array[Double]): Self = StObject.set(x, "glowColor", value.asInstanceOf[js.Any])
      
      inline def setGlowColorUndefined: Self = StObject.set(x, "glowColor", js.undefined)
      
      inline def setGlowColorVarargs(value: Double*): Self = StObject.set(x, "glowColor", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMapBrightness(value: Double): Self = StObject.set(x, "mapBrightness", value.asInstanceOf[js.Any])
      
      inline def setMapBrightnessUndefined: Self = StObject.set(x, "mapBrightness", js.undefined)
      
      inline def setMapSamples(value: Double): Self = StObject.set(x, "mapSamples", value.asInstanceOf[js.Any])
      
      inline def setMapSamplesUndefined: Self = StObject.set(x, "mapSamples", js.undefined)
      
      inline def setMarkerColor(value: js.Array[Double]): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      inline def setMarkerColorVarargs(value: Double*): Self = StObject.set(x, "markerColor", js.Array(value*))
      
      inline def setMarkers(value: js.Array[Marker]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersVarargs(value: Marker*): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setOnRender(value: /* state */ Record[String, Any] => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction1(value))
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setPhi(value: Double): Self = StObject.set(x, "phi", value.asInstanceOf[js.Any])
      
      inline def setPhiUndefined: Self = StObject.set(x, "phi", js.undefined)
      
      inline def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
