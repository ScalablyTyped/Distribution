package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringNode
  extends StObject
     with BaseNode
     with ValueNodeType {
  
  var stringType: String
  
  var `type`: string
  
  var value: String
}
object StringNode {
  
  inline def apply(stringType: String, value: String): StringNode = {
    val __obj = js.Dynamic.literal(stringType = stringType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[StringNode]
  }
  
  extension [Self <: StringNode](x: Self) {
    
    inline def setStringType(value: String): Self = StObject.set(x, "stringType", value.asInstanceOf[js.Any])
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
