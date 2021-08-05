package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonDomButtomCommon extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
}
object ButtonDomButtomCommon {
  
  inline def apply(): ButtonDomButtomCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonDomButtomCommon]
  }
  
  extension [Self <: ButtonDomButtomCommon](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
