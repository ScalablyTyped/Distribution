package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementNode
  extends SelectorNodeType
     with BaseNode {
  
  @JSName("name")
  var name_ElementNode: String = js.native
  
  var namespace: js.UndefOr[String] = js.native
  
  var `type`: element = js.native
}
object ElementNode {
  
  @scala.inline
  def apply(name: String, `type`: element): ElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementNode]
  }
  
  @scala.inline
  implicit class ElementNodeMutableBuilder[Self <: ElementNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
