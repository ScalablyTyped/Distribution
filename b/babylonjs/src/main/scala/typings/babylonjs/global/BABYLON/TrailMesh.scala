package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.TrailMesh")
@js.native
class TrailMesh protected ()
  extends typings.babylonjs.BABYLON.TrailMesh {
  /**
    * @constructor
    * @param name The value used by scene.getMeshByName() to do a lookup.
    * @param generator The mesh or transform node to generate a trail.
    * @param scene The scene to add this mesh to.
    * @param diameter Diameter of trailing mesh. Default is 1.
    * @param length Length of trailing mesh. Default is 60.
    * @param autoStart Automatically start trailing mesh. Default true.
    */
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene,
    diameter: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene,
    diameter: Double,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene,
    diameter: Double,
    length: Double,
    autoStart: Boolean
  ) = this()
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this cheks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isCompletelyInFrustum(frustumPlanes: js.Array[typings.babylonjs.BABYLON.Plane]): Boolean = js.native
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isInFrustum(frustumPlanes: js.Array[typings.babylonjs.BABYLON.Plane]): Boolean = js.native
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
}

/* static members */
@JSGlobal("BABYLON.TrailMesh")
@js.native
object TrailMesh extends js.Object {
  /**
    * Parses a serialized trail mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the trail mesh in
    * @returns the created trail mesh
    */
  def Parse(parsedMesh: js.Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.TrailMesh = js.native
}

