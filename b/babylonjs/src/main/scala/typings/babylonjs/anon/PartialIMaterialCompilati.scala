package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IMaterialCompilationOptions> */
trait PartialIMaterialCompilati extends StObject {
  
  var clipPlane: js.UndefOr[Boolean] = js.undefined
  
  var useInstances: js.UndefOr[Boolean] = js.undefined
}
object PartialIMaterialCompilati {
  
  inline def apply(): PartialIMaterialCompilati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIMaterialCompilati]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIMaterialCompilati] (val x: Self) extends AnyVal {
    
    inline def setClipPlane(value: Boolean): Self = StObject.set(x, "clipPlane", value.asInstanceOf[js.Any])
    
    inline def setClipPlaneUndefined: Self = StObject.set(x, "clipPlane", js.undefined)
    
    inline def setUseInstances(value: Boolean): Self = StObject.set(x, "useInstances", value.asInstanceOf[js.Any])
    
    inline def setUseInstancesUndefined: Self = StObject.set(x, "useInstances", js.undefined)
  }
}
