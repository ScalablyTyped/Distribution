package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  **/
@JSGlobal("BABYLON._InstanceDataStorage")
@js.native
class InstanceDataStorage ()
  extends StObject
     with typings.babylonjs.BABYLON.InstanceDataStorage {
  
  /* CompleteClass */
  var batchCache: typings.babylonjs.BABYLON.InstancesBatch = js.native
  
  /* CompleteClass */
  var hardwareInstancedRendering: Boolean = js.native
  
  /* CompleteClass */
  var instancesBuffer: Nullable[typings.babylonjs.BABYLON.Buffer] = js.native
  
  /* CompleteClass */
  var instancesBufferSize: Double = js.native
  
  /* CompleteClass */
  var instancesData: Float32Array = js.native
  
  /* CompleteClass */
  var isFrozen: Boolean = js.native
  
  /* CompleteClass */
  var manualUpdate: Boolean = js.native
  
  /* CompleteClass */
  var overridenInstanceCount: Double = js.native
  
  /* CompleteClass */
  var previousBatch: Nullable[typings.babylonjs.BABYLON.InstancesBatch] = js.native
  
  /* CompleteClass */
  var previousRenderId: Double = js.native
  
  /* CompleteClass */
  var sideOrientation: Double = js.native
  
  /* CompleteClass */
  var visibleInstances: js.Any = js.native
}
