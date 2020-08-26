package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ConditionalExpression
import typings.babelTypes.babelTypesStrings.IfStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ConditionalExpression_
  - typings.babelTypes.mod.IfStatement_
*/
trait Conditional extends js.Object

object Conditional {
  @scala.inline
  def ConditionalExpression_(
    alternate: Expression,
    consequent: Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: ConditionalExpression
  ): Conditional = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditional]
  }
  @scala.inline
  def IfStatement_(
    alternate: Statement,
    consequent: Statement,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: IfStatement
  ): Conditional = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditional]
  }
}

