package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextProperty extends StObject {
  
  /**
    * Property identifier, usually the node name.
    */
  var key: String
  
  /**
    * Property value.
    */
  var value: TextValue
}
object TextProperty {
  
  inline def apply(key: String, value: TextValue): TextProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextProperty] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TextValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
