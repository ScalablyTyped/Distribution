package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoidTypeAnnotation
  extends Node
     with Flow
     with FlowBaseAnnotation
     with FlowTypeAnnotation {
  @JSName("type")
  var type_VoidTypeAnnotation: typings.babelDashTypes.babelDashTypesStrings.VoidTypeAnnotation
}

object VoidTypeAnnotation {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.VoidTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): VoidTypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[VoidTypeAnnotation]
  }
}

@JSImport("babel-types", "voidTypeAnnotation")
@js.native
object voidTypeAnnotation extends js.Object {
  def apply(): VoidTypeAnnotation = js.native
}

