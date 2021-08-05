package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinLength extends StObject {
  
  var minLength: js.UndefOr[String | Double] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object MinLength {
  
  inline def apply(): MinLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinLength]
  }
  
  extension [Self <: MinLength](x: Self) {
    
    inline def setMinLength(value: String | Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
