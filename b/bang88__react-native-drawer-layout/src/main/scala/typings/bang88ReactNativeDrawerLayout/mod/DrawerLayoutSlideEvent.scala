package typings.bang88ReactNativeDrawerLayout.mod

import typings.bang88ReactNativeDrawerLayout.anon.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerLayoutSlideEvent extends js.Object {
  
  var nativeEvent: Offset = js.native
}
object DrawerLayoutSlideEvent {
  
  @scala.inline
  def apply(nativeEvent: Offset): DrawerLayoutSlideEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutSlideEvent]
  }
  
  @scala.inline
  implicit class DrawerLayoutSlideEventOps[Self <: DrawerLayoutSlideEvent] (val x: Self) extends AnyVal {
    
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
    def setNativeEvent(value: Offset): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
}
