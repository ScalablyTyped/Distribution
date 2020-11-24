package typings.broFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSOptions extends js.Object {
  
  var bytes: js.UndefOr[Double] = js.native
  
  /**
    * show request quota popup for PERSISTENT type
    * (for Chrome extensions with `unlimitedStorage` permission it is useful to pass `options.requestQuota = false`)
    */
  var requestQuota: js.UndefOr[Boolean] = js.native
  
  /** `window.PERSISTENT` | `window.TEMPORARY` */
  var `type`: js.UndefOr[Double] = js.native
}
object FSOptions {
  
  @scala.inline
  def apply(): FSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FSOptions]
  }
  
  @scala.inline
  implicit class FSOptionsOps[Self <: FSOptions] (val x: Self) extends AnyVal {
    
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
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytes: Self = this.set("bytes", js.undefined)
    
    @scala.inline
    def setRequestQuota(value: Boolean): Self = this.set("requestQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestQuota: Self = this.set("requestQuota", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
