package typings.csstype.mod.AtRule

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined csstype.csstype.Fallback<csstype.csstype.AtRule.Property<TLength, TTime>> */
trait PropertyFallback[TLength, TTime] extends StObject {
  
  var inherits: js.UndefOr[Inherits | js.Array[NonNullable[js.UndefOr[Inherits]]]] = js.undefined
  
  var initialValue: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
  
  var syntax: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
}
object PropertyFallback {
  
  inline def apply[TLength, TTime](): PropertyFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyFallback[TLength, TTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyFallback[?, ?], TLength, TTime] (val x: Self & (PropertyFallback[TLength, TTime])) extends AnyVal {
    
    inline def setInherits(value: Inherits | js.Array[NonNullable[js.UndefOr[Inherits]]]): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    inline def setInheritsVarargs(value: NonNullable[js.UndefOr[Inherits]]*): Self = StObject.set(x, "inherits", js.Array(value*))
    
    inline def setInitialValue(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setInitialValueVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "initialValue", js.Array(value*))
    
    inline def setSyntax(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setSyntaxVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "syntax", js.Array(value*))
  }
}
