package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.BendAxis
import typings.babylonjs.boneMod.Bone
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boneIKControllerMod {
  
  @JSImport("babylonjs/Bones/boneIKController", "BoneIKController")
  @js.native
  class BoneIKController protected () extends StObject {
    /**
      * Creates a new BoneIKController
      * @param mesh defines the mesh to control
      * @param bone defines the bone to control
      * @param options defines options to set up the controller
      */
    def this(mesh: AbstractMesh, bone: Bone) = this()
    def this(mesh: AbstractMesh, bone: Bone, options: BendAxis) = this()
    
    var _adjustRoll: js.Any = js.native
    
    var _bendAxis: js.Any = js.native
    
    var _bone1: js.Any = js.native
    
    var _bone1Length: js.Any = js.native
    
    var _bone1Mat: js.Any = js.native
    
    var _bone1Quat: js.Any = js.native
    
    var _bone2: js.Any = js.native
    
    var _bone2Ang: js.Any = js.native
    
    var _bone2Length: js.Any = js.native
    
    var _maxAngle: js.Any = js.native
    
    var _maxReach: js.Any = js.native
    
    var _rightHandedSystem: js.Any = js.native
    
    var _setMaxAngle: js.Any = js.native
    
    var _slerping: js.Any = js.native
    
    /**
      * Gets or sets maximum allowed angle
      */
    def maxAngle: Double = js.native
    def maxAngle_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the mesh associated with the controller
      */
    var mesh: AbstractMesh = js.native
    
    /**
      * Gets or sets the pole angle
      */
    var poleAngle: Double = js.native
    
    /**
      * Gets or sets the bone used as pole
      */
    var poleTargetBone: Nullable[Bone] = js.native
    
    /**
      * Gets or sets the pole target local offset
      */
    var poleTargetLocalOffset: Vector3 = js.native
    
    /** Gets or sets the mesh used as pole */
    var poleTargetMesh: AbstractMesh = js.native
    
    /**
      * Gets or sets the pole target position
      */
    var poleTargetPosition: Vector3 = js.native
    
    /**
      * The amount to slerp (spherical linear interpolation) to the target.  Set this to a value between 0 and 1 (a value of 1 disables slerp)
      */
    var slerpAmount: Double = js.native
    
    /**
      * Gets or sets the target mesh
      */
    var targetMesh: AbstractMesh = js.native
    
    /**
      * Gets or sets the target position
      */
    var targetPosition: Vector3 = js.native
    
    /**
      * Force the controller to update the bones
      */
    def update(): Unit = js.native
  }
  /* static members */
  object BoneIKController {
    
    @JSImport("babylonjs/Bones/boneIKController", "BoneIKController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Bones/boneIKController", "BoneIKController._tmpMats")
    @js.native
    def _tmpMats: js.Any = js.native
    @scala.inline
    def _tmpMats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpMats")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/boneIKController", "BoneIKController._tmpQuat")
    @js.native
    def _tmpQuat: js.Any = js.native
    @scala.inline
    def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/boneIKController", "BoneIKController._tmpVecs")
    @js.native
    def _tmpVecs: js.Any = js.native
    @scala.inline
    def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
  }
}
