package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyHyphen extends StObject {
  
  var inherits: js.UndefOr[PropertyInheritsProperty] = js.undefined
  
  var `initial-value`: js.UndefOr[String] = js.undefined
  
  var syntax: js.UndefOr[String] = js.undefined
}
object PropertyHyphen {
  
  inline def apply(): PropertyHyphen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyHyphen]
  }
  
  extension [Self <: PropertyHyphen](x: Self) {
    
    inline def setInherits(value: PropertyInheritsProperty): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    inline def `setInitial-value`(value: String): Self = StObject.set(x, "initial-value", value.asInstanceOf[js.Any])
    
    inline def `setInitial-valueUndefined`: Self = StObject.set(x, "initial-value", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
