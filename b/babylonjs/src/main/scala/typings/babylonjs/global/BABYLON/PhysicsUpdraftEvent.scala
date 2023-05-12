package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics updraft event
  */
@JSGlobal("BABYLON.PhysicsUpdraftEvent")
@js.native
open class PhysicsUpdraftEvent protected ()
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
object PhysicsUpdraftEvent {
  
  @JSGlobal("BABYLON.PhysicsUpdraftEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("BABYLON.PhysicsUpdraftEvent._HitData")
  @js.native
  def HitData: Any = js.native
  
  inline def HitData_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_HitData")(x.asInstanceOf[js.Any])
}
