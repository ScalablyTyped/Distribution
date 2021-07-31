package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatorNode
  extends StObject
     with BaseNode
     with SelectorNodeType {
  
  var operator: String
  
  var `type`: operator
}
object OperatorNode {
  
  @scala.inline
  def apply(operator: String): OperatorNode = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("operator")
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
