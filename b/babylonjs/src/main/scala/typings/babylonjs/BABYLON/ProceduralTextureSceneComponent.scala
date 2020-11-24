package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProceduralTextureSceneComponent extends ISceneComponent {
  
  var _beforeClear: js.Any = js.native
}
object ProceduralTextureSceneComponent {
  
  @scala.inline
  def apply(
    _beforeClear: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): ProceduralTextureSceneComponent = {
    val __obj = js.Dynamic.literal(_beforeClear = _beforeClear.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProceduralTextureSceneComponent]
  }
  
  @scala.inline
  implicit class ProceduralTextureSceneComponentOps[Self <: ProceduralTextureSceneComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_beforeClear(value: js.Any): Self = this.set("_beforeClear", value.asInstanceOf[js.Any])
  }
}
