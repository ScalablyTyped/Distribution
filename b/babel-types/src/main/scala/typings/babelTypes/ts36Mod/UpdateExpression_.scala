package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.PlussignPlussign
import typings.babelTypes.babelTypesStrings.UpdateExpression
import typings.babelTypes.babelTypesStrings.`--`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExpression_
  extends StObject
     with Node
     with Expression {
  
  var argument: Expression
  
  var operator: PlussignPlussign | `--`
  
  var prefix: Boolean
  
  @JSName("type")
  var type_UpdateExpression_ : UpdateExpression
}
object UpdateExpression_ {
  
  inline def apply(
    argument: Expression,
    end: Double,
    loc: SourceLocation,
    operator: PlussignPlussign | `--`,
    prefix: Boolean,
    start: Double
  ): UpdateExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[UpdateExpression_]
  }
  
  extension [Self <: UpdateExpression_](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: PlussignPlussign | `--`): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setType(value: UpdateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
