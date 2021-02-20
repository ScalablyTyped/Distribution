package typings.cesium.anon

import typings.cesium.mod.MapMode2D
import typings.cesium.mod.MapProjection
import typings.std.Element
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextOptions extends StObject {
  
  var canvas: HTMLCanvasElement = js.native
  
  var contextOptions: js.UndefOr[js.Any] = js.native
  
  var creditContainer: js.UndefOr[Element] = js.native
  
  var creditViewport: js.UndefOr[Element] = js.native
  
  var mapMode2D: js.UndefOr[MapMode2D] = js.native
  
  var mapProjection: js.UndefOr[MapProjection] = js.native
  
  var maximumRenderTimeChange: js.UndefOr[Double] = js.native
  
  var orderIndependentTranslucency: js.UndefOr[Boolean] = js.native
  
  var requestRenderMode: js.UndefOr[Boolean] = js.native
  
  var scene3DOnly: js.UndefOr[Boolean] = js.native
  
  var shadows: js.UndefOr[Boolean] = js.native
  
  var terrainExaggeration: js.UndefOr[Double] = js.native
}
object ContextOptions {
  
  @scala.inline
  def apply(canvas: HTMLCanvasElement): ContextOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
  
  @scala.inline
  implicit class ContextOptionsMutableBuilder[Self <: ContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextOptions(value: js.Any): Self = StObject.set(x, "contextOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextOptionsUndefined: Self = StObject.set(x, "contextOptions", js.undefined)
    
    @scala.inline
    def setCreditContainer(value: Element): Self = StObject.set(x, "creditContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditContainerUndefined: Self = StObject.set(x, "creditContainer", js.undefined)
    
    @scala.inline
    def setCreditViewport(value: Element): Self = StObject.set(x, "creditViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditViewportUndefined: Self = StObject.set(x, "creditViewport", js.undefined)
    
    @scala.inline
    def setMapMode2D(value: MapMode2D): Self = StObject.set(x, "mapMode2D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapMode2DUndefined: Self = StObject.set(x, "mapMode2D", js.undefined)
    
    @scala.inline
    def setMapProjection(value: MapProjection): Self = StObject.set(x, "mapProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapProjectionUndefined: Self = StObject.set(x, "mapProjection", js.undefined)
    
    @scala.inline
    def setMaximumRenderTimeChange(value: Double): Self = StObject.set(x, "maximumRenderTimeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumRenderTimeChangeUndefined: Self = StObject.set(x, "maximumRenderTimeChange", js.undefined)
    
    @scala.inline
    def setOrderIndependentTranslucency(value: Boolean): Self = StObject.set(x, "orderIndependentTranslucency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIndependentTranslucencyUndefined: Self = StObject.set(x, "orderIndependentTranslucency", js.undefined)
    
    @scala.inline
    def setRequestRenderMode(value: Boolean): Self = StObject.set(x, "requestRenderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestRenderModeUndefined: Self = StObject.set(x, "requestRenderMode", js.undefined)
    
    @scala.inline
    def setScene3DOnly(value: Boolean): Self = StObject.set(x, "scene3DOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene3DOnlyUndefined: Self = StObject.set(x, "scene3DOnly", js.undefined)
    
    @scala.inline
    def setShadows(value: Boolean): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setTerrainExaggeration(value: Double): Self = StObject.set(x, "terrainExaggeration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerrainExaggerationUndefined: Self = StObject.set(x, "terrainExaggeration", js.undefined)
  }
}
