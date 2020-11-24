package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Left extends js.Object {
  
  var left: typings.baseui.baseuiNumbers.`0` = js.native
  
  var top: typings.baseui.baseuiNumbers.`0` = js.native
}
object Left {
  
  @scala.inline
  def apply(left: typings.baseui.baseuiNumbers.`0`, top: typings.baseui.baseuiNumbers.`0`): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  
  @scala.inline
  implicit class LeftOps[Self <: Left] (val x: Self) extends AnyVal {
    
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
    def setLeft(value: typings.baseui.baseuiNumbers.`0`): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: typings.baseui.baseuiNumbers.`0`): Self = this.set("top", value.asInstanceOf[js.Any])
  }
}
