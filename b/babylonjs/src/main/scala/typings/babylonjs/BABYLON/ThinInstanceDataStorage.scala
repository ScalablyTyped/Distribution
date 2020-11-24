package typings.babylonjs.BABYLON

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  **/
@js.native
trait ThinInstanceDataStorage extends js.Object {
  
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
  implicit class ThinInstanceDataStorageOps[Self <: ThinInstanceDataStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoundingVectorsVarargs(value: Vector3*): Self = this.set("boundingVectors", js.Array(value :_*))
    
    @scala.inline
    def setBoundingVectors(value: js.Array[Vector3]): Self = this.set("boundingVectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesCount(value: Double): Self = this.set("instancesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixBufferSize(value: Double): Self = this.set("matrixBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixBuffer(value: Nullable[Buffer]): Self = this.set("matrixBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixBufferNull: Self = this.set("matrixBuffer", null)
    
    @scala.inline
    def setMatrixData(value: Nullable[Float32Array]): Self = this.set("matrixData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixDataNull: Self = this.set("matrixData", null)
    
    @scala.inline
    def setWorldMatricesVarargs(value: Matrix*): Self = this.set("worldMatrices", js.Array(value :_*))
    
    @scala.inline
    def setWorldMatrices(value: Nullable[js.Array[Matrix]]): Self = this.set("worldMatrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldMatricesNull: Self = this.set("worldMatrices", null)
  }
}
