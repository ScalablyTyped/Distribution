package typings.babylonjs.BABYLON

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  **/
trait InstanceDataStorage extends js.Object {
  var batchCache: InstancesBatch
  var hardwareInstancedRendering: Boolean
  var instancesBuffer: Nullable[Buffer]
  var instancesBufferSize: Double
  var instancesData: Float32Array
  var isFrozen: Boolean
  var manualUpdate: Boolean
  var overridenInstanceCount: Double
  var previousBatch: Nullable[InstancesBatch]
  var sideOrientation: Double
  var visibleInstances: js.Any
}

object InstanceDataStorage {
  @scala.inline
  def apply(
    batchCache: InstancesBatch,
    hardwareInstancedRendering: Boolean,
    instancesBufferSize: Double,
    instancesData: Float32Array,
    isFrozen: Boolean,
    manualUpdate: Boolean,
    overridenInstanceCount: Double,
    sideOrientation: Double,
    visibleInstances: js.Any,
    instancesBuffer: Nullable[Buffer] = null,
    previousBatch: Nullable[InstancesBatch] = null
  ): InstanceDataStorage = {
    val __obj = js.Dynamic.literal(batchCache = batchCache.asInstanceOf[js.Any], hardwareInstancedRendering = hardwareInstancedRendering.asInstanceOf[js.Any], instancesBufferSize = instancesBufferSize.asInstanceOf[js.Any], instancesData = instancesData.asInstanceOf[js.Any], isFrozen = isFrozen.asInstanceOf[js.Any], manualUpdate = manualUpdate.asInstanceOf[js.Any], overridenInstanceCount = overridenInstanceCount.asInstanceOf[js.Any], sideOrientation = sideOrientation.asInstanceOf[js.Any], visibleInstances = visibleInstances.asInstanceOf[js.Any], instancesBuffer = instancesBuffer.asInstanceOf[js.Any], previousBatch = previousBatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceDataStorage]
  }
}

