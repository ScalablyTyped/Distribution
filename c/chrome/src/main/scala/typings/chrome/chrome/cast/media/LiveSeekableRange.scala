package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveSeekableRange extends js.Object {
  
  var end: js.UndefOr[Double] = js.native
  
  var isLiveDone: js.UndefOr[Boolean] = js.native
  
  var isMovingWindow: js.UndefOr[Boolean] = js.native
  
  var start: js.UndefOr[Double] = js.native
}
object LiveSeekableRange {
  
  @scala.inline
  def apply(): LiveSeekableRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveSeekableRange]
  }
  
  @scala.inline
  implicit class LiveSeekableRangeOps[Self <: LiveSeekableRange] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setIsLiveDone(value: Boolean): Self = this.set("isLiveDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLiveDone: Self = this.set("isLiveDone", js.undefined)
    
    @scala.inline
    def setIsMovingWindow(value: Boolean): Self = this.set("isMovingWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMovingWindow: Self = this.set("isMovingWindow", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
