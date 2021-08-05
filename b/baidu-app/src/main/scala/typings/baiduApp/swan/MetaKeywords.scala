package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaKeywords
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var content: js.UndefOr[String] = js.undefined
}
object MetaKeywords {
  
  inline def apply(): MetaKeywords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaKeywords]
  }
  
  extension [Self <: MetaKeywords](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
