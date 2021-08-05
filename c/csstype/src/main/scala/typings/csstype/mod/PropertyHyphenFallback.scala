package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyHyphenFallback extends StObject {
  
  var inherits: js.UndefOr[PropertyInheritsProperty | js.Array[PropertyInheritsProperty]] = js.undefined
  
  var `initial-value`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var syntax: js.UndefOr[String | js.Array[String]] = js.undefined
}
object PropertyHyphenFallback {
  
  inline def apply(): PropertyHyphenFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyHyphenFallback]
  }
  
  extension [Self <: PropertyHyphenFallback](x: Self) {
    
    inline def setInherits(value: PropertyInheritsProperty | js.Array[PropertyInheritsProperty]): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    inline def setInheritsVarargs(value: PropertyInheritsProperty*): Self = StObject.set(x, "inherits", js.Array(value :_*))
    
    inline def `setInitial-value`(value: String | js.Array[String]): Self = StObject.set(x, "initial-value", value.asInstanceOf[js.Any])
    
    inline def `setInitial-valueUndefined`: Self = StObject.set(x, "initial-value", js.undefined)
    
    inline def `setInitial-valueVarargs`(value: String*): Self = StObject.set(x, "initial-value", js.Array(value :_*))
    
    inline def setSyntax(value: String | js.Array[String]): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setSyntaxVarargs(value: String*): Self = StObject.set(x, "syntax", js.Array(value :_*))
  }
}
