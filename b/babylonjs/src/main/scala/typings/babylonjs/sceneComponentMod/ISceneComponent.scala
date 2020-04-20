package typings.babylonjs.sceneComponentMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISceneComponent extends js.Object {
  /**
    * The name of the component. Each component must have a unique name.
    */
  var name: String
  /**
    * The scene the component belongs to.
    */
  var scene: Scene
  /**
    * Disposes the component and the associated ressources.
    */
  def dispose(): Unit
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  def rebuild(): Unit
  /**
    * Register the component to one instance of a scene.
    */
  def register(): Unit
}

object ISceneComponent {
  @scala.inline
  def apply(dispose: () => Unit, name: String, rebuild: () => Unit, register: () => Unit, scene: Scene): ISceneComponent = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneComponent]
  }
}

