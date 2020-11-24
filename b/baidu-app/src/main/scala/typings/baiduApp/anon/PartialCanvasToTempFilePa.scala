package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<baidu-app.swan.CanvasToTempFilePathOptions> */
@js.native
trait PartialCanvasToTempFilePa extends js.Object {
  
  var canvasId: js.UndefOr[String] = js.native
  
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var destHeight: js.UndefOr[Double] = js.native
  
  var destWidth: js.UndefOr[Double] = js.native
  
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var fileType: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object PartialCanvasToTempFilePa {
  
  @scala.inline
  def apply(): PartialCanvasToTempFilePa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCanvasToTempFilePa]
  }
  
  @scala.inline
  implicit class PartialCanvasToTempFilePaOps[Self <: PartialCanvasToTempFilePa] (val x: Self) extends AnyVal {
    
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
    def setCanvasId(value: String): Self = this.set("canvasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasId: Self = this.set("canvasId", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setDestHeight(value: Double): Self = this.set("destHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestHeight: Self = this.set("destHeight", js.undefined)
    
    @scala.inline
    def setDestWidth(value: Double): Self = this.set("destWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestWidth: Self = this.set("destWidth", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ js.Any => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
