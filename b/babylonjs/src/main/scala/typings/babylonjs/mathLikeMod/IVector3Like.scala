package typings.babylonjs.mathLikeMod

import typings.babylonjs.typesMod.float
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVector3Like extends js.Object {
  
  var x: float = js.native
  
  var y: float = js.native
  
  var z: float = js.native
}
object IVector3Like {
  
  @scala.inline
  def apply(x: float, y: float, z: float): IVector3Like = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVector3Like]
  }
  
  @scala.inline
  implicit class IVector3LikeOps[Self <: IVector3Like] (val x: Self) extends AnyVal {
    
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
    def setX(value: float): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: float): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: float): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
