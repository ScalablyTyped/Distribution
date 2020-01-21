package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TaggedTemplateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaggedTemplateExpression_
  extends Node
     with Expression {
  var quasi: TemplateLiteral_
  var tag: Expression
  @JSName("type")
  var type_TaggedTemplateExpression_ : TaggedTemplateExpression
}

object TaggedTemplateExpression_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    quasi: TemplateLiteral_,
    start: Double,
    tag: Expression,
    `type`: TaggedTemplateExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], quasi = quasi.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedTemplateExpression_]
  }
}

