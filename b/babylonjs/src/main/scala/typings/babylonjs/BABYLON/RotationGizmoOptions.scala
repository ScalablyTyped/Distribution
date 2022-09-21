package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationGizmoOptions extends StObject {
  
  /**
    * When set, the gizmo will always appear the same size no matter where the camera is (default: true)
    */
  var updateScale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specific options for xGizmo
    */
  var xOptions: js.UndefOr[PlaneRotationGizmoOptions] = js.undefined
  
  /**
    * Specific options for yGizmo
    */
  var yOptions: js.UndefOr[PlaneRotationGizmoOptions] = js.undefined
  
  /**
    * Specific options for zGizmo
    */
  var zOptions: js.UndefOr[PlaneRotationGizmoOptions] = js.undefined
}
object RotationGizmoOptions {
  
  inline def apply(): RotationGizmoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationGizmoOptions]
  }
  
  extension [Self <: RotationGizmoOptions](x: Self) {
    
    inline def setUpdateScale(value: Boolean): Self = StObject.set(x, "updateScale", value.asInstanceOf[js.Any])
    
    inline def setUpdateScaleUndefined: Self = StObject.set(x, "updateScale", js.undefined)
    
    inline def setXOptions(value: PlaneRotationGizmoOptions): Self = StObject.set(x, "xOptions", value.asInstanceOf[js.Any])
    
    inline def setXOptionsUndefined: Self = StObject.set(x, "xOptions", js.undefined)
    
    inline def setYOptions(value: PlaneRotationGizmoOptions): Self = StObject.set(x, "yOptions", value.asInstanceOf[js.Any])
    
    inline def setYOptionsUndefined: Self = StObject.set(x, "yOptions", js.undefined)
    
    inline def setZOptions(value: PlaneRotationGizmoOptions): Self = StObject.set(x, "zOptions", value.asInstanceOf[js.Any])
    
    inline def setZOptionsUndefined: Self = StObject.set(x, "zOptions", js.undefined)
  }
}
