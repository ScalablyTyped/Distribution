package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ConditionalExpression
import typings.babelTypes.babelTypesStrings.IfStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ConditionalExpression_
  - typings.babelTypes.mod.IfStatement_
*/
trait Conditional extends _Node
object Conditional {
  
  @scala.inline
  def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression, `type`: ConditionalExpression): Conditional = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditional]
  }
  
  @scala.inline
  def IfStatement_(consequent: Statement, test: Expression, `type`: IfStatement): Conditional = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditional]
  }
}
