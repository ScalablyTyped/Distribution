package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyHyphenFallback extends StObject {
  
  var inherits: js.UndefOr[PropertyInheritsProperty | js.Array[PropertyInheritsProperty]] = js.native
  
  var `initial-value`: js.UndefOr[String | js.Array[String]] = js.native
  
  var syntax: js.UndefOr[String | js.Array[String]] = js.native
}
object PropertyHyphenFallback {
  
  @scala.inline
  def apply(): PropertyHyphenFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyHyphenFallback]
  }
  
  @scala.inline
  implicit class PropertyHyphenFallbackMutableBuilder[Self <: PropertyHyphenFallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInherits(value: PropertyInheritsProperty | js.Array[PropertyInheritsProperty]): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    @scala.inline
    def setInheritsVarargs(value: PropertyInheritsProperty*): Self = StObject.set(x, "inherits", js.Array(value :_*))
    
    @scala.inline
    def `setInitial-value`(value: String | js.Array[String]): Self = StObject.set(x, "initial-value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInitial-valueUndefined`: Self = StObject.set(x, "initial-value", js.undefined)
    
    @scala.inline
    def `setInitial-valueVarargs`(value: String*): Self = StObject.set(x, "initial-value", js.Array(value :_*))
    
    @scala.inline
    def setSyntax(value: String | js.Array[String]): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    @scala.inline
    def setSyntaxVarargs(value: String*): Self = StObject.set(x, "syntax", js.Array(value :_*))
  }
}
