package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParameter extends Node {
  var bound: TypeAnnotation | scala.Null
  var default: Flow | scala.Null
  var name: java.lang.String | scala.Null
  @JSName("type")
  var type_TypeParameter: babelDashTypesLib.babelDashTypesLibStrings.TypeParameterDeclaration
}

object TypeParameter {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TypeParameterDeclaration,
    bound: TypeAnnotation = null,
    default: Flow = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    name: java.lang.String = null,
    trailingComments: js.Array[Comment] = null
  ): TypeParameter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    if (bound != null) __obj.updateDynamic("bound")(bound)
    if (default != null) __obj.updateDynamic("default")(default)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (name != null) __obj.updateDynamic("name")(name)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TypeParameter]
  }
}

