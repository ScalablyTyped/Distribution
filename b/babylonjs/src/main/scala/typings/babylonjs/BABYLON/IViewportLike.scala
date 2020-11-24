package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewportLike extends js.Object {
  
  var height: float = js.native
  
  var width: float = js.native
  
  var x: float = js.native
  
  var y: float = js.native
}
object IViewportLike {
  
  @scala.inline
  def apply(height: float, width: float, x: float, y: float): IViewportLike = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewportLike]
  }
  
  @scala.inline
  implicit class IViewportLikeOps[Self <: IViewportLike] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: float): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: float): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: float): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: float): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
