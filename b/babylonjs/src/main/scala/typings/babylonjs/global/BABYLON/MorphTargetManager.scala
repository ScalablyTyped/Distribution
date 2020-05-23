package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MorphTargetManager")
@js.native
/**
  * Creates a new MorphTargetManager
  * @param scene defines the current scene
  */
class MorphTargetManager ()
  extends typings.babylonjs.BABYLON.MorphTargetManager {
  def this(scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  /* CompleteClass */
  override var _activeTargets: js.Any = js.native
  /* CompleteClass */
  override var _influences: js.Any = js.native
  /* CompleteClass */
  override var _scene: js.Any = js.native
  /* CompleteClass */
  override var _supportsNormals: js.Any = js.native
  /* CompleteClass */
  override var _supportsTangents: js.Any = js.native
  /* CompleteClass */
  override var _supportsUVs: js.Any = js.native
  /* CompleteClass */
  override var _syncActiveTargets: js.Any = js.native
  /* CompleteClass */
  override var _targetDataLayoutChangedObservers: js.Any = js.native
  /* CompleteClass */
  override var _targetInfluenceChangedObservers: js.Any = js.native
  /* CompleteClass */
  override var _targets: js.Any = js.native
  /* CompleteClass */
  override var _tempInfluences: js.Any = js.native
  /* CompleteClass */
  override var _uniqueId: js.Any = js.native
  /* CompleteClass */
  override var _vertexCount: js.Any = js.native
  /**
    * Gets or sets a boolean indicating if normals must be morphed
    */
  /* CompleteClass */
  override var enableNormalMorphing: Boolean = js.native
  /**
    * Gets or sets a boolean indicating if tangents must be morphed
    */
  /* CompleteClass */
  override var enableTangentMorphing: Boolean = js.native
  /**
    * Gets or sets a boolean indicating if UV must be morphed
    */
  /* CompleteClass */
  override var enableUVMorphing: Boolean = js.native
  /**
    * Add a new target to this manager
    * @param target defines the target to add
    */
  /* CompleteClass */
  override def addTarget(target: typings.babylonjs.BABYLON.MorphTarget): Unit = js.native
  /**
    * Gets the active target at specified index. An active target is a target with an influence > 0
    * @param index defines the index to check
    * @returns the requested target
    */
  /* CompleteClass */
  override def getActiveTarget(index: Double): typings.babylonjs.BABYLON.MorphTarget = js.native
  /**
    * Gets the target at specified index
    * @param index defines the index to check
    * @returns the requested target
    */
  /* CompleteClass */
  override def getTarget(index: Double): typings.babylonjs.BABYLON.MorphTarget = js.native
  /**
    * Gets the list of influences (one per target)
    */
  /* CompleteClass */
  override def influences: Float32Array = js.native
  /**
    * Gets the number of influencers (ie. the number of targets with influences > 0)
    */
  /* CompleteClass */
  override def numInfluencers: Double = js.native
  /**
    * Gets the number of targets stored in this manager
    */
  /* CompleteClass */
  override def numTargets: Double = js.native
  /**
    * Removes a target from the manager
    * @param target defines the target to remove
    */
  /* CompleteClass */
  override def removeTarget(target: typings.babylonjs.BABYLON.MorphTarget): Unit = js.native
  /**
    * Serializes the current manager into a Serialization object
    * @returns the serialized object
    */
  /* CompleteClass */
  override def serialize(): js.Any = js.native
  /**
    * Gets a boolean indicating if this manager supports morphing of normals
    */
  /* CompleteClass */
  override def supportsNormals: Boolean = js.native
  /**
    * Gets a boolean indicating if this manager supports morphing of tangents
    */
  /* CompleteClass */
  override def supportsTangents: Boolean = js.native
  /**
    * Gets a boolean indicating if this manager supports morphing of texture coordinates
    */
  /* CompleteClass */
  override def supportsUVs: Boolean = js.native
  /**
    * Syncrhonize the targets with all the meshes using this morph target manager
    */
  /* CompleteClass */
  override def synchronize(): Unit = js.native
  /**
    * Gets the unique ID of this manager
    */
  /* CompleteClass */
  override def uniqueId: Double = js.native
  /**
    * Gets the number of vertices handled by this manager
    */
  /* CompleteClass */
  override def vertexCount: Double = js.native
}

/* static members */
@JSGlobal("BABYLON.MorphTargetManager")
@js.native
object MorphTargetManager extends js.Object {
  /**
    * Creates a new MorphTargetManager from serialized data
    * @param serializationObject defines the serialized data
    * @param scene defines the hosting scene
    * @returns the new MorphTargetManager
    */
  def Parse(serializationObject: js.Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.MorphTargetManager = js.native
}

