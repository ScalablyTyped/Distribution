package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AwaitExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait AwaitExpression_
  extends StObject
     with BaseNode
     with Expression
     with Terminatorless {
  
  var argument: Expression
  
  @JSName("type")
  var type_AwaitExpression_ : AwaitExpression
}
object AwaitExpression_ {
  
  @scala.inline
  def apply(argument: Expression): AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[AwaitExpression_]
  }
  
  @scala.inline
  implicit class AwaitExpression_MutableBuilder[Self <: AwaitExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AwaitExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
