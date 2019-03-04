package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a scene component.
  *
  * This is used to decouple the dependency the scene is having on the different workloads like
  * layers, post processes...
  */
trait ISceneComponent extends js.Object {
  /**
    * The name of the component. Each component must have a unique name.
    */
  var name: java.lang.String
  /**
    * The scene the component belongs to.
    */
  var scene: Scene
  /**
    * Disposes the component and the associated ressources.
    */
  def dispose(): scala.Unit
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  def rebuild(): scala.Unit
  /**
    * Register the component to one instance of a scene.
    */
  def register(): scala.Unit
}

object ISceneComponent {
  @scala.inline
  def apply(
    dispose: js.Function0[scala.Unit],
    name: java.lang.String,
    rebuild: js.Function0[scala.Unit],
    register: js.Function0[scala.Unit],
    scene: Scene
  ): ISceneComponent = {
    val __obj = js.Dynamic.literal(dispose = dispose, name = name, rebuild = rebuild, register = register, scene = scene)
  
    __obj.asInstanceOf[ISceneComponent]
  }
}

