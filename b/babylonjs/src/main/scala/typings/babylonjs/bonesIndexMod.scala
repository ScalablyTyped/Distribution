package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.AdjustPitch
import typings.babylonjs.anon.BendAxis
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Bones/index", JSImport.Namespace)
@js.native
object bonesIndexMod extends js.Object {
  @js.native
  class Bone protected ()
    extends typings.babylonjs.boneMod.Bone {
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
      localMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typings.babylonjs.skeletonMod.Skeleton,
      parentBone: Nullable[typings.babylonjs.boneMod.Bone],
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typings.babylonjs.skeletonMod.Skeleton,
      parentBone: Nullable[typings.babylonjs.boneMod.Bone],
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typings.babylonjs.skeletonMod.Skeleton,
      parentBone: Nullable[typings.babylonjs.boneMod.Bone],
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
  }
  
  @js.native
  class BoneIKController protected ()
    extends typings.babylonjs.boneIKControllerMod.BoneIKController {
    /**
      * Creates a new BoneIKController
      * @param mesh defines the mesh to control
      * @param bone defines the bone to control
      * @param options defines options to set up the controller
      */
    def this(mesh: AbstractMesh, bone: typings.babylonjs.boneMod.Bone) = this()
    def this(mesh: AbstractMesh, bone: typings.babylonjs.boneMod.Bone, options: BendAxis) = this()
  }
  
  @js.native
  class BoneLookController protected ()
    extends typings.babylonjs.boneLookControllerMod.BoneLookController {
    /**
      * Create a BoneLookController
      * @param mesh the mesh that the bone belongs to
      * @param bone the bone that will be looking to the target
      * @param target the target Vector3 to look at
      * @param options optional settings:
      * * maxYaw: the maximum angle the bone will yaw to
      * * minYaw: the minimum angle the bone will yaw to
      * * maxPitch: the maximum angle the bone will pitch to
      * * minPitch: the minimum angle the bone will yaw to
      * * slerpAmount: set the between 0 and 1 to make the bone slerp to the target.
      * * upAxis: the up axis of the coordinate system
      * * upAxisSpace: the space that the up axis is in - Space.BONE, Space.LOCAL (default), or Space.WORLD.
      * * yawAxis: set yawAxis if the bone does not yaw on the y axis
      * * pitchAxis: set pitchAxis if the bone does not pitch on the x axis
      * * adjustYaw: used to make an adjustment to the yaw of the bone
      * * adjustPitch: used to make an adjustment to the pitch of the bone
      * * adjustRoll: used to make an adjustment to the roll of the bone
      **/
    def this(mesh: AbstractMesh, bone: typings.babylonjs.boneMod.Bone, target: Vector3) = this()
    def this(mesh: AbstractMesh, bone: typings.babylonjs.boneMod.Bone, target: Vector3, options: AdjustPitch) = this()
  }
  
  @js.native
  class Skeleton protected ()
    extends typings.babylonjs.skeletonMod.Skeleton {
    /**
      * Creates a new skeleton
      * @param name defines the skeleton name
      * @param id defines the skeleton Id
      * @param scene defines the hosting scene
      */
    def this(
      /** defines the skeleton name */
    name: String,
      /** defines the skeleton Id */
    id: String,
      scene: Scene
    ) = this()
  }
  
  /* static members */
  @js.native
  object Bone extends js.Object {
    var _tmpMats: js.Any = js.native
    var _tmpQuat: js.Any = js.native
    var _tmpVecs: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object BoneIKController extends js.Object {
    var _tmpMats: js.Any = js.native
    var _tmpQuat: js.Any = js.native
    var _tmpVecs: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object BoneLookController extends js.Object {
    var _tmpMats: js.Any = js.native
    var _tmpQuat: js.Any = js.native
    var _tmpVecs: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Skeleton extends js.Object {
    /**
      * Creates a new skeleton from serialized data
      * @param parsedSkeleton defines the serialized data
      * @param scene defines the hosting scene
      * @returns a new skeleton
      */
    def Parse(parsedSkeleton: js.Any, scene: Scene): typings.babylonjs.skeletonMod.Skeleton = js.native
  }
  
}

