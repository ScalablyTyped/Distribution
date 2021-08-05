package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.AmpersandAmpersand
import typings.babelTypes.babelTypesStrings.LogicalExpression
import typings.babelTypes.babelTypesStrings.VerticallineVerticalline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogicalExpression_
  extends StObject
     with Node
     with Binary
     with Expression {
  
  var left: Expression
  
  var operator: VerticallineVerticalline | AmpersandAmpersand
  
  var right: Expression
  
  @JSName("type")
  var type_LogicalExpression_ : LogicalExpression
}
object LogicalExpression_ {
  
  inline def apply(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: VerticallineVerticalline | AmpersandAmpersand,
    right: Expression,
    start: Double
  ): LogicalExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[LogicalExpression_]
  }
  
  extension [Self <: LogicalExpression_](x: Self) {
    
    inline def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: VerticallineVerticalline | AmpersandAmpersand): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: LogicalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
