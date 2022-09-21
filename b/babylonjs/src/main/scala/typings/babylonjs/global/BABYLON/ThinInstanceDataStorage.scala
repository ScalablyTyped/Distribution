package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  **/
@JSGlobal("BABYLON._ThinInstanceDataStorage")
@js.native
open class ThinInstanceDataStorage ()
  extends StObject
     with typings.babylonjs.BABYLON.ThinInstanceDataStorage {
  
  /* CompleteClass */
  var boundingVectors: js.Array[typings.babylonjs.BABYLON.Vector3] = js.native
  
  /* CompleteClass */
  var instancesCount: Double = js.native
  
  /* CompleteClass */
  var masterMeshPreviousWorldMatrix: Nullable[typings.babylonjs.BABYLON.Matrix] = js.native
  
  /* CompleteClass */
  var matrixBuffer: Nullable[typings.babylonjs.BABYLON.Buffer] = js.native
  
  /* CompleteClass */
  var matrixBufferSize: Double = js.native
  
  /* CompleteClass */
  var matrixData: Nullable[js.typedarray.Float32Array] = js.native
  
  /* CompleteClass */
  var previousMatrixBuffer: Nullable[typings.babylonjs.BABYLON.Buffer] = js.native
  
  /* CompleteClass */
  var previousMatrixData: Nullable[js.typedarray.Float32Array] = js.native
  
  /* CompleteClass */
  var worldMatrices: Nullable[js.Array[typings.babylonjs.BABYLON.Matrix]] = js.native
}
