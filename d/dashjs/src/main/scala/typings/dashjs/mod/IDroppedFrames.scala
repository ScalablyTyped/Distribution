package typings.dashjs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDroppedFrames extends js.Object {
  
  var droppedFrames: Double = js.native
  
  var time: Date = js.native
}
object IDroppedFrames {
  
  @scala.inline
  def apply(droppedFrames: Double, time: Date): IDroppedFrames = {
    val __obj = js.Dynamic.literal(droppedFrames = droppedFrames.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDroppedFrames]
  }
  
  @scala.inline
  implicit class IDroppedFramesOps[Self <: IDroppedFrames] (val x: Self) extends AnyVal {
    
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
    def setDroppedFrames(value: Double): Self = this.set("droppedFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Date): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
