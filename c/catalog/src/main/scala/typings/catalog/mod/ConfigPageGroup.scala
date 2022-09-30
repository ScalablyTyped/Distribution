package typings.catalog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigPageGroup
  extends StObject
     with ConfigPageOrGroup {
  
  var pages: js.Array[ConfigPage]
  
  var title: String
}
object ConfigPageGroup {
  
  inline def apply(pages: js.Array[ConfigPage], title: String): ConfigPageGroup = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigPageGroup]
  }
  
  extension [Self <: ConfigPageGroup](x: Self) {
    
    inline def setPages(value: js.Array[ConfigPage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: ConfigPage*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
