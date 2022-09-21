package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StereoscopicScreenUniversalCamera")
@js.native
open class StereoscopicScreenUniversalCamera protected ()
  extends StObject
     with typings.babylonjs.BABYLON.StereoscopicScreenUniversalCamera {
  /**
    * Creates a new StereoscopicScreenUniversalCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param scene defines the hosting scene
    * @param distanceToProjectionPlane defines distance between each color axis. The rig cameras will receive this as their negative z position!
    * @param distanceBetweenEyes defines is stereoscopic is done side by side or over under
    */
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3) = this()
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: Unit,
    distanceToProjectionPlane: Double
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: typings.babylonjs.BABYLON.Scene,
    distanceToProjectionPlane: Double
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: Unit,
    distanceToProjectionPlane: Double,
    distanceBetweenEyes: Double
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: Unit,
    distanceToProjectionPlane: Unit,
    distanceBetweenEyes: Double
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: typings.babylonjs.BABYLON.Scene,
    distanceToProjectionPlane: Double,
    distanceBetweenEyes: Double
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: typings.babylonjs.BABYLON.Scene,
    distanceToProjectionPlane: Unit,
    distanceBetweenEyes: Double
  ) = this()
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
}
