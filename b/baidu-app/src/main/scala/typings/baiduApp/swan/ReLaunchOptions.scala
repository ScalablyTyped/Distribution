package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReLaunchOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 需要跳转的应用内页面路径 , 路径后可以带参数。
    * 参数与路径之间使用?分隔，参数键与参数值用=相连，不同参数用&分隔
    * 如 'path?key=value&key2=value2'，如果跳转的页面路径是 tabBar 页面则不能带参数
    */
  var url: String
}
object ReLaunchOptions {
  
  inline def apply(url: String): ReLaunchOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReLaunchOptions]
  }
  
  extension [Self <: ReLaunchOptions](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
