package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.AmpersandEqualssign
import typings.babelTypes.babelTypesStrings.AssignmentExpression
import typings.babelTypes.babelTypesStrings.AsteriskEqualssign
import typings.babelTypes.babelTypesStrings.Equalssign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignEqualssign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typings.babelTypes.babelTypesStrings.LessthansignLessthansignEqualssign
import typings.babelTypes.babelTypesStrings.PercentsignEqualssign
import typings.babelTypes.babelTypesStrings.PlussignEqualssign
import typings.babelTypes.babelTypesStrings.SlashEqualssign
import typings.babelTypes.babelTypesStrings.VerticallineEqualssign
import typings.babelTypes.babelTypesStrings.`-Equalssign`
import typings.babelTypes.babelTypesStrings.`^Equalssign`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentExpression_
  extends StObject
     with Node
     with Expression {
  
  var left: LVal
  
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
  
  var right: Expression
  
  @JSName("type")
  var type_AssignmentExpression_ : AssignmentExpression
}
object AssignmentExpression_ {
  
  inline def apply(
    end: Double,
    left: LVal,
    loc: SourceLocation,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: Expression,
    start: Double
  ): AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[AssignmentExpression_]
  }
  
  extension [Self <: AssignmentExpression_](x: Self) {
    
    inline def setLeft(value: LVal): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(
      value: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
