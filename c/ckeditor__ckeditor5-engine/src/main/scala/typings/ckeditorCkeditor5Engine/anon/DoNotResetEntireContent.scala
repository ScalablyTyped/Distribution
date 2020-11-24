package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoNotResetEntireContent extends js.Object {
  
  var doNotResetEntireContent: Boolean = js.native
  
  var leaveUnmerged: Boolean = js.native
}
object DoNotResetEntireContent {
  
  @scala.inline
  def apply(doNotResetEntireContent: Boolean, leaveUnmerged: Boolean): DoNotResetEntireContent = {
    val __obj = js.Dynamic.literal(doNotResetEntireContent = doNotResetEntireContent.asInstanceOf[js.Any], leaveUnmerged = leaveUnmerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoNotResetEntireContent]
  }
  
  @scala.inline
  implicit class DoNotResetEntireContentOps[Self <: DoNotResetEntireContent] (val x: Self) extends AnyVal {
    
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
    def setDoNotResetEntireContent(value: Boolean): Self = this.set("doNotResetEntireContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaveUnmerged(value: Boolean): Self = this.set("leaveUnmerged", value.asInstanceOf[js.Any])
  }
}
