package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExpression_
  extends StObject
     with Node
     with Expression {
  
  var arguments: js.Array[Expression | SpreadElement_]
  
  var callee: Expression | Super
  
  @JSName("type")
  var type_CallExpression_ : CallExpression
}
object CallExpression_ {
  
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement_],
    callee: Expression | Super,
    end: Double,
    loc: SourceLocation,
    start: Double
  ): CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[CallExpression_]
  }
  
  @scala.inline
  implicit class CallExpression_MutableBuilder[Self <: CallExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Expression | SpreadElement_]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: (Expression | SpreadElement_)*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setCallee(value: Expression | Super): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
