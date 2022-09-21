package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics radial explosion event
  */
@JSGlobal("BABYLON.PhysicsRadialExplosionEvent")
@js.native
open class PhysicsRadialExplosionEvent protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PhysicsRadialExplosionEvent {
  /**
    * Initializes a radial explosion event
    * @param _scene BabylonJS scene
    * @param _options The options for the vortex event
    */
  def this(
    _scene: typings.babylonjs.BABYLON.Scene,
    _options: typings.babylonjs.BABYLON.PhysicsRadialExplosionEventOptions
  ) = this()
}
