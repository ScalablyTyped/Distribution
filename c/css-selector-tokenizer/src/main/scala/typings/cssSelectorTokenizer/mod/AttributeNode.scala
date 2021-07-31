package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeNode
  extends StObject
     with BaseNode
     with SelectorNodeType {
  
  var content: String
  
  var `type`: attribute
}
object AttributeNode {
  
  @scala.inline
  def apply(content: String): AttributeNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[AttributeNode]
  }
  
  @scala.inline
  implicit class AttributeNodeMutableBuilder[Self <: AttributeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: attribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
