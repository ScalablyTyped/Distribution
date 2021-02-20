package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdNode
  extends SelectorNodeType
     with BaseNode {
  
  @JSName("name")
  var name_IdNode: String = js.native
  
  var `type`: id = js.native
}
object IdNode {
  
  @scala.inline
  def apply(name: String, `type`: id): IdNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdNode]
  }
  
  @scala.inline
  implicit class IdNodeMutableBuilder[Self <: IdNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: id): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
