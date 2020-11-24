package typings.babylonjs.BABYLON

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Skeleton extends IAnimatable {
  
  var _animatables: js.Any = js.native
  
  var _animationPropertiesOverride: js.Any = js.native
  
  var _canUseTextureForBones: js.Any = js.native
  
  var _computeTransformMatrices: js.Any = js.native
  
  var _getHighestAnimationFrame: js.Any = js.native
  
  /** @hidden */
  var _hasWaitingData: Nullable[Boolean] = js.native
  
  var _identity: js.Any = js.native
  
  var _isDirty: js.Any = js.native
  
  var _lastAbsoluteTransformsUpdateId: js.Any = js.native
  
  /** @hidden */
  def _markAsDirty(): Unit = js.native
  
  var _meshesWithPoseMatrix: js.Any = js.native
  
  /** @hidden */
  var _numBonesWithLinkedTransformNode: Double = js.native
  
  var _ranges: js.Any = js.native
  
  /** @hidden */
  def _registerMeshWithPoseMatrix(mesh: AbstractMesh): Unit = js.native
  
  var _scene: js.Any = js.native
  
  var _sortBones: js.Any = js.native
  
  var _synchronizedWithMesh: js.Any = js.native
  
  var _transformMatrices: js.Any = js.native
  
  var _transformMatrixTexture: js.Any = js.native
  
  var _uniqueId: js.Any = js.native
  
  /** @hidden */
  def _unregisterMeshWithPoseMatrix(mesh: AbstractMesh): Unit = js.native
  
  var _useTextureToStoreBoneMatrices: js.Any = js.native
  
  /** @hidden */
  var _waitingOverrideMeshId: Nullable[String] = js.native
  
  /**
    * Gets or sets the animation properties override
    */
  def animationPropertiesOverride: Nullable[AnimationPropertiesOverride] = js.native
  def animationPropertiesOverride_=(value: Nullable[AnimationPropertiesOverride]): Unit = js.native
  
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
  def beginAnimation(
    name: String,
    loop: js.UndefOr[scala.Nothing],
    speedRatio: js.UndefOr[scala.Nothing],
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[Animatable] = js.native
  def beginAnimation(name: String, loop: js.UndefOr[scala.Nothing], speedRatio: Double): Nullable[Animatable] = js.native
  def beginAnimation(
    name: String,
    loop: js.UndefOr[scala.Nothing],
    speedRatio: Double,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[Animatable] = js.native
  def beginAnimation(name: String, loop: Boolean): Nullable[Animatable] = js.native
  def beginAnimation(
    name: String,
    loop: Boolean,
    speedRatio: js.UndefOr[scala.Nothing],
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[Animatable] = js.native
  def beginAnimation(name: String, loop: Boolean, speedRatio: Double): Nullable[Animatable] = js.native
  def beginAnimation(name: String, loop: Boolean, speedRatio: Double, onAnimationEnd: js.Function0[Unit]): Nullable[Animatable] = js.native
  
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
    * Creater a new animation range
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
    * @see https://doc.babylonjs.com/babylon101/animations#animation-blending
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
    * @return the indice of the bone. Returns -1 if not found
    */
  def getBoneIndexByName(name: String): Double = js.native
  
  /**
    * Returns an array containing the root bones
    * @returns an array containing the root bones
    */
  def getChildren(): js.Array[Bone] = js.native
  
  /**
    * Gets the current object class name.
    * @return the class name
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
  def getTransformMatrices(mesh: AbstractMesh): Float32Array = js.native
  
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
    * @see https://doc.babylonjs.com/how_to/debug_layer#extensibility
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
    * Defines a mesh that override the matrix used to get the world matrix (null by default).
    */
  var overrideMesh: Nullable[AbstractMesh] = js.native
  
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
  def serialize(): js.Any = js.native
  
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
