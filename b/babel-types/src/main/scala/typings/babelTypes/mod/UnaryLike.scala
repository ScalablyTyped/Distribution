package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Exclamationmark
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.RestProperty
import typings.babelTypes.babelTypesStrings.SpreadElement
import typings.babelTypes.babelTypesStrings.SpreadProperty
import typings.babelTypes.babelTypesStrings.Tilde
import typings.babelTypes.babelTypesStrings.UnaryExpression
import typings.babelTypes.babelTypesStrings.`-_`
import typings.babelTypes.babelTypesStrings.delete
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.UnaryExpression_
  - typings.babelTypes.mod.SpreadElement_
  - typings.babelTypes.mod.RestProperty_
  - typings.babelTypes.mod.SpreadProperty_
*/
trait UnaryLike extends js.Object

object UnaryLike {
  @scala.inline
  def UnaryExpression_(
    argument: Expression,
    end: Double,
    loc: SourceLocation,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    prefix: Boolean,
    start: Double,
    `type`: UnaryExpression
  ): UnaryLike = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryLike]
  }
  @scala.inline
  def SpreadElement_(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: SpreadElement): UnaryLike = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryLike]
  }
  @scala.inline
  def RestProperty_(argument: LVal, end: Double, loc: SourceLocation, start: Double, `type`: RestProperty): UnaryLike = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryLike]
  }
  @scala.inline
  def SpreadProperty_(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: SpreadProperty): UnaryLike = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryLike]
  }
}

