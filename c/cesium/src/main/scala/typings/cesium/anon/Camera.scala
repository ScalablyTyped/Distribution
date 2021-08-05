package typings.cesium.anon

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Camera extends StObject {
  
  var camera: js.UndefOr[typings.cesium.mod.Camera] = js.undefined
  
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
}
object Camera {
  
  inline def apply(): Camera = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Camera]
  }
  
  extension [Self <: Camera](x: Self) {
    
    inline def setCamera(value: typings.cesium.mod.Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
  }
}
