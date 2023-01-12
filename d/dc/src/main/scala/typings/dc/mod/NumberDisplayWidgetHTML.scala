package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberDisplayWidgetHTML extends StObject {
  
  var none: String
  
  var one: String
  
  var some: String
}
object NumberDisplayWidgetHTML {
  
  inline def apply(none: String, one: String, some: String): NumberDisplayWidgetHTML = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberDisplayWidgetHTML]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberDisplayWidgetHTML] (val x: Self) extends AnyVal {
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setSome(value: String): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
  }
}
