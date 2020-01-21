package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBody_ extends Node {
  var body: js.Array[ClassMethod_ | ClassProperty_]
  @JSName("type")
  var type_ClassBody_ : ClassBody
}

object ClassBody_ {
  @scala.inline
  def apply(
    body: js.Array[ClassMethod_ | ClassProperty_],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ClassBody,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ClassBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBody_]
  }
}

