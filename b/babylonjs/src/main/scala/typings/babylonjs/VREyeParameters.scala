package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VREyeParameters extends StObject {
  
  /** @deprecated */
  val fieldOfView: VRFieldOfView
  
  val offset: js.typedarray.Float32Array
  
  val renderHeight: Double
  
  val renderWidth: Double
}
object VREyeParameters {
  
  inline def apply(
    fieldOfView: VRFieldOfView,
    offset: js.typedarray.Float32Array,
    renderHeight: Double,
    renderWidth: Double
  ): VREyeParameters = {
    val __obj = js.Dynamic.literal(fieldOfView = fieldOfView.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], renderHeight = renderHeight.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VREyeParameters]
  }
  
  extension [Self <: VREyeParameters](x: Self) {
    
    inline def setFieldOfView(value: VRFieldOfView): Self = StObject.set(x, "fieldOfView", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: js.typedarray.Float32Array): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRenderHeight(value: Double): Self = StObject.set(x, "renderHeight", value.asInstanceOf[js.Any])
    
    inline def setRenderWidth(value: Double): Self = StObject.set(x, "renderWidth", value.asInstanceOf[js.Any])
  }
}
