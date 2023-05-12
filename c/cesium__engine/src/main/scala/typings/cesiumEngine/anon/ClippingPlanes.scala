package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Cesium3DTileStyle
import typings.cesiumEngine.mod.ClippingPlaneCollection
import typings.cesiumEngine.mod.Matrix4
import typings.cesiumEngine.mod.ShadowMode
import typings.cesiumEngine.mod.TimeIntervalCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClippingPlanes extends StObject {
  
  var clippingPlanes: js.UndefOr[ClippingPlaneCollection] = js.undefined
  
  var clock: typings.cesiumEngine.mod.Clock
  
  var intervals: TimeIntervalCollection
  
  var maximumMemoryUsage: js.UndefOr[Double] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  
  var shading: js.UndefOr[Any] = js.undefined
  
  var shadows: js.UndefOr[ShadowMode] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[Cesium3DTileStyle] = js.undefined
}
object ClippingPlanes {
  
  inline def apply(clock: typings.cesiumEngine.mod.Clock, intervals: TimeIntervalCollection): ClippingPlanes = {
    val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], intervals = intervals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClippingPlanes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClippingPlanes] (val x: Self) extends AnyVal {
    
    inline def setClippingPlanes(value: ClippingPlaneCollection): Self = StObject.set(x, "clippingPlanes", value.asInstanceOf[js.Any])
    
    inline def setClippingPlanesUndefined: Self = StObject.set(x, "clippingPlanes", js.undefined)
    
    inline def setClock(value: typings.cesiumEngine.mod.Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    inline def setIntervals(value: TimeIntervalCollection): Self = StObject.set(x, "intervals", value.asInstanceOf[js.Any])
    
    inline def setMaximumMemoryUsage(value: Double): Self = StObject.set(x, "maximumMemoryUsage", value.asInstanceOf[js.Any])
    
    inline def setMaximumMemoryUsageUndefined: Self = StObject.set(x, "maximumMemoryUsage", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    inline def setShading(value: Any): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
    
    inline def setShadows(value: ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStyle(value: Cesium3DTileStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
