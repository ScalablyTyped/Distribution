package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property extends StObject {
  
  var inherits: js.UndefOr[PropertyInheritsProperty] = js.undefined
  
  var initialValue: js.UndefOr[String] = js.undefined
  
  var syntax: js.UndefOr[String] = js.undefined
}
object Property {
  
  inline def apply(): Property = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Property]
  }
  
  extension [Self <: Property](x: Self) {
    
    inline def setInherits(value: PropertyInheritsProperty): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
