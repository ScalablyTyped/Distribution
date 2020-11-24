package typings.chrome.chrome.tabCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamConstraint extends js.Object {
  
  var mandatory: js.Object = js.native
  
  var optional: js.UndefOr[js.Object] = js.native
}
object MediaStreamConstraint {
  
  @scala.inline
  def apply(mandatory: js.Object): MediaStreamConstraint = {
    val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamConstraint]
  }
  
  @scala.inline
  implicit class MediaStreamConstraintOps[Self <: MediaStreamConstraint] (val x: Self) extends AnyVal {
    
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
    def setMandatory(value: js.Object): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: js.Object): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
}
