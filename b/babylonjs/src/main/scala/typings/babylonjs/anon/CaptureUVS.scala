package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureUVS extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var captureUVS: js.UndefOr[Boolean] = js.undefined
  
  var normal: js.UndefOr[Vector3] = js.undefined
  
  var position: js.UndefOr[Vector3] = js.undefined
  
  var size: js.UndefOr[Vector3] = js.undefined
}
object CaptureUVS {
  
  inline def apply(): CaptureUVS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureUVS]
  }
  
  extension [Self <: CaptureUVS](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setCaptureUVS(value: Boolean): Self = StObject.set(x, "captureUVS", value.asInstanceOf[js.Any])
    
    inline def setCaptureUVSUndefined: Self = StObject.set(x, "captureUVS", js.undefined)
    
    inline def setNormal(value: Vector3): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSize(value: Vector3): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
