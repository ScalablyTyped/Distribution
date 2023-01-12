package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeight extends StObject {
  
  var fontWeight: Any
}
object FontWeight {
  
  inline def apply(fontWeight: Any): FontWeight = {
    val __obj = js.Dynamic.literal(fontWeight = fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontWeight] (val x: Self) extends AnyVal {
    
    inline def setFontWeight(value: Any): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
  }
}
