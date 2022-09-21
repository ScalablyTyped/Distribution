package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaneRotationGizmoOptions extends StObject {
  
  /**
    * Color to use for the plane rotation gizmo
    */
  var color: js.UndefOr[Color3] = js.undefined
}
object PlaneRotationGizmoOptions {
  
  inline def apply(): PlaneRotationGizmoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaneRotationGizmoOptions]
  }
  
  extension [Self <: PlaneRotationGizmoOptions](x: Self) {
    
    inline def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
