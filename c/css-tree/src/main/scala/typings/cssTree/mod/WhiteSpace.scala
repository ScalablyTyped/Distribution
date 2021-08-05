package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhiteSpace
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_WhiteSpace: typings.cssTree.cssTreeStrings.WhiteSpace
  
  var value: String
}
object WhiteSpace {
  
  inline def apply(value: String): WhiteSpace = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhiteSpace")
    __obj.asInstanceOf[WhiteSpace]
  }
  
  extension [Self <: WhiteSpace](x: Self) {
    
    inline def setType(value: typings.cssTree.cssTreeStrings.WhiteSpace): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
