package typings.cssSelectorTokenizer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cssSelectorTokenizer.mod.ItemNode
  - typings.cssSelectorTokenizer.mod.NestedItemNode
  - typings.cssSelectorTokenizer.mod.StringNode
  - typings.cssSelectorTokenizer.mod.CommentNode
  - typings.cssSelectorTokenizer.mod.UrlNode
  - typings.cssSelectorTokenizer.mod.InvalidNode
*/
trait ValueNodeType
  extends StObject
     with AnyValueNode
object ValueNodeType {
  
  inline def CommentNode(content: String): typings.cssSelectorTokenizer.mod.CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.CommentNode]
  }
  
  inline def InvalidNode(value: String): typings.cssSelectorTokenizer.mod.InvalidNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("invalid")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.InvalidNode]
  }
  
  inline def ItemNode(name: String): typings.cssSelectorTokenizer.mod.ItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("item")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.ItemNode]
  }
  
  inline def NestedItemNode(name: String, nodes: js.Array[ValueNode]): typings.cssSelectorTokenizer.mod.NestedItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nested-item")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.NestedItemNode]
  }
  
  inline def StringNode(stringType: String, value: String): typings.cssSelectorTokenizer.mod.StringNode = {
    val __obj = js.Dynamic.literal(stringType = stringType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.StringNode]
  }
  
  inline def UrlNode(url: String): typings.cssSelectorTokenizer.mod.UrlNode = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("url")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.UrlNode]
  }
}
