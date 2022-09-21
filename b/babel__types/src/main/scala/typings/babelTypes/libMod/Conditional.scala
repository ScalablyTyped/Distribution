package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.ConditionalExpression_
  - typings.babelTypes.libMod.IfStatement_
*/
trait Conditional extends StObject
object Conditional {
  
  inline def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression): typings.babelTypes.libMod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ConditionalExpression_]
  }
  
  inline def IfStatement_(consequent: Statement, test: Expression): typings.babelTypes.libMod.IfStatement_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.IfStatement_]
  }
}
