package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.Decorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decorator_
  extends StObject
     with Node {
  
  var expression: Expression
  
  @JSName("type")
  var type_Decorator_ : Decorator
}
object Decorator_ {
  
  @scala.inline
  def apply(end: Double, expression: Expression, loc: SourceLocation, start: Double): Decorator_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Decorator")
    __obj.asInstanceOf[Decorator_]
  }
  
  @scala.inline
  implicit class Decorator_MutableBuilder[Self <: Decorator_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Decorator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
