package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  **/
trait ThinInstanceDataStorage extends StObject {
  
  var boundingVectors: js.Array[Vector3]
  
  var instancesCount: Double
  
  var masterMeshPreviousWorldMatrix: Nullable[Matrix]
  
  var matrixBuffer: Nullable[Buffer]
  
  var matrixBufferSize: Double
  
  var matrixData: Nullable[js.typedarray.Float32Array]
  
  var previousMatrixBuffer: Nullable[Buffer]
  
  var previousMatrixData: Nullable[js.typedarray.Float32Array]
  
  var worldMatrices: Nullable[js.Array[Matrix]]
}
object ThinInstanceDataStorage {
  
  inline def apply(boundingVectors: js.Array[Vector3], instancesCount: Double, matrixBufferSize: Double): ThinInstanceDataStorage = {
    val __obj = js.Dynamic.literal(boundingVectors = boundingVectors.asInstanceOf[js.Any], instancesCount = instancesCount.asInstanceOf[js.Any], matrixBufferSize = matrixBufferSize.asInstanceOf[js.Any], masterMeshPreviousWorldMatrix = null, matrixBuffer = null, matrixData = null, previousMatrixBuffer = null, previousMatrixData = null, worldMatrices = null)
    __obj.asInstanceOf[ThinInstanceDataStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThinInstanceDataStorage] (val x: Self) extends AnyVal {
    
    inline def setBoundingVectors(value: js.Array[Vector3]): Self = StObject.set(x, "boundingVectors", value.asInstanceOf[js.Any])
    
    inline def setBoundingVectorsVarargs(value: Vector3*): Self = StObject.set(x, "boundingVectors", js.Array(value*))
    
    inline def setInstancesCount(value: Double): Self = StObject.set(x, "instancesCount", value.asInstanceOf[js.Any])
    
    inline def setMasterMeshPreviousWorldMatrix(value: Nullable[Matrix]): Self = StObject.set(x, "masterMeshPreviousWorldMatrix", value.asInstanceOf[js.Any])
    
    inline def setMasterMeshPreviousWorldMatrixNull: Self = StObject.set(x, "masterMeshPreviousWorldMatrix", null)
    
    inline def setMatrixBuffer(value: Nullable[Buffer]): Self = StObject.set(x, "matrixBuffer", value.asInstanceOf[js.Any])
    
    inline def setMatrixBufferNull: Self = StObject.set(x, "matrixBuffer", null)
    
    inline def setMatrixBufferSize(value: Double): Self = StObject.set(x, "matrixBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMatrixData(value: Nullable[js.typedarray.Float32Array]): Self = StObject.set(x, "matrixData", value.asInstanceOf[js.Any])
    
    inline def setMatrixDataNull: Self = StObject.set(x, "matrixData", null)
    
    inline def setPreviousMatrixBuffer(value: Nullable[Buffer]): Self = StObject.set(x, "previousMatrixBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreviousMatrixBufferNull: Self = StObject.set(x, "previousMatrixBuffer", null)
    
    inline def setPreviousMatrixData(value: Nullable[js.typedarray.Float32Array]): Self = StObject.set(x, "previousMatrixData", value.asInstanceOf[js.Any])
    
    inline def setPreviousMatrixDataNull: Self = StObject.set(x, "previousMatrixData", null)
    
    inline def setWorldMatrices(value: Nullable[js.Array[Matrix]]): Self = StObject.set(x, "worldMatrices", value.asInstanceOf[js.Any])
    
    inline def setWorldMatricesNull: Self = StObject.set(x, "worldMatrices", null)
    
    inline def setWorldMatricesVarargs(value: Matrix*): Self = StObject.set(x, "worldMatrices", js.Array(value*))
  }
}
