package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleRules extends js.Object {
  /** Array of Errors. Errors collected during parsing when option silent is true. */
  var parsingErrors: js.UndefOr[js.Array[ParserError]] = js.undefined
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.Array[Rule | Comment | AtRule]
}

object StyleRules {
  @scala.inline
  def apply(rules: js.Array[Rule | Comment | AtRule], parsingErrors: js.Array[ParserError] = null): StyleRules = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    if (parsingErrors != null) __obj.updateDynamic("parsingErrors")(parsingErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleRules]
  }
}

