package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdNode
  extends StObject
     with BaseNode
     with SelectorNodeType {
  
  @JSName("name")
  var name_IdNode: String
  
  var `type`: id
}
object IdNode {
  
  inline def apply(name: String): IdNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("id")
    __obj.asInstanceOf[IdNode]
  }
  
  extension [Self <: IdNode](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: id): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
