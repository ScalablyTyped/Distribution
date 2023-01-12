package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarationPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var important: Boolean | String
  
  var property: String
  
  @JSName("type")
  var type_DeclarationPlain: typings.cssTree.cssTreeStrings.Declaration
  
  var value: ValuePlain | Raw
}
object DeclarationPlain {
  
  inline def apply(important: Boolean | String, property: String, value: ValuePlain | Raw): DeclarationPlain = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Declaration")
    __obj.asInstanceOf[DeclarationPlain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeclarationPlain] (val x: Self) extends AnyVal {
    
    inline def setImportant(value: Boolean | String): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.cssTree.cssTreeStrings.Declaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ValuePlain | Raw): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
