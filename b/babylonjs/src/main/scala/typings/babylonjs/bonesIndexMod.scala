package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.AdjustPitch
import typings.babylonjs.anon.BendAxis
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bonesIndexMod {
  
  @JSImport("babylonjs/Bones/index", "Bone")
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
      parentBone: js.UndefOr[Nullable[typings.babylonjs.boneMod.Bone]],
      localMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typings.babylonjs.skeletonMod.Skeleton,
      parentBone: js.UndefOr[Nullable[typings.babylonjs.boneMod.Bone]],
      localMatrix: js.UndefOr[Nullable[Matrix]],
      restPose: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typings.babylonjs.skeletonMod.Skeleton,
      parentBone: js.UndefOr[Nullable[typings.babylonjs.boneMod.Bone]],
      localMatrix: js.UndefOr[Nullable[Matrix]],
      restPose: js.UndefOr[Nullable[Matrix]],
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typings.babylonjs.skeletonMod.Skeleton,
      parentBone: js.UndefOr[Nullable[typings.babylonjs.boneMod.Bone]],
      localMatrix: js.UndefOr[Nullable[Matrix]],
      restPose: js.UndefOr[Nullable[Matrix]],
      baseMatrix: js.UndefOr[Nullable[Matrix]],
      index: Nullable[Double]
    ) = this()
  }
  /* static members */
  object Bone {
    
    @JSImport("babylonjs/Bones/index", "Bone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Bones/index", "Bone._tmpMats")
    @js.native
    def _tmpMats: js.Any = js.native
    @scala.inline
    def _tmpMats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpMats")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "Bone._tmpQuat")
    @js.native
    def _tmpQuat: js.Any = js.native
    @scala.inline
    def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "Bone._tmpVecs")
    @js.native
    def _tmpVecs: js.Any = js.native
    @scala.inline
    def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Bones/index", "BoneIKController")
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
  /* static members */
  object BoneIKController {
    
    @JSImport("babylonjs/Bones/index", "BoneIKController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Bones/index", "BoneIKController._tmpMats")
    @js.native
    def _tmpMats: js.Any = js.native
    @scala.inline
    def _tmpMats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpMats")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "BoneIKController._tmpQuat")
    @js.native
    def _tmpQuat: js.Any = js.native
    @scala.inline
    def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "BoneIKController._tmpVecs")
    @js.native
    def _tmpVecs: js.Any = js.native
    @scala.inline
    def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Bones/index", "BoneLookController")
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
  /* static members */
  object BoneLookController {
    
    @JSImport("babylonjs/Bones/index", "BoneLookController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Bones/index", "BoneLookController._tmpMats")
    @js.native
    def _tmpMats: js.Any = js.native
    @scala.inline
    def _tmpMats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpMats")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "BoneLookController._tmpQuat")
    @js.native
    def _tmpQuat: js.Any = js.native
    @scala.inline
    def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "BoneLookController._tmpVecs")
    @js.native
    def _tmpVecs: js.Any = js.native
    @scala.inline
    def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Bones/index", "Skeleton")
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
  object Skeleton {
    
    @JSImport("babylonjs/Bones/index", "Skeleton.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      skeleton: typings.babylonjs.skeletonMod.Skeleton,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String
    ): Nullable[typings.babylonjs.skeletonMod.Skeleton] = js.native
    /**
      * Convert the keyframes for a range of animation on a skeleton to be relative to a given reference frame.
      * @param skeleton defines the Skeleton containing the animation range to convert
      * @param referenceFrame defines the frame that keyframes in the range will be relative to
      * @param range defines the name of the AnimationRange belonging to the Skeleton to convert
      * @returns the original skeleton
      */
    @JSImport("babylonjs/Bones/index", "Skeleton.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(skeleton: typings.babylonjs.skeletonMod.Skeleton, referenceFrame: Double, range: String): Nullable[typings.babylonjs.skeletonMod.Skeleton] = js.native
    
    /**
      * Creates a new skeleton from serialized data
      * @param parsedSkeleton defines the serialized data
      * @param scene defines the hosting scene
      * @returns a new skeleton
      */
    @JSImport("babylonjs/Bones/index", "Skeleton.Parse")
    @js.native
    def Parse(parsedSkeleton: js.Any, scene: Scene): typings.babylonjs.skeletonMod.Skeleton = js.native
  }
}
