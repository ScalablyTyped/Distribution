package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics vortex event
  */
@JSGlobal("BABYLON.PhysicsVortexEvent")
@js.native
class PhysicsVortexEvent protected ()
  extends typings.babylonjs.BABYLON.PhysicsVortexEvent {
  /**
    * Initializes the physics vortex event
    * @param _scene The BabylonJS scene
    * @param _origin The origin position of the vortex
    * @param _options The options for the vortex event
    */
  def this(
    _scene: typings.babylonjs.BABYLON.Scene,
    _origin: typings.babylonjs.BABYLON.Vector3,
    _options: typings.babylonjs.BABYLON.PhysicsVortexEventOptions
  ) = this()
}
