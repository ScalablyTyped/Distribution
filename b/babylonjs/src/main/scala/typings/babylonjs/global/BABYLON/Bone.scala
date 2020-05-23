package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Bone")
@js.native
class Bone protected ()
  extends typings.babylonjs.BABYLON.Bone {
  /**
    * Create a new bone
    * @param name defines the bone name
    * @param skeleton defines the parent skeleton
    * @param parentBone defines the parent (can be null if the bone is the root)
    * @param localMatrix defines the local matrix
    * @param restPose defines the rest pose matrix
    * @param baseMatrix defines the base matrix
    * @param index defines index of the bone in the hiearchy
    */
  def this(/**
    * defines the bone name
    */
  name: String, skeleton: typings.babylonjs.BABYLON.Skeleton) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typings.babylonjs.BABYLON.Bone]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typings.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typings.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typings.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typings.babylonjs.BABYLON.Matrix],
    restPose: Nullable[typings.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typings.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typings.babylonjs.BABYLON.Matrix],
    restPose: Nullable[typings.babylonjs.BABYLON.Matrix],
    baseMatrix: Nullable[typings.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typings.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typings.babylonjs.BABYLON.Matrix],
    restPose: Nullable[typings.babylonjs.BABYLON.Matrix],
    baseMatrix: Nullable[typings.babylonjs.BABYLON.Matrix],
    index: Nullable[Double]
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

/* static members */
@JSGlobal("BABYLON.Bone")
@js.native
object Bone extends js.Object {
  var _tmpMats: js.Any = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

