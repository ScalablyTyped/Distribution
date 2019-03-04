package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParameterDeclaration
  extends Node
     with Flow {
  var params: js.Array[Identifier]
  @JSName("type")
  var type_TypeParameterDeclaration: babelDashTypesLib.babelDashTypesLibStrings.TypeParameterDeclaration
}

object TypeParameterDeclaration {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    params: js.Array[Identifier],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, params = params, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TypeParameterDeclaration]
  }
}

