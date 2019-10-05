package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decorator extends Node {
  var expression: Expression
  @JSName("type")
  var type_Decorator: typings.babelDashTypes.babelDashTypesStrings.Decorator
}

object Decorator {
  @scala.inline
  def apply(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.Decorator,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): Decorator = {
    val __obj = js.Dynamic.literal(end = end, expression = expression, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Decorator]
  }
}

@JSImport("babel-types", "decorator")
@js.native
object decorator extends js.Object {
  def apply(): Decorator = js.native
  def apply(expression: Expression): Decorator = js.native
}

