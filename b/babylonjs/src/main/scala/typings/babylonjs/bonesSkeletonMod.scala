package typings.babylonjs

import typings.babylonjs.abstractSceneMod.AbstractScene
import typings.babylonjs.animationsAnimatableDotinterfaceMod.IAnimatable
import typings.babylonjs.animationsAnimatableMod.Animatable
import typings.babylonjs.animationsAnimationMod.Animation
import typings.babylonjs.animationsAnimationPropertiesOverrideMod.AnimationPropertiesOverride
import typings.babylonjs.animationsAnimationRangeMod.AnimationRange
import typings.babylonjs.bonesBoneMod.Bone
import typings.babylonjs.materialsTexturesRawTextureMod.RawTexture
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.miscIInspectableMod.IInspectable
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bonesSkeletonMod {
  
  @JSImport("babylonjs/Bones/skeleton", "Skeleton")
  @js.native
  open class Skeleton protected ()
    extends StObject
       with IAnimatable {
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
    
    /* private */ var _absoluteTransformIsDirty: Any = js.native
    
    /* private */ var _animatables: Any = js.native
    
    /* private */ var _animationPropertiesOverride: Any = js.native
    
    /* private */ var _canUseTextureForBones: Any = js.native
    
    /* private */ var _computeTransformMatrices: Any = js.native
    
    /* private */ var _getHighestAnimationFrame: Any = js.native
    
    /** @internal */
    var _hasWaitingData: Nullable[Boolean] = js.native
    
    /* private */ var _identity: Any = js.native
    
    /* private */ var _isDirty: Any = js.native
    
    /** @internal */
    def _markAsDirty(): Unit = js.native
    
    /* private */ var _meshesWithPoseMatrix: Any = js.native
    
    /** @internal */
    var _numBonesWithLinkedTransformNode: Double = js.native
    
    /** @internal */
    var _parentContainer: Nullable[AbstractScene] = js.native
    
    /* private */ var _ranges: Any = js.native
    
    /**
      * @internal
      */
    def _registerMeshWithPoseMatrix(mesh: AbstractMesh): Unit = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _sortBones: Any = js.native
    
    /* private */ var _synchronizedWithMesh: Any = js.native
    
    /* private */ var _transformMatrices: Any = js.native
    
    /* private */ var _transformMatrixTexture: Any = js.native
    
    /* private */ var _uniqueId: Any = js.native
    
    /**
      * @internal
      */
    def _unregisterMeshWithPoseMatrix(mesh: AbstractMesh): Unit = js.native
    
    /* private */ var _useTextureToStoreBoneMatrices: Any = js.native
    
    /**
      * Gets or sets the animation properties override
      */
    def animationPropertiesOverride: Nullable[AnimationPropertiesOverride] = js.native
    def animationPropertiesOverride_=(value: Nullable[AnimationPropertiesOverride]): Unit = js.native
    
    /**
      * Array of animations
      */
    /* CompleteClass */
    var animations: Nullable[js.Array[Animation]] = js.native
    /**
      * Gets the list of animations attached to this skeleton
      */
    @JSName("animations")
    var animations_Skeleton: js.Array[Animation] = js.native
    
    /**
      * Begin a specific animation range
      * @param name defines the name of the range to start
      * @param loop defines if looping must be turned on (false by default)
      * @param speedRatio defines the speed ratio to apply (1 by default)
      * @param onAnimationEnd defines a callback which will be called when animation will end
      * @returns a new animatable
      */
    def beginAnimation(name: String): Nullable[Animatable] = js.native
    def beginAnimation(name: String, loop: Boolean): Nullable[Animatable] = js.native
    def beginAnimation(name: String, loop: Boolean, speedRatio: Double): Nullable[Animatable] = js.native
    def beginAnimation(name: String, loop: Boolean, speedRatio: Double, onAnimationEnd: js.Function0[Unit]): Nullable[Animatable] = js.native
    def beginAnimation(name: String, loop: Boolean, speedRatio: Unit, onAnimationEnd: js.Function0[Unit]): Nullable[Animatable] = js.native
    def beginAnimation(name: String, loop: Unit, speedRatio: Double): Nullable[Animatable] = js.native
    def beginAnimation(name: String, loop: Unit, speedRatio: Double, onAnimationEnd: js.Function0[Unit]): Nullable[Animatable] = js.native
    def beginAnimation(name: String, loop: Unit, speedRatio: Unit, onAnimationEnd: js.Function0[Unit]): Nullable[Animatable] = js.native
    
    /**
      * Defines the list of child bones
      */
    var bones: js.Array[Bone] = js.native
    
    /**
      * Clone the current skeleton
      * @param name defines the name of the new skeleton
      * @param id defines the id of the new skeleton
      * @returns the new skeleton
      */
    def clone(name: String): Skeleton = js.native
    def clone(name: String, id: String): Skeleton = js.native
    
    /**
      * Compute all node absolute transforms
      * @param forceUpdate defines if computation must be done even if cache is up to date
      */
    def computeAbsoluteTransforms(): Unit = js.native
    def computeAbsoluteTransforms(forceUpdate: Boolean): Unit = js.native
    
    /**
      * Copy animation range from a source skeleton.
      * This is not for a complete retargeting, only between very similar skeleton's with only possible bone length differences
      * @param source defines the source skeleton
      * @param name defines the name of the range to copy
      * @param rescaleAsRequired defines if rescaling must be applied if required
      * @returns true if operation was successful
      */
    def copyAnimationRange(source: Skeleton, name: String): Boolean = js.native
    def copyAnimationRange(source: Skeleton, name: String, rescaleAsRequired: Boolean): Boolean = js.native
    
    /**
      * Create a new animation range
      * @param name defines the name of the range
      * @param from defines the start key
      * @param to defines the end key
      */
    def createAnimationRange(name: String, from: Double, to: Double): Unit = js.native
    
    /**
      * Delete a specific animation range
      * @param name defines the name of the range
      * @param deleteFrames defines if frames must be removed as well
      */
    def deleteAnimationRange(name: String): Unit = js.native
    def deleteAnimationRange(name: String, deleteFrames: Boolean): Unit = js.native
    
    /**
      * Defines an estimate of the dimension of the skeleton at rest
      */
    var dimensionsAtRest: Vector3 = js.native
    
    /**
      * Releases all resources associated with the current skeleton
      */
    def dispose(): Unit = js.native
    
    /**
      * Specifies if the skeleton should be serialized
      */
    var doNotSerialize: Boolean = js.native
    
    /**
      * Enable animation blending for this skeleton
      * @param blendingSpeed defines the blending speed to apply
      * @see https://doc.babylonjs.com/features/featuresDeepDive/animation/advanced_animations#animation-blending
      */
    def enableBlending(): Unit = js.native
    def enableBlending(blendingSpeed: Double): Unit = js.native
    
    /**
      * Gets the list of animatables currently running for this skeleton
      * @returns an array of animatables
      */
    def getAnimatables(): js.Array[IAnimatable] = js.native
    
    /**
      * Gets a specific animation range
      * @param name defines the name of the range to look for
      * @returns the requested animation range or null if not found
      */
    def getAnimationRange(name: String): Nullable[AnimationRange] = js.native
    
    /**
      * Gets the list of all animation ranges defined on this skeleton
      * @returns an array
      */
    def getAnimationRanges(): js.Array[Nullable[AnimationRange]] = js.native
    
    /**
      * Get bone's index searching by name
      * @param name defines bone's name to search for
      * @returns the indice of the bone. Returns -1 if not found
      */
    def getBoneIndexByName(name: String): Double = js.native
    
    /**
      * Returns an array containing the root bones
      * @returns an array containing the root bones
      */
    def getChildren(): js.Array[Bone] = js.native
    
    /**
      * Gets the current object class name.
      * @returns the class name
      */
    def getClassName(): String = js.native
    
    /**
      * Gets the root pose matrix
      * @returns a matrix
      */
    def getPoseMatrix(): Nullable[Matrix] = js.native
    
    /**
      * Gets the current hosting scene
      * @returns a scene object
      */
    def getScene(): Scene = js.native
    
    /**
      * Gets the list of transform matrices to send to shaders (one matrix per bone)
      * @param mesh defines the mesh to use to get the root matrix (if needInitialSkinMatrix === true)
      * @returns a Float32Array containing matrices data
      */
    def getTransformMatrices(mesh: AbstractMesh): js.typedarray.Float32Array = js.native
    
    /**
      * Gets the list of transform matrices to send to shaders inside a texture (one matrix per bone)
      * @param mesh defines the mesh to use to get the root matrix (if needInitialSkinMatrix === true)
      * @returns a raw texture containing the data
      */
    def getTransformMatrixTexture(mesh: AbstractMesh): Nullable[RawTexture] = js.native
    
    /** defines the skeleton Id */
    var id: String = js.native
    
    /**
      * List of inspectable custom properties (used by the Inspector)
      * @see https://doc.babylonjs.com/toolsAndResources/inspector#extensibility
      */
    var inspectableCustomProperties: js.Array[IInspectable] = js.native
    
    /**
      * Gets a boolean indicating that the skeleton effectively stores matrices into a texture
      */
    def isUsingTextureForMatrices: Boolean = js.native
    
    /** defines the skeleton name */
    var name: String = js.native
    
    /**
      * Defines a boolean indicating if the root matrix is provided by meshes or by the current skeleton (this is the default value)
      */
    var needInitialSkinMatrix: Boolean = js.native
    
    /**
      * An observable triggered before computing the skeleton's matrices
      */
    var onBeforeComputeObservable: Observable[Skeleton] = js.native
    
    /**
      * Build all resources required to render a skeleton
      */
    def prepare(): Unit = js.native
    
    /**
      * Forces the skeleton to go to rest pose
      */
    def returnToRest(): Unit = js.native
    
    /**
      * Serialize the skeleton in a JSON object
      * @returns a JSON object
      */
    def serialize(): Any = js.native
    
    /**
      * Set the current local matrix as the restPose for all bones in the skeleton.
      */
    def setCurrentPoseAsRest(): Unit = js.native
    
    /**
      * Sorts bones per internal index
      */
    def sortBones(): Unit = js.native
    
    def toString(fullDetails: Boolean): String = js.native
    
    /**
      * Gets the unique ID of this skeleton
      */
    def uniqueId: Double = js.native
    
    /**
      * Gets or sets a boolean indicating that bone matrices should be stored as a texture instead of using shader uniforms (default is true).
      * Please note that this option is not available if the hardware does not support it
      */
    def useTextureToStoreBoneMatrices: Boolean = js.native
    def useTextureToStoreBoneMatrices_=(value: Boolean): Unit = js.native
  }
  /* static members */
  object Skeleton {
    
    @JSImport("babylonjs/Bones/skeleton", "Skeleton")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert the keyframes for a range of animation on a skeleton to be relative to a given reference frame.
      * @param skeleton defines the Skeleton containing the animation range to convert
      * @param referenceFrame defines the frame that keyframes in the range will be relative to
      * @param range defines the name of the AnimationRange belonging to the Skeleton to convert
      * @returns the original skeleton
      */
    inline def MakeAnimationAdditive(skeleton: Skeleton, referenceFrame: Double, range: String): Nullable[Skeleton] = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(skeleton.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Nullable[Skeleton]]
    inline def MakeAnimationAdditive(skeleton: Skeleton, referenceFrame: Unit, range: String): Nullable[Skeleton] = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(skeleton.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Nullable[Skeleton]]
    
    /**
      * Creates a new skeleton from serialized data
      * @param parsedSkeleton defines the serialized data
      * @param scene defines the hosting scene
      * @returns a new skeleton
      */
    inline def Parse(parsedSkeleton: Any, scene: Scene): Skeleton = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSkeleton.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Skeleton]
  }
}
