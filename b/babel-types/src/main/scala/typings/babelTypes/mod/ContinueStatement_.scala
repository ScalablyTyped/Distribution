package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ContinueStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueStatement_
  extends Node
     with CompletionStatement
     with Statement
     with Terminatorless {
  var label: Identifier_
  @JSName("type")
  var type_ContinueStatement_ : ContinueStatement
}

object ContinueStatement_ {
  @scala.inline
  def apply(
    end: Double,
    label: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ContinueStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement_]
  }
}

