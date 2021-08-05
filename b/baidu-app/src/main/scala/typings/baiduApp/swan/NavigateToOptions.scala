package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 界面-----导航
trait NavigateToOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 需要跳转的应用内页面的路径 */
  var url: String
}
object NavigateToOptions {
  
  inline def apply(url: String): NavigateToOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToOptions]
  }
  
  extension [Self <: NavigateToOptions](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
