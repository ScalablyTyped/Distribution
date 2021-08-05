package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxLength extends StObject {
  
  var maxLength: js.UndefOr[String | Double] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object MaxLength {
  
  inline def apply(): MaxLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxLength]
  }
  
  extension [Self <: MaxLength](x: Self) {
    
    inline def setMaxLength(value: String | Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
