package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryBufferRendererSceneComponent extends ISceneComponent {
  
  var _gatherRenderTargets: js.Any = js.native
}
object GeometryBufferRendererSceneComponent {
  
  @scala.inline
  def apply(
    _gatherRenderTargets: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): GeometryBufferRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_gatherRenderTargets = _gatherRenderTargets.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryBufferRendererSceneComponent]
  }
  
  @scala.inline
  implicit class GeometryBufferRendererSceneComponentMutableBuilder[Self <: GeometryBufferRendererSceneComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_gatherRenderTargets(value: js.Any): Self = StObject.set(x, "_gatherRenderTargets", value.asInstanceOf[js.Any])
  }
}
