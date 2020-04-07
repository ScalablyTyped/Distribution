package typings.babylonjs.BABYLON

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  **/
@JSGlobal("BABYLON._InstanceDataStorage")
@js.native
class InstanceDataStorage () extends js.Object {
  var batchCache: InstancesBatch = js.native
  var hardwareInstancedRendering: Boolean = js.native
  var instancesBuffer: Nullable[Buffer] = js.native
  var instancesBufferSize: Double = js.native
  var instancesData: Float32Array = js.native
  var isFrozen: Boolean = js.native
  var manualUpdate: Boolean = js.native
  var overridenInstanceCount: Double = js.native
  var previousBatch: Nullable[InstancesBatch] = js.native
  var sideOrientation: Double = js.native
  var visibleInstances: js.Any = js.native
}

