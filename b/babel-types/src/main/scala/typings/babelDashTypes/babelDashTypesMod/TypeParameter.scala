package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParameter extends Node {
  var bound: TypeAnnotation | Null
  var default: Flow | Null
  var name: String | Null
  @JSName("type")
  var type_TypeParameter: typings.babelDashTypes.babelDashTypesStrings.TypeParameterDeclaration
}

object TypeParameter {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TypeParameterDeclaration,
    bound: TypeAnnotation = null,
    default: Flow = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    name: String = null,
    trailingComments: js.Array[Comment] = null
  ): TypeParameter = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bound != null) __obj.updateDynamic("bound")(bound.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameter]
  }
}

@JSImport("babel-types", "typeParameter")
@js.native
object typeParameter extends js.Object {
  def apply(): TypeParameter = js.native
  def apply(bound: TypeAnnotation): TypeParameter = js.native
  def apply(bound: TypeAnnotation, default_ : Flow): TypeParameter = js.native
}

