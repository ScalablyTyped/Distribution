package typings.cesium.anon

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas extends StObject {
  
  var camera: typings.cesium.mod.Camera
  
  var canvas: HTMLCanvasElement
  
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var sourceUri: js.UndefOr[String] = js.undefined
}
object Canvas {
  
  inline def apply(camera: typings.cesium.mod.Camera, canvas: HTMLCanvasElement): Canvas = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  
  extension [Self <: Canvas](x: Self) {
    
    inline def setCamera(value: typings.cesium.mod.Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setClampToGround(value: Boolean): Self = StObject.set(x, "clampToGround", value.asInstanceOf[js.Any])
    
    inline def setClampToGroundUndefined: Self = StObject.set(x, "clampToGround", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
  }
}
