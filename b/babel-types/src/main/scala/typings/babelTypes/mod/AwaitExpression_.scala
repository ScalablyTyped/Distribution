package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AwaitExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwaitExpression_
  extends StObject
     with Node
     with Expression
     with Terminatorless {
  
  var argument: Expression
  
  @JSName("type")
  var type_AwaitExpression_ : AwaitExpression
}
object AwaitExpression_ {
  
  inline def apply(argument: Expression, end: Double, loc: SourceLocation, start: Double): AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[AwaitExpression_]
  }
  
  extension [Self <: AwaitExpression_](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: AwaitExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
