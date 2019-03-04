package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameterDeclaration extends Node {
  var params: js.Array[TSTypeParameter]
  @JSName("type")
  var type_TSTypeParameterDeclaration: babelDashTypesLib.babelDashTypesLibStrings.TSTypeParameterDeclaration
}

object TSTypeParameterDeclaration {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    params: js.Array[TSTypeParameter],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSTypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, params = params, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeParameterDeclaration]
  }
}

