package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaggedTemplateExpression
  extends Node
     with Expression {
  var quasi: TemplateLiteral
  var tag: Expression
  @JSName("type")
  var type_TaggedTemplateExpression: typings.babelDashTypes.babelDashTypesStrings.TaggedTemplateExpression
}

object TaggedTemplateExpression {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    quasi: TemplateLiteral,
    start: Double,
    tag: Expression,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TaggedTemplateExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, quasi = quasi, start = start, tag = tag)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TaggedTemplateExpression]
  }
}

@JSImport("babel-types", "taggedTemplateExpression")
@js.native
object taggedTemplateExpression extends js.Object {
  def apply(): TaggedTemplateExpression = js.native
  def apply(tag: Expression): TaggedTemplateExpression = js.native
  def apply(tag: Expression, quasi: TemplateLiteral): TaggedTemplateExpression = js.native
}

