package typings.busboy.busboy

import typings.busboy.anon.FieldNameSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusboyConfig extends js.Object {
  
  var defCharset: js.UndefOr[String] = js.native
  
  var fileHwm: js.UndefOr[Double] = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var limits: js.UndefOr[FieldNameSize] = js.native
  
  var preservePath: js.UndefOr[Boolean] = js.native
}
object BusboyConfig {
  
  @scala.inline
  def apply(): BusboyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusboyConfig]
  }
  
  @scala.inline
  implicit class BusboyConfigOps[Self <: BusboyConfig] (val x: Self) extends AnyVal {
    
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
    def setDefCharset(value: String): Self = this.set("defCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefCharset: Self = this.set("defCharset", js.undefined)
    
    @scala.inline
    def setFileHwm(value: Double): Self = this.set("fileHwm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileHwm: Self = this.set("fileHwm", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    
    @scala.inline
    def setLimits(value: FieldNameSize): Self = this.set("limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    
    @scala.inline
    def setPreservePath(value: Boolean): Self = this.set("preservePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreservePath: Self = this.set("preservePath", js.undefined)
  }
}
