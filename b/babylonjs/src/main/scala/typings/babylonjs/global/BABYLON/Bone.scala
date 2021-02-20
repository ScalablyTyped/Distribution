package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    parentBone: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Bone]],
    localMatrix: Nullable[typings.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.BABYLON.Skeleton,
    parentBone: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Bone]],
    localMatrix: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Matrix]],
    restPose: Nullable[typings.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.BABYLON.Skeleton,
    parentBone: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Bone]],
    localMatrix: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Matrix]],
    restPose: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Matrix]],
    baseMatrix: Nullable[typings.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typings.babylonjs.BABYLON.Skeleton,
    parentBone: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Bone]],
    localMatrix: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Matrix]],
    restPose: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Matrix]],
    baseMatrix: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Matrix]],
    index: Nullable[Double]
  ) = this()
}
/* static members */
object Bone {
  
  @JSGlobal("BABYLON.Bone")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.Bone._tmpMats")
  @js.native
  def _tmpMats: js.Any = js.native
  @scala.inline
  def _tmpMats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpMats")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Bone._tmpQuat")
  @js.native
  def _tmpQuat: js.Any = js.native
  @scala.inline
  def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Bone._tmpVecs")
  @js.native
  def _tmpVecs: js.Any = js.native
  @scala.inline
  def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
}
