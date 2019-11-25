package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullLiteralTypeAnnotation extends Node {
  @JSName("type")
  var type_NullLiteralTypeAnnotation: typings.babelDashTypes.babelDashTypesStrings.NullLiteralTypeAnnotation
}

object NullLiteralTypeAnnotation {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.NullLiteralTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): NullLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteralTypeAnnotation]
  }
}

@JSImport("babel-types", "nullLiteralTypeAnnotation")
@js.native
object nullLiteralTypeAnnotation extends js.Object {
  def apply(): NullLiteralTypeAnnotation = js.native
}

