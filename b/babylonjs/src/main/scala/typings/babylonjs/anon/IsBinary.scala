package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsBinary extends js.Object {
  
  var isBinary: Boolean = js.native
}
object IsBinary {
  
  @scala.inline
  def apply(isBinary: Boolean): IsBinary = {
    val __obj = js.Dynamic.literal(isBinary = isBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsBinary]
  }
  
  @scala.inline
  implicit class IsBinaryOps[Self <: IsBinary] (val x: Self) extends AnyVal {
    
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
    def setIsBinary(value: Boolean): Self = this.set("isBinary", value.asInstanceOf[js.Any])
  }
}
