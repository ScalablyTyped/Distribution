package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemNode
  extends ValueNodeType
     with BaseNode {
  
  @JSName("name")
  var name_ItemNode: String = js.native
  
  var `type`: item = js.native
}
object ItemNode {
  
  @scala.inline
  def apply(name: String, `type`: item): ItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
