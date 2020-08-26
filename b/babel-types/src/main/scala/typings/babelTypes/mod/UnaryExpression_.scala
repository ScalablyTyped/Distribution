package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Exclamationmark
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.Tilde
import typings.babelTypes.babelTypesStrings.UnaryExpression
import typings.babelTypes.babelTypesStrings.`-_`
import typings.babelTypes.babelTypesStrings.delete
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnaryExpression_
  extends Node
     with Expression
     with UnaryLike {
  var argument: Expression = js.native
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete = js.native
  var prefix: Boolean = js.native
  @JSName("type")
  var type_UnaryExpression_ : UnaryExpression = js.native
}

object UnaryExpression_ {
  @scala.inline
  def apply(
    argument: Expression,
    end: Double,
    loc: SourceLocation,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    prefix: Boolean,
    start: Double,
    `type`: UnaryExpression
  ): UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression_]
  }
  @scala.inline
  implicit class UnaryExpression_Ops[Self <: UnaryExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgument(value: Expression): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: Boolean): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: UnaryExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

