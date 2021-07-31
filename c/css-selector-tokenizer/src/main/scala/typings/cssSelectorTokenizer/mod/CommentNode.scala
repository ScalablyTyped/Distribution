package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentNode
  extends StObject
     with BaseNode
     with SelectorNodeType
     with ValueNodeType {
  
  var content: String
  
  var `type`: comment
}
object CommentNode {
  
  @scala.inline
  def apply(content: String): CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.asInstanceOf[CommentNode]
  }
  
  @scala.inline
  implicit class CommentNodeMutableBuilder[Self <: CommentNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
