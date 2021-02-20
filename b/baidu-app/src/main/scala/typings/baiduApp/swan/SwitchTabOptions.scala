package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchTabOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 需要跳转的 tabBar 页面的路径
    * （需在 app.json 的 tabBar 字段定义的页面），路径后不能带参数
    */
  var url: String = js.native
}
object SwitchTabOptions {
  
  @scala.inline
  def apply(url: String): SwitchTabOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchTabOptions]
  }
  
  @scala.inline
  implicit class SwitchTabOptionsMutableBuilder[Self <: SwitchTabOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
