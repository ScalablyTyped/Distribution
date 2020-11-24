package typings.cropperjs.Cropper

import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropEventData extends js.Object {
  
  var action: Action = js.native
  
  var originalEvent: PointerEvent | MouseEvent | TouchEvent = js.native
}
object CropEventData {
  
  @scala.inline
  def apply(action: Action, originalEvent: PointerEvent | MouseEvent | TouchEvent): CropEventData = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropEventData]
  }
  
  @scala.inline
  implicit class CropEventDataOps[Self <: CropEventData] (val x: Self) extends AnyVal {
    
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
    def setAction(value: Action): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: PointerEvent | MouseEvent | TouchEvent): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
  }
}
