package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclareTypeAlias
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier
  var right: FlowTypeAnnotation
  var typeParameters: TypeParameterDeclaration
  @JSName("type")
  var type_DeclareTypeAlias: babelDashTypesLib.babelDashTypesLibStrings.DeclareTypeAlias
}

object DeclareTypeAlias {
  @scala.inline
  def apply(
    end: scala.Double,
    id: Identifier,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.DeclareTypeAlias,
    typeParameters: TypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareTypeAlias = {
    val __obj = js.Dynamic.literal(end = end, id = id, loc = loc, right = right, start = start, typeParameters = typeParameters)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[DeclareTypeAlias]
  }
}

