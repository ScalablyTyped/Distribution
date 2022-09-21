package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTabBarBadgeOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * tabBar的哪一项，从左边算起
    */
  var index: Double
  
  /**
    * 显示的文本，超过 3 个字符则显示成“…”
    */
  var text: String
}
object SetTabBarBadgeOptions {
  
  inline def apply(index: Double, text: String): SetTabBarBadgeOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarBadgeOptions]
  }
  
  extension [Self <: SetTabBarBadgeOptions](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
