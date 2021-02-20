package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatorNode
  extends SelectorNodeType
     with BaseNode {
  
  var operator: String = js.native
  
  var `type`: operator = js.native
}
object OperatorNode {
  
  @scala.inline
  def apply(operator: String, `type`: operator): OperatorNode = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatorNode]
  }
  
  @scala.inline
  implicit class OperatorNodeMutableBuilder[Self <: OperatorNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: operator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
