package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveLiteral extends Node {
  @JSName("type")
  var type_DirectiveLiteral: typings.babelDashTypes.babelDashTypesStrings.DirectiveLiteral
  var value: String
}

object DirectiveLiteral {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.DirectiveLiteral,
    value: String,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DirectiveLiteral = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[DirectiveLiteral]
  }
}

@JSImport("babel-types", "directiveLiteral")
@js.native
object directiveLiteral extends js.Object {
  def apply(): DirectiveLiteral = js.native
  def apply(value: String): DirectiveLiteral = js.native
}

