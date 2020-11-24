package typings.babylonjs.sceneComponentMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneComponent extends js.Object {
  
  /**
    * Disposes the component and the associated ressources.
    */
  def dispose(): Unit = js.native
  
  /**
    * The name of the component. Each component must have a unique name.
    */
  var name: String = js.native
  
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  def rebuild(): Unit = js.native
  
  /**
    * Register the component to one instance of a scene.
    */
  def register(): Unit = js.native
  
  /**
    * The scene the component belongs to.
    */
  var scene: Scene = js.native
}
object ISceneComponent {
  
  @scala.inline
  def apply(dispose: () => Unit, name: String, rebuild: () => Unit, register: () => Unit, scene: Scene): ISceneComponent = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneComponent]
  }
  
  @scala.inline
  implicit class ISceneComponentOps[Self <: ISceneComponent] (val x: Self) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebuild(value: () => Unit): Self = this.set("rebuild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: () => Unit): Self = this.set("register", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScene(value: Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
  }
}
