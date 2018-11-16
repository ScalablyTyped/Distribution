package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class is used to deform meshes using morphing between different targets
     * @see http://doc.babylonjs.com/how_to/how_to_use_morphtargets
     */
@JSGlobal("BABYLON.MorphTargetManager")
@js.native
class MorphTargetManager () extends js.Object {
  /**
           * Creates a new MorphTargetManager
           * @param scene defines the current scene
           */
  def this(scene: Nullable[Scene]) = this()
  var _activeTargets: js.Any = js.native
  var _influences: js.Any = js.native
  var _scene: js.Any = js.native
  var _supportsNormals: js.Any = js.native
  var _supportsTangents: js.Any = js.native
  var _syncActiveTargets: js.Any = js.native
  var _targetDataLayoutChangedObservers: js.Any = js.native
  var _targetInfluenceChangedObservers: js.Any = js.native
  var _targets: js.Any = js.native
  var _tempInfluences: js.Any = js.native
  var _uniqueId: js.Any = js.native
  var _vertexCount: js.Any = js.native
  /**
           * Gets the list of influences (one per target)
           */
  val influences: stdLib.Float32Array = js.native
  /**
           * Gets the number of influencers (ie. the number of targets with influences > 0)
           */
  val numInfluencers: scala.Double = js.native
  /**
           * Gets the number of targets stored in this manager
           */
  val numTargets: scala.Double = js.native
  /**
           * Gets a boolean indicating if this manager supports morphing of normals
           */
  val supportsNormals: scala.Boolean = js.native
  /**
           * Gets a boolean indicating if this manager supports morphing of tangents
           */
  val supportsTangents: scala.Boolean = js.native
  /**
           * Gets the unique ID of this manager
           */
  val uniqueId: scala.Double = js.native
  /**
           * Gets the number of vertices handled by this manager
           */
  val vertexCount: scala.Double = js.native
  /**
           * Add a new target to this manager
           * @param target defines the target to add
           */
  def addTarget(target: MorphTarget): scala.Unit = js.native
  /**
           * Gets the active target at specified index. An active target is a target with an influence > 0
           * @param index defines the index to check
           * @returns the requested target
           */
  def getActiveTarget(index: scala.Double): MorphTarget = js.native
  /**
           * Gets the target at specified index
           * @param index defines the index to check
           * @returns the requested target
           */
  def getTarget(index: scala.Double): MorphTarget = js.native
  /**
           * Removes a target from the manager
           * @param target defines the target to remove
           */
  def removeTarget(target: MorphTarget): scala.Unit = js.native
  /**
           * Serializes the current manager into a Serialization object
           * @returns the serialized object
           */
  def serialize(): js.Any = js.native
  /**
           * Syncrhonize the targets with all the meshes using this morph target manager
           */
  def synchronize(): scala.Unit = js.native
}

/**
     * This class is used to deform meshes using morphing between different targets
     * @see http://doc.babylonjs.com/how_to/how_to_use_morphtargets
     */
@JSGlobal("BABYLON.MorphTargetManager")
@js.native
object MorphTargetManager extends js.Object {
  /**
           * Creates a new MorphTargetManager from serialized data
           * @param serializationObject defines the serialized data
           * @param scene defines the hosting scene
           * @returns the new MorphTargetManager
           */
  def Parse(serializationObject: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.MorphTargetManager = js.native
}

