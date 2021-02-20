package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarBadgeOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * tabBar的哪一项，从左边算起
    */
  var index: Double = js.native
}
object TabBarBadgeOptions {
  
  @scala.inline
  def apply(index: Double): TabBarBadgeOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarBadgeOptions]
  }
  
  @scala.inline
  implicit class TabBarBadgeOptionsMutableBuilder[Self <: TabBarBadgeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
