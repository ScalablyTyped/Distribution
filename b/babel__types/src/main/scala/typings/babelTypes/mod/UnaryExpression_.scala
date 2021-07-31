package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Exclamationmark
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.Tilde
import typings.babelTypes.babelTypesStrings.UnaryExpression
import typings.babelTypes.babelTypesStrings.`-_`
import typings.babelTypes.babelTypesStrings.`throw`
import typings.babelTypes.babelTypesStrings.delete
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait UnaryExpression_
  extends StObject
     with BaseNode
     with Expression
     with UnaryLike {
  
  var argument: Expression
  
  var operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof
  
  var prefix: Boolean
  
  @JSName("type")
  var type_UnaryExpression_ : UnaryExpression
}
object UnaryExpression_ {
  
  @scala.inline
  def apply(
    argument: Expression,
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    prefix: Boolean
  ): UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[UnaryExpression_]
  }
  
  @scala.inline
  implicit class UnaryExpression_MutableBuilder[Self <: UnaryExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: UnaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
