package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeInfo extends js.Object {
  
  /**
    * A boolean value indicating if the resize operation can be cancelled.
    */
  var AllowCancelResize: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns the value ClassicResize.
    */
  var ResizeType: js.UndefOr[String] = js.native
}
object ResizeInfo {
  
  @scala.inline
  def apply(): ResizeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeInfo]
  }
  
  @scala.inline
  implicit class ResizeInfoOps[Self <: ResizeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowCancelResize(value: Boolean): Self = this.set("AllowCancelResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCancelResize: Self = this.set("AllowCancelResize", js.undefined)
    
    @scala.inline
    def setResizeType(value: String): Self = this.set("ResizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeType: Self = this.set("ResizeType", js.undefined)
  }
}
