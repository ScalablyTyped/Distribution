package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.LabeledStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledStatement_
  extends Node
     with Statement {
  var body: Statement
  var label: Identifier_
  @JSName("type")
  var type_LabeledStatement_ : LabeledStatement
}

object LabeledStatement_ {
  @scala.inline
  def apply(
    body: Statement,
    end: Double,
    label: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: LabeledStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): LabeledStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledStatement_]
  }
}

