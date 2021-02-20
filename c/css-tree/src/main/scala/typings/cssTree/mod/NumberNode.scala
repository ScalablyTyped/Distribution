package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberNode
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_NumberNode: Number = js.native
  
  var value: String = js.native
}
object NumberNode {
  
  @scala.inline
  def apply(`type`: Number, value: String): NumberNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberNode]
  }
  
  @scala.inline
  implicit class NumberNodeMutableBuilder[Self <: NumberNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
