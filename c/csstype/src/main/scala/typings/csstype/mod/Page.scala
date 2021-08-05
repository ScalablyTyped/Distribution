package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page[TLength] extends StObject {
  
  var size: js.UndefOr[PageSizeProperty[TLength]] = js.undefined
}
object Page {
  
  inline def apply[TLength](): Page[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page[TLength]]
  }
  
  extension [Self <: Page[?], TLength](x: Self & Page[TLength]) {
    
    inline def setSize(value: PageSizeProperty[TLength]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
