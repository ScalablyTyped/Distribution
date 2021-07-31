package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ExpressionStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionStatement_
  extends StObject
     with Node
     with ExpressionWrapper
     with Statement {
  
  var expression: Expression
  
  @JSName("type")
  var type_ExpressionStatement_ : ExpressionStatement
}
object ExpressionStatement_ {
  
  @scala.inline
  def apply(end: Double, expression: Expression, loc: SourceLocation, start: Double): ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[ExpressionStatement_]
  }
  
  @scala.inline
  implicit class ExpressionStatement_MutableBuilder[Self <: ExpressionStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExpressionStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
