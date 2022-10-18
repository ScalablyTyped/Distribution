package typings.babylonjs.camerasIndexMod

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "StereoscopicScreenUniversalCamera")
@js.native
open class StereoscopicScreenUniversalCamera protected ()
  extends typings.babylonjs.camerasStereoscopicIndexMod.StereoscopicScreenUniversalCamera {
  /**
    * Creates a new StereoscopicScreenUniversalCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param scene defines the hosting scene
    * @param distanceToProjectionPlane defines distance between each color axis. The rig cameras will receive this as their negative z position!
    * @param distanceBetweenEyes defines is stereoscopic is done side by side or over under
    */
  def this(name: String, position: Vector3) = this()
  def this(name: String, position: Vector3, scene: Scene) = this()
  def this(name: String, position: Vector3, scene: Unit, distanceToProjectionPlane: Double) = this()
  def this(name: String, position: Vector3, scene: Scene, distanceToProjectionPlane: Double) = this()
  def this(
    name: String,
    position: Vector3,
    scene: Unit,
    distanceToProjectionPlane: Double,
    distanceBetweenEyes: Double
  ) = this()
  def this(
    name: String,
    position: Vector3,
    scene: Unit,
    distanceToProjectionPlane: Unit,
    distanceBetweenEyes: Double
  ) = this()
  def this(
    name: String,
    position: Vector3,
    scene: Scene,
    distanceToProjectionPlane: Double,
    distanceBetweenEyes: Double
  ) = this()
  def this(
    name: String,
    position: Vector3,
    scene: Scene,
    distanceToProjectionPlane: Unit,
    distanceBetweenEyes: Double
  ) = this()
}
