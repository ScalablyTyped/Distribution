package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaggedTemplateExpression
  extends Node
     with Expression {
  var quasi: TemplateLiteral
  var tag: Expression
  @JSName("type")
  var type_TaggedTemplateExpression: babelDashTypesLib.babelDashTypesLibStrings.TaggedTemplateExpression
}

object TaggedTemplateExpression {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    quasi: TemplateLiteral,
    start: scala.Double,
    tag: Expression,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TaggedTemplateExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("quasi")(quasi)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("tag")(tag)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TaggedTemplateExpression]
  }
}

