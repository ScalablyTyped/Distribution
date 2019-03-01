package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareFunction
  extends Node
     with Declaration
     with Statement {
  var async: scala.Boolean
  var declare: scala.Boolean | scala.Null
  var generator: scala.Boolean
  var id: Identifier | scala.Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var typeParameters: TypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_TSDeclareFunction: babelDashTypesLib.babelDashTypesLibStrings.TSDeclareFunction
}

object TSDeclareFunction {
  @scala.inline
  def apply(
    async: scala.Boolean,
    end: scala.Double,
    generator: scala.Boolean,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSDeclareFunction,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    id: Identifier = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | Noop = null
  ): TSDeclareFunction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("generator")(generator)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("start")(start)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareFunction]
  }
}

