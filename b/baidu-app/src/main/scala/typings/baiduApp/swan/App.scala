package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends StObject {
  
  /**
    * 获取当前页面
    */
  def getCurrentPage(): Page[js.Object, js.Object] = js.native
}
object App {
  
  @scala.inline
  def apply(getCurrentPage: () => Page[js.Object, js.Object]): App = {
    val __obj = js.Dynamic.literal(getCurrentPage = js.Any.fromFunction0(getCurrentPage))
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentPage(value: () => Page[js.Object, js.Object]): Self = StObject.set(x, "getCurrentPage", js.Any.fromFunction0(value))
  }
}
