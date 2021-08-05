package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Declaration
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var important: Boolean | String
  
  var property: String
  
  @JSName("type")
  var type_Declaration: typings.cssTree.cssTreeStrings.Declaration
  
  var value: Value | Raw
}
object Declaration {
  
  inline def apply(important: Boolean | String, property: String, value: Value | Raw): Declaration = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Declaration")
    __obj.asInstanceOf[Declaration]
  }
  
  extension [Self <: Declaration](x: Self) {
    
    inline def setImportant(value: Boolean | String): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.cssTree.cssTreeStrings.Declaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value | Raw): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
