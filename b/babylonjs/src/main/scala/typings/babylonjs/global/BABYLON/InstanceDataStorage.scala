package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  **/
@JSGlobal("BABYLON._InstanceDataStorage")
@js.native
class InstanceDataStorage ()
  extends typings.babylonjs.BABYLON.InstanceDataStorage {
  /* CompleteClass */
  override var batchCache: typings.babylonjs.BABYLON.InstancesBatch = js.native
  /* CompleteClass */
  override var hardwareInstancedRendering: Boolean = js.native
  /* CompleteClass */
  override var instancesBuffer: Nullable[typings.babylonjs.BABYLON.Buffer] = js.native
  /* CompleteClass */
  override var instancesBufferSize: Double = js.native
  /* CompleteClass */
  override var instancesData: Float32Array = js.native
  /* CompleteClass */
  override var isFrozen: Boolean = js.native
  /* CompleteClass */
  override var manualUpdate: Boolean = js.native
  /* CompleteClass */
  override var overridenInstanceCount: Double = js.native
  /* CompleteClass */
  override var previousBatch: Nullable[typings.babylonjs.BABYLON.InstancesBatch] = js.native
  /* CompleteClass */
  override var sideOrientation: Double = js.native
  /* CompleteClass */
  override var visibleInstances: js.Any = js.native
}

