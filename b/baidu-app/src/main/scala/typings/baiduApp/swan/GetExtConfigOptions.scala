package typings.baiduApp.swan

import typings.baiduApp.anon.errMsgstringExtConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExtConfigOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetExtConfigOptions(res: errMsgstringExtConfig): Unit = js.native
}
object GetExtConfigOptions {
  
  @scala.inline
  def apply(success: errMsgstringExtConfig => Unit): GetExtConfigOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetExtConfigOptions]
  }
  
  @scala.inline
  implicit class GetExtConfigOptionsOps[Self <: GetExtConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: errMsgstringExtConfig => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
