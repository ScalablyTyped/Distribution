package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.NewExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewExpression_
  extends Node
     with Expression {
  
  var arguments: js.Array[Expression | SpreadElement_] = js.native
  
  var callee: Expression | Super = js.native
  
  @JSName("type")
  var type_NewExpression_ : NewExpression = js.native
}
object NewExpression_ {
  
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement_],
    callee: Expression | Super,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: NewExpression
  ): NewExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewExpression_]
  }
  
  @scala.inline
  implicit class NewExpression_MutableBuilder[Self <: NewExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Expression | SpreadElement_]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: (Expression | SpreadElement_)*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setCallee(value: Expression | Super): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
