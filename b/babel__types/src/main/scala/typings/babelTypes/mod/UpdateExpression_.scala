package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PlussignPlussign
import typings.babelTypes.babelTypesStrings.UpdateExpression
import typings.babelTypes.babelTypesStrings.`--`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait UpdateExpression_
  extends StObject
     with BaseNode
     with Expression {
  
  var argument: Expression
  
  var operator: PlussignPlussign | `--`
  
  var prefix: Boolean
  
  @JSName("type")
  var type_UpdateExpression_ : UpdateExpression
}
object UpdateExpression_ {
  
  @scala.inline
  def apply(argument: Expression, operator: PlussignPlussign | `--`, prefix: Boolean): UpdateExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[UpdateExpression_]
  }
  
  @scala.inline
  implicit class UpdateExpression_MutableBuilder[Self <: UpdateExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: PlussignPlussign | `--`): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: UpdateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
