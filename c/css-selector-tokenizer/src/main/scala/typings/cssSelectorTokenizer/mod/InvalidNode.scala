package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.invalid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidNode
  extends StObject
     with BaseNode
     with SelectorNodeType
     with ValueNodeType {
  
  var `type`: invalid
  
  var value: String
}
object InvalidNode {
  
  inline def apply(value: String): InvalidNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("invalid")
    __obj.asInstanceOf[InvalidNode]
  }
  
  extension [Self <: InvalidNode](x: Self) {
    
    inline def setType(value: invalid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
