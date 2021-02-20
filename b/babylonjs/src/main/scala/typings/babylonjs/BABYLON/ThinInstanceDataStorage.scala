package typings.babylonjs.BABYLON

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  **/
@js.native
trait ThinInstanceDataStorage extends StObject {
  
  var boundingVectors: js.Array[Vector3] = js.native
  
  var instancesCount: Double = js.native
  
  var matrixBuffer: Nullable[Buffer] = js.native
  
  var matrixBufferSize: Double = js.native
  
  var matrixData: Nullable[Float32Array] = js.native
  
  var worldMatrices: Nullable[js.Array[Matrix]] = js.native
}
object ThinInstanceDataStorage {
  
  @scala.inline
  def apply(boundingVectors: js.Array[Vector3], instancesCount: Double, matrixBufferSize: Double): ThinInstanceDataStorage = {
    val __obj = js.Dynamic.literal(boundingVectors = boundingVectors.asInstanceOf[js.Any], instancesCount = instancesCount.asInstanceOf[js.Any], matrixBufferSize = matrixBufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThinInstanceDataStorage]
  }
  
  @scala.inline
  implicit class ThinInstanceDataStorageMutableBuilder[Self <: ThinInstanceDataStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingVectors(value: js.Array[Vector3]): Self = StObject.set(x, "boundingVectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingVectorsVarargs(value: Vector3*): Self = StObject.set(x, "boundingVectors", js.Array(value :_*))
    
    @scala.inline
    def setInstancesCount(value: Double): Self = StObject.set(x, "instancesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixBuffer(value: Nullable[Buffer]): Self = StObject.set(x, "matrixBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixBufferNull: Self = StObject.set(x, "matrixBuffer", null)
    
    @scala.inline
    def setMatrixBufferSize(value: Double): Self = StObject.set(x, "matrixBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixData(value: Nullable[Float32Array]): Self = StObject.set(x, "matrixData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixDataNull: Self = StObject.set(x, "matrixData", null)
    
    @scala.inline
    def setWorldMatrices(value: Nullable[js.Array[Matrix]]): Self = StObject.set(x, "worldMatrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldMatricesNull: Self = StObject.set(x, "worldMatrices", null)
    
    @scala.inline
    def setWorldMatricesVarargs(value: Matrix*): Self = StObject.set(x, "worldMatrices", js.Array(value :_*))
  }
}
