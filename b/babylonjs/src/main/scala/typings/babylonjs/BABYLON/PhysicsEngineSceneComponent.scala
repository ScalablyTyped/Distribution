package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsEngineSceneComponent extends ISceneComponent

object PhysicsEngineSceneComponent {
  @scala.inline
  def apply(dispose: () => Unit, name: String, rebuild: () => Unit, register: () => Unit, scene: Scene): PhysicsEngineSceneComponent = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsEngineSceneComponent]
  }
}

