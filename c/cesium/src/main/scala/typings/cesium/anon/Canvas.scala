package typings.cesium.anon

import typings.cesium.mod.MapMode2D
import typings.cesium.mod.MapProjection
import typings.std.Element
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas extends StObject {
  
  var canvas: HTMLCanvasElement
  
  var contextOptions: js.UndefOr[Any] = js.undefined
  
  var creditContainer: js.UndefOr[Element] = js.undefined
  
  var creditViewport: js.UndefOr[Element] = js.undefined
  
  var mapMode2D: js.UndefOr[MapMode2D] = js.undefined
  
  var mapProjection: js.UndefOr[MapProjection] = js.undefined
  
  var maximumRenderTimeChange: js.UndefOr[Double] = js.undefined
  
  var msaaSamples: js.UndefOr[Double] = js.undefined
  
  var orderIndependentTranslucency: js.UndefOr[Boolean] = js.undefined
  
  var requestRenderMode: js.UndefOr[Boolean] = js.undefined
  
  var scene3DOnly: js.UndefOr[Boolean] = js.undefined
  
  var shadows: js.UndefOr[Boolean] = js.undefined
}
object Canvas {
  
  inline def apply(canvas: HTMLCanvasElement): Canvas = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  
  extension [Self <: Canvas](x: Self) {
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setContextOptions(value: Any): Self = StObject.set(x, "contextOptions", value.asInstanceOf[js.Any])
    
    inline def setContextOptionsUndefined: Self = StObject.set(x, "contextOptions", js.undefined)
    
    inline def setCreditContainer(value: Element): Self = StObject.set(x, "creditContainer", value.asInstanceOf[js.Any])
    
    inline def setCreditContainerUndefined: Self = StObject.set(x, "creditContainer", js.undefined)
    
    inline def setCreditViewport(value: Element): Self = StObject.set(x, "creditViewport", value.asInstanceOf[js.Any])
    
    inline def setCreditViewportUndefined: Self = StObject.set(x, "creditViewport", js.undefined)
    
    inline def setMapMode2D(value: MapMode2D): Self = StObject.set(x, "mapMode2D", value.asInstanceOf[js.Any])
    
    inline def setMapMode2DUndefined: Self = StObject.set(x, "mapMode2D", js.undefined)
    
    inline def setMapProjection(value: MapProjection): Self = StObject.set(x, "mapProjection", value.asInstanceOf[js.Any])
    
    inline def setMapProjectionUndefined: Self = StObject.set(x, "mapProjection", js.undefined)
    
    inline def setMaximumRenderTimeChange(value: Double): Self = StObject.set(x, "maximumRenderTimeChange", value.asInstanceOf[js.Any])
    
    inline def setMaximumRenderTimeChangeUndefined: Self = StObject.set(x, "maximumRenderTimeChange", js.undefined)
    
    inline def setMsaaSamples(value: Double): Self = StObject.set(x, "msaaSamples", value.asInstanceOf[js.Any])
    
    inline def setMsaaSamplesUndefined: Self = StObject.set(x, "msaaSamples", js.undefined)
    
    inline def setOrderIndependentTranslucency(value: Boolean): Self = StObject.set(x, "orderIndependentTranslucency", value.asInstanceOf[js.Any])
    
    inline def setOrderIndependentTranslucencyUndefined: Self = StObject.set(x, "orderIndependentTranslucency", js.undefined)
    
    inline def setRequestRenderMode(value: Boolean): Self = StObject.set(x, "requestRenderMode", value.asInstanceOf[js.Any])
    
    inline def setRequestRenderModeUndefined: Self = StObject.set(x, "requestRenderMode", js.undefined)
    
    inline def setScene3DOnly(value: Boolean): Self = StObject.set(x, "scene3DOnly", value.asInstanceOf[js.Any])
    
    inline def setScene3DOnlyUndefined: Self = StObject.set(x, "scene3DOnly", js.undefined)
    
    inline def setShadows(value: Boolean): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
  }
}
