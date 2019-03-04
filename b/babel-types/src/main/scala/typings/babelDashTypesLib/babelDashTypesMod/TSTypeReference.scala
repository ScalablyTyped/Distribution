package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeReference
  extends Node
     with TSType {
  var typeName: TSEntityName
  var typeParameters: TypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_TSTypeReference: babelDashTypesLib.babelDashTypesLibStrings.TSTypeReference
}

object TSTypeReference {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSTypeReference,
    typeName: TSEntityName,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation = null
  ): TSTypeReference = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, typeName = typeName)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSTypeReference]
  }
}

