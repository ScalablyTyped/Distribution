package typings.babelDashTypes.babelDashTypesMod

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
  var type_TemplateLiteral: typings.babelDashTypes.babelDashTypesStrings.TemplateLiteral
}

object TemplateLiteral {
  @scala.inline
  def apply(
    end: Double,
    expressions: js.Array[Expression],
    loc: SourceLocation,
    quasis: js.Array[TemplateElement],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TemplateLiteral,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateLiteral = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLiteral]
  }
}

@JSImport("babel-types", "templateLiteral")
@js.native
object templateLiteral extends js.Object {
  def apply(): TemplateLiteral = js.native
  def apply(quasis: js.Array[TemplateElement]): TemplateLiteral = js.native
  def apply(quasis: js.Array[TemplateElement], expressions: js.Array[Expression]): TemplateLiteral = js.native
}

