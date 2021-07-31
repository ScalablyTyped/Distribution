package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXEmptyExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXEmptyExpression_
  extends StObject
     with Node
     with Expression
     with JSX {
  
  @JSName("type")
  var type_JSXEmptyExpression_ : JSXEmptyExpression
}
object JSXEmptyExpression_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double): JSXEmptyExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[JSXEmptyExpression_]
  }
  
  @scala.inline
  implicit class JSXEmptyExpression_MutableBuilder[Self <: JSXEmptyExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXEmptyExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
