package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialCodeString extends StObject {
  
  var dialCode: String
  
  var id: String
  
  var label: String
}
object DialCodeString {
  
  inline def apply(dialCode: String, id: String, label: String): DialCodeString = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialCodeString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialCodeString] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
