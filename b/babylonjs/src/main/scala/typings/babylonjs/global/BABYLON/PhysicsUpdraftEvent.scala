package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics updraft event
  */
@JSGlobal("BABYLON.PhysicsUpdraftEvent")
@js.native
class PhysicsUpdraftEvent protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PhysicsUpdraftEvent {
  /**
    * Initializes the physics updraft event
    * @param _scene BabylonJS scene
    * @param _origin The origin position of the updraft
    * @param _options The options for the updraft event
    */
  def this(
    _scene: typings.babylonjs.BABYLON.Scene,
    _origin: typings.babylonjs.BABYLON.Vector3,
    _options: typings.babylonjs.BABYLON.PhysicsUpdraftEventOptions
  ) = this()
}
