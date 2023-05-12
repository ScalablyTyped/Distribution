package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Camera extends StObject {
  
  var camera: typings.cesiumEngine.mod.Camera
  
  var color: js.UndefOr[typings.cesiumEngine.mod.Color] = js.undefined
  
  var frustumSplits: js.UndefOr[js.Array[Double]] = js.undefined
  
  var id: js.UndefOr[Any] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var updateOnChange: js.UndefOr[Boolean] = js.undefined
}
object Camera {
  
  inline def apply(camera: typings.cesiumEngine.mod.Camera): Camera = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Camera] (val x: Self) extends AnyVal {
    
    inline def setCamera(value: typings.cesiumEngine.mod.Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setColor(value: typings.cesiumEngine.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFrustumSplits(value: js.Array[Double]): Self = StObject.set(x, "frustumSplits", value.asInstanceOf[js.Any])
    
    inline def setFrustumSplitsUndefined: Self = StObject.set(x, "frustumSplits", js.undefined)
    
    inline def setFrustumSplitsVarargs(value: Double*): Self = StObject.set(x, "frustumSplits", js.Array(value*))
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setUpdateOnChange(value: Boolean): Self = StObject.set(x, "updateOnChange", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnChangeUndefined: Self = StObject.set(x, "updateOnChange", js.undefined)
  }
}
