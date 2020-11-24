package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColor3Like extends js.Object {
  
  var b: float = js.native
  
  var g: float = js.native
  
  var r: float = js.native
}
object IColor3Like {
  
  @scala.inline
  def apply(b: float, g: float, r: float): IColor3Like = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColor3Like]
  }
  
  @scala.inline
  implicit class IColor3LikeOps[Self <: IColor3Like] (val x: Self) extends AnyVal {
    
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
    def setB(value: float): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: float): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: float): Self = this.set("r", value.asInstanceOf[js.Any])
  }
}
