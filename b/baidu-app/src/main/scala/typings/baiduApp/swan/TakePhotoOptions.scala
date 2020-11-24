package typings.baiduApp.swan

import typings.baiduApp.anon.TempImagePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakePhotoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 成像质量，值为high, normal, low，默认normal */
  var quality: js.UndefOr[String] = js.native
  
  @JSName("success")
  var success_TakePhotoOptions: js.UndefOr[js.Function1[/* res */ TempImagePath, Unit]] = js.native
}
object TakePhotoOptions {
  
  @scala.inline
  def apply(): TakePhotoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakePhotoOptions]
  }
  
  @scala.inline
  implicit class TakePhotoOptionsOps[Self <: TakePhotoOptions] (val x: Self) extends AnyVal {
    
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
    def setQuality(value: String): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ TempImagePath => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
