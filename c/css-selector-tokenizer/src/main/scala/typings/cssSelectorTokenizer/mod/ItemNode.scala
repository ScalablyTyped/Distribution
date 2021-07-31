package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemNode
  extends StObject
     with BaseNode
     with ValueNodeType {
  
  @JSName("name")
  var name_ItemNode: String
  
  var `type`: item
}
object ItemNode {
  
  @scala.inline
  def apply(name: String): ItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("item")
    __obj.asInstanceOf[ItemNode]
  }
  
  @scala.inline
  implicit class ItemNodeMutableBuilder[Self <: ItemNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: item): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
