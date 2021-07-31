package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.Exclamationmark
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.Tilde
import typings.babelTypes.babelTypesStrings.UnaryExpression
import typings.babelTypes.babelTypesStrings.`-_`
import typings.babelTypes.babelTypesStrings.delete
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnaryExpression_
  extends StObject
     with Node
     with Expression
     with UnaryLike {
  
  var argument: Expression
  
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  
  var prefix: Boolean
  
  @JSName("type")
  var type_UnaryExpression_ : UnaryExpression
}
object UnaryExpression_ {
  
  @scala.inline
  def apply(
    argument: Expression,
    end: Double,
    loc: SourceLocation,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    prefix: Boolean,
    start: Double
  ): UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[UnaryExpression_]
  }
  
  @scala.inline
  implicit class UnaryExpression_MutableBuilder[Self <: UnaryExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: UnaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
