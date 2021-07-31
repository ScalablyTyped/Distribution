package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringNode
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_StringNode: String
  
  var value: java.lang.String
}
object StringNode {
  
  @scala.inline
  def apply(value: java.lang.String): StringNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("String")
    __obj.asInstanceOf[StringNode]
  }
  
  @scala.inline
  implicit class StringNodeMutableBuilder[Self <: StringNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: java.lang.String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
