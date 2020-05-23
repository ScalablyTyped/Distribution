package typings.babylonjs.BABYLON

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphTargetManager extends js.Object {
  var _activeTargets: js.Any
  var _influences: js.Any
  var _scene: js.Any
  var _supportsNormals: js.Any
  var _supportsTangents: js.Any
  var _supportsUVs: js.Any
  var _syncActiveTargets: js.Any
  var _targetDataLayoutChangedObservers: js.Any
  var _targetInfluenceChangedObservers: js.Any
  var _targets: js.Any
  var _tempInfluences: js.Any
  var _uniqueId: js.Any
  var _vertexCount: js.Any
  /**
    * Gets or sets a boolean indicating if normals must be morphed
    */
  var enableNormalMorphing: Boolean
  /**
    * Gets or sets a boolean indicating if tangents must be morphed
    */
  var enableTangentMorphing: Boolean
  /**
    * Gets or sets a boolean indicating if UV must be morphed
    */
  var enableUVMorphing: Boolean
  /**
    * Add a new target to this manager
    * @param target defines the target to add
    */
  def addTarget(target: MorphTarget): Unit
  /**
    * Gets the active target at specified index. An active target is a target with an influence > 0
    * @param index defines the index to check
    * @returns the requested target
    */
  def getActiveTarget(index: Double): MorphTarget
  /**
    * Gets the target at specified index
    * @param index defines the index to check
    * @returns the requested target
    */
  def getTarget(index: Double): MorphTarget
  /**
    * Gets the list of influences (one per target)
    */
  def influences: Float32Array
  /**
    * Gets the number of influencers (ie. the number of targets with influences > 0)
    */
  def numInfluencers: Double
  /**
    * Gets the number of targets stored in this manager
    */
  def numTargets: Double
  /**
    * Removes a target from the manager
    * @param target defines the target to remove
    */
  def removeTarget(target: MorphTarget): Unit
  /**
    * Serializes the current manager into a Serialization object
    * @returns the serialized object
    */
  def serialize(): js.Any
  /**
    * Gets a boolean indicating if this manager supports morphing of normals
    */
  def supportsNormals: Boolean
  /**
    * Gets a boolean indicating if this manager supports morphing of tangents
    */
  def supportsTangents: Boolean
  /**
    * Gets a boolean indicating if this manager supports morphing of texture coordinates
    */
  def supportsUVs: Boolean
  /**
    * Syncrhonize the targets with all the meshes using this morph target manager
    */
  def synchronize(): Unit
  /**
    * Gets the unique ID of this manager
    */
  def uniqueId: Double
  /**
    * Gets the number of vertices handled by this manager
    */
  def vertexCount: Double
}

object MorphTargetManager {
  @scala.inline
  def apply(
    _activeTargets: js.Any,
    _influences: js.Any,
    _scene: js.Any,
    _supportsNormals: js.Any,
    _supportsTangents: js.Any,
    _supportsUVs: js.Any,
    _syncActiveTargets: js.Any,
    _targetDataLayoutChangedObservers: js.Any,
    _targetInfluenceChangedObservers: js.Any,
    _targets: js.Any,
    _tempInfluences: js.Any,
    _uniqueId: js.Any,
    _vertexCount: js.Any,
    addTarget: MorphTarget => Unit,
    enableNormalMorphing: Boolean,
    enableTangentMorphing: Boolean,
    enableUVMorphing: Boolean,
    getActiveTarget: Double => MorphTarget,
    getTarget: Double => MorphTarget,
    influences: () => Float32Array,
    numInfluencers: () => Double,
    numTargets: () => Double,
    removeTarget: MorphTarget => Unit,
    serialize: () => js.Any,
    supportsNormals: () => Boolean,
    supportsTangents: () => Boolean,
    supportsUVs: () => Boolean,
    synchronize: () => Unit,
    uniqueId: () => Double,
    vertexCount: () => Double
  ): MorphTargetManager = {
    val __obj = js.Dynamic.literal(_activeTargets = _activeTargets.asInstanceOf[js.Any], _influences = _influences.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _supportsNormals = _supportsNormals.asInstanceOf[js.Any], _supportsTangents = _supportsTangents.asInstanceOf[js.Any], _supportsUVs = _supportsUVs.asInstanceOf[js.Any], _syncActiveTargets = _syncActiveTargets.asInstanceOf[js.Any], _targetDataLayoutChangedObservers = _targetDataLayoutChangedObservers.asInstanceOf[js.Any], _targetInfluenceChangedObservers = _targetInfluenceChangedObservers.asInstanceOf[js.Any], _targets = _targets.asInstanceOf[js.Any], _tempInfluences = _tempInfluences.asInstanceOf[js.Any], _uniqueId = _uniqueId.asInstanceOf[js.Any], _vertexCount = _vertexCount.asInstanceOf[js.Any], addTarget = js.Any.fromFunction1(addTarget), enableNormalMorphing = enableNormalMorphing.asInstanceOf[js.Any], enableTangentMorphing = enableTangentMorphing.asInstanceOf[js.Any], enableUVMorphing = enableUVMorphing.asInstanceOf[js.Any], getActiveTarget = js.Any.fromFunction1(getActiveTarget), getTarget = js.Any.fromFunction1(getTarget), influences = js.Any.fromFunction0(influences), numInfluencers = js.Any.fromFunction0(numInfluencers), numTargets = js.Any.fromFunction0(numTargets), removeTarget = js.Any.fromFunction1(removeTarget), serialize = js.Any.fromFunction0(serialize), supportsNormals = js.Any.fromFunction0(supportsNormals), supportsTangents = js.Any.fromFunction0(supportsTangents), supportsUVs = js.Any.fromFunction0(supportsUVs), synchronize = js.Any.fromFunction0(synchronize), uniqueId = js.Any.fromFunction0(uniqueId), vertexCount = js.Any.fromFunction0(vertexCount))
    __obj.asInstanceOf[MorphTargetManager]
  }
}

