package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISceneComponent extends StObject {
  
  /**
    * Disposes the component and the associated ressources.
    */
  def dispose(): Unit
  
  /**
    * The name of the component. Each component must have a unique name.
    */
  var name: String
  
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  def rebuild(): Unit
  
  /**
    * Register the component to one instance of a scene.
    */
  def register(): Unit
  
  /**
    * The scene the component belongs to.
    */
  var scene: Scene
}
object ISceneComponent {
  
  inline def apply(dispose: () => Unit, name: String, rebuild: () => Unit, register: () => Unit, scene: Scene): ISceneComponent = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneComponent]
  }
  
  extension [Self <: ISceneComponent](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRebuild(value: () => Unit): Self = StObject.set(x, "rebuild", js.Any.fromFunction0(value))
    
    inline def setRegister(value: () => Unit): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
