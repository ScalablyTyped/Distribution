package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringNode
  extends ValueNodeType
     with BaseNode {
  
  var stringType: String = js.native
  
  var `type`: string = js.native
  
  var value: String = js.native
}
object StringNode {
  
  @scala.inline
  def apply(stringType: String, `type`: string, value: String): StringNode = {
    val __obj = js.Dynamic.literal(stringType = stringType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringNode]
  }
  
  @scala.inline
  implicit class StringNodeMutableBuilder[Self <: StringNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStringType(value: String): Self = StObject.set(x, "stringType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
