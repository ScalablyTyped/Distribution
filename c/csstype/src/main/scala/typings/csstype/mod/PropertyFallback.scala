package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyFallback extends StObject {
  
  var inherits: js.UndefOr[PropertyInheritsProperty | js.Array[PropertyInheritsProperty]] = js.undefined
  
  var initialValue: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var syntax: js.UndefOr[String | js.Array[String]] = js.undefined
}
object PropertyFallback {
  
  @scala.inline
  def apply(): PropertyFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyFallback]
  }
  
  @scala.inline
  implicit class PropertyFallbackMutableBuilder[Self <: PropertyFallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInherits(value: PropertyInheritsProperty | js.Array[PropertyInheritsProperty]): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    @scala.inline
    def setInheritsVarargs(value: PropertyInheritsProperty*): Self = StObject.set(x, "inherits", js.Array(value :_*))
    
    @scala.inline
    def setInitialValue(value: String | js.Array[String]): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    @scala.inline
    def setInitialValueVarargs(value: String*): Self = StObject.set(x, "initialValue", js.Array(value :_*))
    
    @scala.inline
    def setSyntax(value: String | js.Array[String]): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    @scala.inline
    def setSyntaxVarargs(value: String*): Self = StObject.set(x, "syntax", js.Array(value :_*))
  }
}
