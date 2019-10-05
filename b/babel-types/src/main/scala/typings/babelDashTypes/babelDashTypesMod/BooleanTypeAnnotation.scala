package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanTypeAnnotation
  extends Node
     with Flow
     with FlowBaseAnnotation
     with FlowTypeAnnotation {
  @JSName("type")
  var type_BooleanTypeAnnotation: typings.babelDashTypes.babelDashTypesStrings.BooleanTypeAnnotation
}

object BooleanTypeAnnotation {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.BooleanTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BooleanTypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BooleanTypeAnnotation]
  }
}

@JSImport("babel-types", "booleanTypeAnnotation")
@js.native
object booleanTypeAnnotation extends js.Object {
  def apply(): BooleanTypeAnnotation = js.native
}

