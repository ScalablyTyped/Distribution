package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoDetail extends js.Object {
  
  /**
    * Height in pixels for the output
    */
  var HeightInPx: js.UndefOr[integer] = js.native
  
  /**
    * Width in pixels for the output
    */
  var WidthInPx: js.UndefOr[integer] = js.native
}
object VideoDetail {
  
  @scala.inline
  def apply(): VideoDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoDetail]
  }
  
  @scala.inline
  implicit class VideoDetailOps[Self <: VideoDetail] (val x: Self) extends AnyVal {
    
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
    def setHeightInPx(value: integer): Self = this.set("HeightInPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightInPx: Self = this.set("HeightInPx", js.undefined)
    
    @scala.inline
    def setWidthInPx(value: integer): Self = this.set("WidthInPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthInPx: Self = this.set("WidthInPx", js.undefined)
  }
}
