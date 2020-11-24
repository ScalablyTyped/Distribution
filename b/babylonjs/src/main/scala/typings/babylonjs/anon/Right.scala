package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Right extends js.Object {
  
  var left: js.Array[String] = js.native
  
  var right: js.Array[String] = js.native
}
object Right {
  
  @scala.inline
  def apply(left: js.Array[String], right: js.Array[String]): Right = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
  
  @scala.inline
  implicit class RightOps[Self <: Right] (val x: Self) extends AnyVal {
    
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
    def setLeftVarargs(value: String*): Self = this.set("left", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: js.Array[String]): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightVarargs(value: String*): Self = this.set("right", js.Array(value :_*))
    
    @scala.inline
    def setRight(value: js.Array[String]): Self = this.set("right", value.asInstanceOf[js.Any])
  }
}
