package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.invalid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidNode
  extends SelectorNodeType
     with BaseNode
     with ValueNodeType {
  
  var `type`: invalid = js.native
  
  var value: String = js.native
}
object InvalidNode {
  
  @scala.inline
  def apply(`type`: invalid, value: String): InvalidNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidNode]
  }
  
  @scala.inline
  implicit class InvalidNodeMutableBuilder[Self <: InvalidNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: invalid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
