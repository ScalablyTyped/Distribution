package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to handle skinning animations
     * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
     */
@JSGlobal("BABYLON.Skeleton")
@js.native
class Skeleton protected () extends IAnimatable {
  /**
           * Creates a new skeleton
           * @param name defines the skeleton name
           * @param id defines the skeleton Id
           * @param scene defines the hosting scene
           */
  def this(/** defines the skeleton name */
  name: java.lang.String, /** defines the skeleton Id */
  id: java.lang.String, scene: Scene) = this()
  var _animatables: js.Any = js.native
  var _animationPropertiesOverride: js.Any = js.native
  var _getHighestAnimationFrame: js.Any = js.native
  var _identity: js.Any = js.native
  var _isDirty: js.Any = js.native
  var _lastAbsoluteTransformsUpdateId: js.Any = js.native
  var _meshesWithPoseMatrix: js.Any = js.native
  var _ranges: js.Any = js.native
  var _scene: js.Any = js.native
  var _sortBones: js.Any = js.native
  var _synchronizedWithMesh: js.Any = js.native
  var _transformMatrices: js.Any = js.native
  /**
           * Gets or sets the animation properties override
           */
  var animationPropertiesOverride: Nullable[AnimationPropertiesOverride] = js.native
  /**
           * Array of animations
           */
  /* CompleteClass */
  override var animations: js.Array[Animation] = js.native
  /**
           * Gets the list of child bones
           */
  var bones: js.Array[Bone] = js.native
  /**
           * Gets an estimate of the dimension of the skeleton at rest
           */
  var dimensionsAtRest: Vector3 = js.native
  /**
           * Specifies if the skeleton should be serialized
           */
  var doNotSerialize: scala.Boolean = js.native
  /** defines the skeleton Id */
  var id: java.lang.String = js.native
  /** defines the skeleton name */
  var name: java.lang.String = js.native
  /**
           * Gets a boolean indicating if the root matrix is provided by meshes or by the current skeleton (this is the default value)
           */
  var needInitialSkinMatrix: scala.Boolean = js.native
  /**
           * An observable triggered before computing the skeleton's matrices
           */
  var onBeforeComputeObservable: Observable[Skeleton] = js.native
  /** @hidden */
  def _computeTransformMatrices(targetMatrix: stdLib.Float32Array, initialSkinMatrix: Nullable[Matrix]): scala.Unit = js.native
  /** @hidden */
  def _markAsDirty(): scala.Unit = js.native
  /** @hidden */
  def _registerMeshWithPoseMatrix(mesh: AbstractMesh): scala.Unit = js.native
  /** @hidden */
  def _unregisterMeshWithPoseMatrix(mesh: AbstractMesh): scala.Unit = js.native
  /**
           * Begin a specific animation range
           * @param name defines the name of the range to start
           * @param loop defines if looping must be turned on (false by default)
           * @param speedRatio defines the speed ratio to apply (1 by default)
           * @param onAnimationEnd defines a callback which will be called when animation will end
           * @returns a new animatable
           */
  def beginAnimation(name: java.lang.String): Nullable[Animatable] = js.native
  /**
           * Begin a specific animation range
           * @param name defines the name of the range to start
           * @param loop defines if looping must be turned on (false by default)
           * @param speedRatio defines the speed ratio to apply (1 by default)
           * @param onAnimationEnd defines a callback which will be called when animation will end
           * @returns a new animatable
           */
  def beginAnimation(name: java.lang.String, loop: scala.Boolean): Nullable[Animatable] = js.native
  /**
           * Begin a specific animation range
           * @param name defines the name of the range to start
           * @param loop defines if looping must be turned on (false by default)
           * @param speedRatio defines the speed ratio to apply (1 by default)
           * @param onAnimationEnd defines a callback which will be called when animation will end
           * @returns a new animatable
           */
  def beginAnimation(name: java.lang.String, loop: scala.Boolean, speedRatio: scala.Double): Nullable[Animatable] = js.native
  /**
           * Begin a specific animation range
           * @param name defines the name of the range to start
           * @param loop defines if looping must be turned on (false by default)
           * @param speedRatio defines the speed ratio to apply (1 by default)
           * @param onAnimationEnd defines a callback which will be called when animation will end
           * @returns a new animatable
           */
  def beginAnimation(
    name: java.lang.String,
    loop: scala.Boolean,
    speedRatio: scala.Double,
    onAnimationEnd: js.Function0[scala.Unit]
  ): Nullable[Animatable] = js.native
  /**
           * Clone the current skeleton
           * @param name defines the name of the new skeleton
           * @param id defines the id of the enw skeleton
           * @returns the new skeleton
           */
  def clone(name: java.lang.String, id: java.lang.String): Skeleton = js.native
  /**
           * Compute all node absolute transforms
           * @param forceUpdate defines if computation must be done even if cache is up to date
           */
  def computeAbsoluteTransforms(): scala.Unit = js.native
  /**
           * Compute all node absolute transforms
           * @param forceUpdate defines if computation must be done even if cache is up to date
           */
  def computeAbsoluteTransforms(forceUpdate: scala.Boolean): scala.Unit = js.native
  /**
           * Copy animation range from a source skeleton.
           * This is not for a complete retargeting, only between very similar skeleton's with only possible bone length differences
           * @param source defines the source skeleton
           * @param name defines the name of the range to copy
           * @param rescaleAsRequired defines if rescaling must be applied if required
           * @returns true if operation was successful
           */
  def copyAnimationRange(source: Skeleton, name: java.lang.String): scala.Boolean = js.native
  /**
           * Copy animation range from a source skeleton.
           * This is not for a complete retargeting, only between very similar skeleton's with only possible bone length differences
           * @param source defines the source skeleton
           * @param name defines the name of the range to copy
           * @param rescaleAsRequired defines if rescaling must be applied if required
           * @returns true if operation was successful
           */
  def copyAnimationRange(source: Skeleton, name: java.lang.String, rescaleAsRequired: scala.Boolean): scala.Boolean = js.native
  /**
           * Creater a new animation range
           * @param name defines the name of the range
           * @param from defines the start key
           * @param to defines the end key
           */
  def createAnimationRange(name: java.lang.String, from: scala.Double, to: scala.Double): scala.Unit = js.native
  /**
           * Delete a specific animation range
           * @param name defines the name of the range
           * @param deleteFrames defines if frames must be removed as well
           */
  def deleteAnimationRange(name: java.lang.String): scala.Unit = js.native
  /**
           * Delete a specific animation range
           * @param name defines the name of the range
           * @param deleteFrames defines if frames must be removed as well
           */
  def deleteAnimationRange(name: java.lang.String, deleteFrames: scala.Boolean): scala.Unit = js.native
  /**
           * Releases all resources associated with the current skeleton
           */
  def dispose(): scala.Unit = js.native
  /**
           * Enable animation blending for this skeleton
           * @param blendingSpeed defines the blending speed to apply
           * @see http://doc.babylonjs.com/babylon101/animations#animation-blending
           */
  def enableBlending(): scala.Unit = js.native
  /**
           * Enable animation blending for this skeleton
           * @param blendingSpeed defines the blending speed to apply
           * @see http://doc.babylonjs.com/babylon101/animations#animation-blending
           */
  def enableBlending(blendingSpeed: scala.Double): scala.Unit = js.native
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
  def getAnimationRange(name: java.lang.String): Nullable[AnimationRange] = js.native
  /**
           * Gets the list of all animation ranges defined on this skeleton
           * @returns an array
           */
  def getAnimationRanges(): js.Array[Nullable[AnimationRange]] = js.native
  /**
          * Get bone's index searching by name
          * @param name defines bone's name to search for
          * @return the indice of the bone. Returns -1 if not found
          */
  def getBoneIndexByName(name: java.lang.String): scala.Double = js.native
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
  def getTransformMatrices(mesh: AbstractMesh): stdLib.Float32Array = js.native
  /**
           * Build all resources required to render a skeleton
           */
  def prepare(): scala.Unit = js.native
  /**
           * Forces the skeleton to go to rest pose
           */
  def returnToRest(): scala.Unit = js.native
  /**
           * Serialize the skeleton in a JSON object
           * @returns a JSON object
           */
  def serialize(): js.Any = js.native
  /**
           * Sorts bones per internal index
           */
  def sortBones(): scala.Unit = js.native
  /**
           * Gets a string representing the current skeleton data
           * @param fullDetails defines a boolean indicating if we want a verbose version
           * @returns a string representing the current skeleton data
           */
  def toString(fullDetails: scala.Boolean): java.lang.String = js.native
}

/**
     * Class used to handle skinning animations
     * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
     */
@JSGlobal("BABYLON.Skeleton")
@js.native
object Skeleton extends js.Object {
  /**
           * Creates a new skeleton from serialized data
           * @param parsedSkeleton defines the serialized data
           * @param scene defines the hosting scene
           * @returns a new skeleton
           */
  def Parse(parsedSkeleton: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Skeleton = js.native
}

