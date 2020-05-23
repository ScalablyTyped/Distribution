package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParameter_ extends Node {
  var bound: TypeAnnotation_ | Null
  var default: Flow | Null
  var name: String | Null
  @JSName("type")
  var type_TypeParameter_ : TypeParameterDeclaration
}

object TypeParameter_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: TypeParameterDeclaration,
    bound: TypeAnnotation_ = null,
    default: Flow = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    name: String = null,
    trailingComments: js.Array[Comment] = null
  ): TypeParameter_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], bound = bound.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameter_]
  }
}

