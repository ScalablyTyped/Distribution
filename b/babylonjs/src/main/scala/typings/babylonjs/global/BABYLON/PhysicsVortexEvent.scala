package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics vortex event
  */
@JSGlobal("BABYLON.PhysicsVortexEvent")
@js.native
open class PhysicsVortexEvent protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PhysicsVortexEvent {
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
object PhysicsVortexEvent {
  
  @JSGlobal("BABYLON.PhysicsVortexEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("BABYLON.PhysicsVortexEvent.hitData")
  @js.native
  def hitData: Any = js.native
  inline def hitData_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitData")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("BABYLON.PhysicsVortexEvent.originOnPlane")
  @js.native
  def originOnPlane: Any = js.native
  inline def originOnPlane_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("originOnPlane")(x.asInstanceOf[js.Any])
}
