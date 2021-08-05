package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaDescription
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var content: js.UndefOr[String] = js.undefined
}
object MetaDescription {
  
  inline def apply(): MetaDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaDescription]
  }
  
  extension [Self <: MetaDescription](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
