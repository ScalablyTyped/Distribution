package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionFunction extends js.Object {
  
  var positionFunction: js.UndefOr[js.Any] = js.native
  
  var storage: js.UndefOr[js.Array[js.Any]] = js.native
  
  var vertexFunction: js.UndefOr[js.Any] = js.native
}
object PositionFunction {
  
  @scala.inline
  def apply(): PositionFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionFunction]
  }
  
  @scala.inline
  implicit class PositionFunctionOps[Self <: PositionFunction] (val x: Self) extends AnyVal {
    
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
    def setPositionFunction(value: js.Any): Self = this.set("positionFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionFunction: Self = this.set("positionFunction", js.undefined)
    
    @scala.inline
    def setStorageVarargs(value: js.Any*): Self = this.set("storage", js.Array(value :_*))
    
    @scala.inline
    def setStorage(value: js.Array[js.Any]): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    
    @scala.inline
    def setVertexFunction(value: js.Any): Self = this.set("vertexFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexFunction: Self = this.set("vertexFunction", js.undefined)
  }
}
