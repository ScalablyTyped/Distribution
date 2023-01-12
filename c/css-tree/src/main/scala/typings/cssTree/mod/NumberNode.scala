package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberNode
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_NumberNode: Number
  
  var value: String
}
object NumberNode {
  
  inline def apply(value: String): NumberNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Number")
    __obj.asInstanceOf[NumberNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberNode] (val x: Self) extends AnyVal {
    
    inline def setType(value: Number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
