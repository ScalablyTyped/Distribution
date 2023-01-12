package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaKeywords
  extends StObject
     with BaseOptions[Any, Any] {
  
  var content: js.UndefOr[String] = js.undefined
}
object MetaKeywords {
  
  inline def apply(): MetaKeywords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaKeywords]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetaKeywords] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
