package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBody extends Node {
  var body: js.Array[ClassMethod | ClassProperty]
  @JSName("type")
  var type_ClassBody: typings.babelDashTypes.babelDashTypesStrings.ClassBody
}

object ClassBody {
  @scala.inline
  def apply(
    body: js.Array[ClassMethod | ClassProperty],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ClassBody,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBody]
  }
}

@JSImport("babel-types", "classBody")
@js.native
object classBody extends js.Object {
  def apply(): ClassBody = js.native
  def apply(body: js.Array[ClassMethod | ClassProperty]): ClassBody = js.native
}

