package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ConditionalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalExpression_
  extends Node
     with Conditional
     with Expression {
  
  var alternate: Expression = js.native
  
  var consequent: Expression = js.native
  
  var test: Expression = js.native
  
  @JSName("type")
  var type_ConditionalExpression_ : ConditionalExpression = js.native
}
object ConditionalExpression_ {
  
  @scala.inline
  def apply(
    alternate: Expression,
    consequent: Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: ConditionalExpression
  ): ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalExpression_]
  }
  
  @scala.inline
  implicit class ConditionalExpression_MutableBuilder[Self <: ConditionalExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: Expression): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequent(value: Expression): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ConditionalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
