package typings.dashjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppedFrames extends js.Object {
  
  var droppedFrames: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object DroppedFrames {
  
  @scala.inline
  def apply(): DroppedFrames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppedFrames]
  }
  
  @scala.inline
  implicit class DroppedFramesOps[Self <: DroppedFrames] (val x: Self) extends AnyVal {
    
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
    def deleteDroppedFrames: Self = this.set("droppedFrames", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
