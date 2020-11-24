package typings.decodeGif.mod

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameType extends js.Object {
  
  /** The frame data. */
  var data: Uint8ClampedArray = js.native
  
  /** The time code in milliseconds that the frame appears at. */
  var timeCode: Double = js.native
}
object FrameType {
  
  @scala.inline
  def apply(data: Uint8ClampedArray, timeCode: Double): FrameType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timeCode = timeCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameType]
  }
  
  @scala.inline
  implicit class FrameTypeOps[Self <: FrameType] (val x: Self) extends AnyVal {
    
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
    def setData(value: Uint8ClampedArray): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCode(value: Double): Self = this.set("timeCode", value.asInstanceOf[js.Any])
  }
}
