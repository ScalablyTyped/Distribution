package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  /**
    * 获取当前页面
    */
  def getCurrentPage(): Page[js.Object, js.Object]
}
object App {
  
  inline def apply(getCurrentPage: () => Page[js.Object, js.Object]): App = {
    val __obj = js.Dynamic.literal(getCurrentPage = js.Any.fromFunction0(getCurrentPage))
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setGetCurrentPage(value: () => Page[js.Object, js.Object]): Self = StObject.set(x, "getCurrentPage", js.Any.fromFunction0(value))
  }
}
