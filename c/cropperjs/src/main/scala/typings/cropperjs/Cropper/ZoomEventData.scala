package typings.cropperjs.Cropper

import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomEventData extends js.Object {
  
  var oldRatio: Double = js.native
  
  var originalEvent: WheelEvent | PointerEvent | TouchEvent = js.native
  
  var ratio: Double = js.native
}
object ZoomEventData {
  
  @scala.inline
  def apply(oldRatio: Double, originalEvent: WheelEvent | PointerEvent | TouchEvent, ratio: Double): ZoomEventData = {
    val __obj = js.Dynamic.literal(oldRatio = oldRatio.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomEventData]
  }
  
  @scala.inline
  implicit class ZoomEventDataOps[Self <: ZoomEventData] (val x: Self) extends AnyVal {
    
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
    def setOldRatio(value: Double): Self = this.set("oldRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: WheelEvent | PointerEvent | TouchEvent): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
  }
}
