package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateLiteral
  extends Node
     with Expression
     with Literal {
  var expressions: js.Array[Expression]
  var quasis: js.Array[TemplateElement]
  @JSName("type")
  var type_TemplateLiteral: babelDashTypesLib.babelDashTypesLibStrings.TemplateLiteral
}

object TemplateLiteral {
  @scala.inline
  def apply(
    end: scala.Double,
    expressions: js.Array[Expression],
    loc: SourceLocation,
    quasis: js.Array[TemplateElement],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TemplateLiteral,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateLiteral = {
    val __obj = js.Dynamic.literal(end = end, expressions = expressions, loc = loc, quasis = quasis, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TemplateLiteral]
  }
}

