package typings.babylonjs.BABYLON

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMatrixLike extends js.Object {
  
  def toArray(): DeepImmutable[Float32Array | js.Array[Double]] = js.native
  
  var updateFlag: int = js.native
}
object IMatrixLike {
  
  @scala.inline
  def apply(toArray: () => DeepImmutable[Float32Array | js.Array[Double]], updateFlag: int): IMatrixLike = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray), updateFlag = updateFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMatrixLike]
  }
  
  @scala.inline
  implicit class IMatrixLikeOps[Self <: IMatrixLike] (val x: Self) extends AnyVal {
    
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
    def setToArray(value: () => DeepImmutable[Float32Array | js.Array[Double]]): Self = this.set("toArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateFlag(value: int): Self = this.set("updateFlag", value.asInstanceOf[js.Any])
  }
}
