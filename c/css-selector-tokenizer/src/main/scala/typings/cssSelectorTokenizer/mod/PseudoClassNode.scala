package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`pseudo-class`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoClassNode
  extends SelectorNodeType
     with BaseNode {
  
  var content: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_PseudoClassNode: String = js.native
  
  var `type`: `pseudo-class` = js.native
}
object PseudoClassNode {
  
  @scala.inline
  def apply(name: String, `type`: `pseudo-class`): PseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoClassNode]
  }
  
  @scala.inline
  implicit class PseudoClassNodeMutableBuilder[Self <: PseudoClassNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `pseudo-class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
