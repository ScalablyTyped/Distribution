package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IMaterialCompilationOptions> */
@js.native
trait PartialIMaterialCompilati extends StObject {
  
  var clipPlane: js.UndefOr[Boolean] = js.native
  
  var useInstances: js.UndefOr[Boolean] = js.native
}
object PartialIMaterialCompilati {
  
  @scala.inline
  def apply(): PartialIMaterialCompilati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIMaterialCompilati]
  }
  
  @scala.inline
  implicit class PartialIMaterialCompilatiMutableBuilder[Self <: PartialIMaterialCompilati] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipPlane(value: Boolean): Self = StObject.set(x, "clipPlane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlaneUndefined: Self = StObject.set(x, "clipPlane", js.undefined)
    
    @scala.inline
    def setUseInstances(value: Boolean): Self = StObject.set(x, "useInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseInstancesUndefined: Self = StObject.set(x, "useInstances", js.undefined)
  }
}
