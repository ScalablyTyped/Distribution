package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  var params: js.Array[FunctionTypeParam]
  var rest: FunctionTypeParam
  var returnType: FlowTypeAnnotation
  var typeParameters: TypeParameterDeclaration
  @JSName("type")
  var type_FunctionTypeAnnotation: babelDashTypesLib.babelDashTypesLibStrings.FunctionTypeAnnotation
}

object FunctionTypeAnnotation {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    params: js.Array[FunctionTypeParam],
    rest: FunctionTypeParam,
    returnType: FlowTypeAnnotation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.FunctionTypeAnnotation,
    typeParameters: TypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): FunctionTypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, params = params, rest = rest, returnType = returnType, start = start, typeParameters = typeParameters)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[FunctionTypeAnnotation]
  }
}

