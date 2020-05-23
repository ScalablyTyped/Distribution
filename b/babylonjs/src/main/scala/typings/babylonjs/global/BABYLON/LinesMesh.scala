package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.LinesMesh")
@js.native
class LinesMesh protected ()
  extends typings.babylonjs.BABYLON.LinesMesh {
  /**
    * Creates a new LinesMesh
    * @param name defines the name
    * @param scene defines the hosting scene
    * @param parent defines the parent mesh if any
    * @param source defines the optional source LinesMesh used to clone data from
    * @param doNotCloneChildren When cloning, skip cloning child meshes of source, default False.
    * When false, achieved by calling a clone(), also passing False.
    * This will make creation of children, recursive.
    * @param useVertexColor defines if this LinesMesh supports vertex color
    * @param useVertexAlpha defines if this LinesMesh supports vertex alpha
    */
  def this(
    name: String,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    parent: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Node]],
    source: js.UndefOr[Nullable[typings.babylonjs.BABYLON.LinesMesh]],
    doNotCloneChildren: js.UndefOr[Boolean],
    /**
    * If vertex color should be applied to the mesh
    */
  useVertexColor: js.UndefOr[Boolean],
    /**
    * If vertex alpha should be applied to the mesh
    */
  useVertexAlpha: js.UndefOr[Boolean]
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

