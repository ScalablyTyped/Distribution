package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleRules extends js.Object {
  /** Array of Errors. Errors collected during parsing when option silent is true. */
  var parsingErrors: js.UndefOr[js.Array[ParserError]] = js.native
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.Array[Rule | Comment | AtRule] = js.native
}

object StyleRules {
  @scala.inline
  def apply(rules: js.Array[Rule | Comment | AtRule]): StyleRules = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleRules]
  }
  @scala.inline
  implicit class StyleRulesOps[Self <: StyleRules] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: (Rule | Comment | AtRule)*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[Rule | Comment | AtRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsingErrorsVarargs(value: ParserError*): Self = this.set("parsingErrors", js.Array(value :_*))
    @scala.inline
    def setParsingErrors(value: js.Array[ParserError]): Self = this.set("parsingErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParsingErrors: Self = this.set("parsingErrors", js.undefined)
  }
  
}

