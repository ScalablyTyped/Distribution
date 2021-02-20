package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneComponent extends StObject {
  
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
  implicit class ISceneComponentMutableBuilder[Self <: ISceneComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebuild(value: () => Unit): Self = StObject.set(x, "rebuild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: () => Unit): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
