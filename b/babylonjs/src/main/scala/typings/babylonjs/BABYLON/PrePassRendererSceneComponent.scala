package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrePassRendererSceneComponent extends ISceneComponent {
  
  var _afterCameraDraw: js.Any = js.native
  
  var _afterRenderingMeshStage: js.Any = js.native
  
  var _beforeCameraDraw: js.Any = js.native
  
  var _beforeClearStage: js.Any = js.native
  
  var _beforeRenderingMeshStage: js.Any = js.native
}
object PrePassRendererSceneComponent {
  
  @scala.inline
  def apply(
    _afterCameraDraw: js.Any,
    _afterRenderingMeshStage: js.Any,
    _beforeCameraDraw: js.Any,
    _beforeClearStage: js.Any,
    _beforeRenderingMeshStage: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): PrePassRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_afterCameraDraw = _afterCameraDraw.asInstanceOf[js.Any], _afterRenderingMeshStage = _afterRenderingMeshStage.asInstanceOf[js.Any], _beforeCameraDraw = _beforeCameraDraw.asInstanceOf[js.Any], _beforeClearStage = _beforeClearStage.asInstanceOf[js.Any], _beforeRenderingMeshStage = _beforeRenderingMeshStage.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrePassRendererSceneComponent]
  }
  
  @scala.inline
  implicit class PrePassRendererSceneComponentOps[Self <: PrePassRendererSceneComponent] (val x: Self) extends AnyVal {
    
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
    def set_afterCameraDraw(value: js.Any): Self = this.set("_afterCameraDraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_afterRenderingMeshStage(value: js.Any): Self = this.set("_afterRenderingMeshStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_beforeCameraDraw(value: js.Any): Self = this.set("_beforeCameraDraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_beforeClearStage(value: js.Any): Self = this.set("_beforeClearStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_beforeRenderingMeshStage(value: js.Any): Self = this.set("_beforeRenderingMeshStage", value.asInstanceOf[js.Any])
  }
}
