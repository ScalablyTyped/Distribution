package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a gravitational field event
  */
@JSGlobal("BABYLON.PhysicsGravitationalFieldEvent")
@js.native
class PhysicsGravitationalFieldEvent protected ()
  extends typings.babylonjs.BABYLON.PhysicsGravitationalFieldEvent {
  /**
    * Initializes the physics gravitational field event
    * @param _physicsHelper A physics helper
    * @param _scene BabylonJS scene
    * @param _origin The origin position of the gravitational field event
    * @param _options The options for the vortex event
    */
  def this(
    _physicsHelper: typings.babylonjs.BABYLON.PhysicsHelper,
    _scene: typings.babylonjs.BABYLON.Scene,
    _origin: typings.babylonjs.BABYLON.Vector3,
    _options: typings.babylonjs.BABYLON.PhysicsRadialExplosionEventOptions
  ) = this()
}
