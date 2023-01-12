package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`pseudo-class`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoClassNode
  extends StObject
     with BaseNode
     with SelectorNodeType {
  
  var content: js.UndefOr[String] = js.undefined
  
  @JSName("name")
  var name_PseudoClassNode: String
  
  var `type`: `pseudo-class`
}
object PseudoClassNode {
  
  inline def apply(name: String): PseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo-class")
    __obj.asInstanceOf[PseudoClassNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PseudoClassNode] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `pseudo-class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
