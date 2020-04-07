package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "Bone")
@js.native
class Bone protected ()
  extends typings.babylonjs.bonesIndexMod.Bone {
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
  name: String, skeleton: typings.babylonjs.skeletonMod.Skeleton) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.skeletonMod.Skeleton,
    parentBone: Nullable[typings.babylonjs.boneMod.Bone]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.skeletonMod.Skeleton,
    parentBone: Nullable[typings.babylonjs.boneMod.Bone],
    localMatrix: Nullable[typings.babylonjs.mathVectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.skeletonMod.Skeleton,
    parentBone: Nullable[typings.babylonjs.boneMod.Bone],
    localMatrix: Nullable[typings.babylonjs.mathVectorMod.Matrix],
    restPose: Nullable[typings.babylonjs.mathVectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.skeletonMod.Skeleton,
    parentBone: Nullable[typings.babylonjs.boneMod.Bone],
    localMatrix: Nullable[typings.babylonjs.mathVectorMod.Matrix],
    restPose: Nullable[typings.babylonjs.mathVectorMod.Matrix],
    baseMatrix: Nullable[typings.babylonjs.mathVectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.skeletonMod.Skeleton,
    parentBone: Nullable[typings.babylonjs.boneMod.Bone],
    localMatrix: Nullable[typings.babylonjs.mathVectorMod.Matrix],
    restPose: Nullable[typings.babylonjs.mathVectorMod.Matrix],
    baseMatrix: Nullable[typings.babylonjs.mathVectorMod.Matrix],
    index: Nullable[Double]
  ) = this()
}

/* static members */
@JSImport("babylonjs/index", "Bone")
@js.native
object Bone extends js.Object {
  var _tmpMats: js.Any = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

