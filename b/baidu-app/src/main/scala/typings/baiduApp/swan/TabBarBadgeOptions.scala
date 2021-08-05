package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabBarBadgeOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * tabBar的哪一项，从左边算起
    */
  var index: Double
}
object TabBarBadgeOptions {
  
  inline def apply(index: Double): TabBarBadgeOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarBadgeOptions]
  }
  
  extension [Self <: TabBarBadgeOptions](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
