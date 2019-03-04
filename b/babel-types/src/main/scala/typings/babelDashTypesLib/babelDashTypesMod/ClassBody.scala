package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBody extends Node {
  var body: js.Array[ClassMethod | ClassProperty]
  @JSName("type")
  var type_ClassBody: babelDashTypesLib.babelDashTypesLibStrings.ClassBody
}

object ClassBody {
  @scala.inline
  def apply(
    body: js.Array[ClassMethod | ClassProperty],
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ClassBody,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ClassBody = {
    val __obj = js.Dynamic.literal(body = body, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ClassBody]
  }
}

