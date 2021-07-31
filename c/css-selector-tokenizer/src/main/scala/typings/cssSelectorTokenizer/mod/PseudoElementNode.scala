package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`pseudo-element`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoElementNode
  extends StObject
     with BaseNode
     with SelectorNodeType {
  
  @JSName("name")
  var name_PseudoElementNode: String
  
  var `type`: `pseudo-element`
}
object PseudoElementNode {
  
  @scala.inline
  def apply(name: String): PseudoElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo-element")
    __obj.asInstanceOf[PseudoElementNode]
  }
  
  @scala.inline
  implicit class PseudoElementNodeMutableBuilder[Self <: PseudoElementNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `pseudo-element`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
