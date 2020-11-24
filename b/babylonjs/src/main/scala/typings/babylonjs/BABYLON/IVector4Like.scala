package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVector4Like extends js.Object {
  
  var w: float = js.native
  
  var x: float = js.native
  
  var y: float = js.native
  
  var z: float = js.native
}
object IVector4Like {
  
  @scala.inline
  def apply(w: float, x: float, y: float, z: float): IVector4Like = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVector4Like]
  }
  
  @scala.inline
  implicit class IVector4LikeOps[Self <: IVector4Like] (val x: Self) extends AnyVal {
    
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
    def setW(value: float): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: float): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: float): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: float): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
