package typings.baiduApp.swan

import typings.baiduApp.anon.Latitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 位置-----地图组件控制
@js.native
trait GetCenterLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetCenterLocationOptions(res: Latitude): Unit = js.native
}
object GetCenterLocationOptions {
  
  @scala.inline
  def apply(success: Latitude => Unit): GetCenterLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetCenterLocationOptions]
  }
  
  @scala.inline
  implicit class GetCenterLocationOptionsOps[Self <: GetCenterLocationOptions] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: Latitude => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
