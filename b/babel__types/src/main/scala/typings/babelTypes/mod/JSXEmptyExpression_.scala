package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXEmptyExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait JSXEmptyExpression_
  extends StObject
     with BaseNode
     with JSX {
  
  @JSName("type")
  var type_JSXEmptyExpression_ : JSXEmptyExpression
}
object JSXEmptyExpression_ {
  
  @scala.inline
  def apply(): JSXEmptyExpression_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[JSXEmptyExpression_]
  }
  
  @scala.inline
  implicit class JSXEmptyExpression_MutableBuilder[Self <: JSXEmptyExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXEmptyExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
