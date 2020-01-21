package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BlockStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockStatement_
  extends Node
     with Block
     with BlockParent
     with Scopable
     with Statement {
  var body: js.Array[Statement]
  var directives: js.UndefOr[js.Array[Directive_]] = js.undefined
  @JSName("type")
  var type_BlockStatement_ : BlockStatement
}

object BlockStatement_ {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: BlockStatement,
    directives: js.Array[Directive_] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStatement_]
  }
}

