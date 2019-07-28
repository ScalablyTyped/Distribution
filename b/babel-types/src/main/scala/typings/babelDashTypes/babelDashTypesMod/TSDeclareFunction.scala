package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareFunction
  extends Node
     with Declaration
     with Statement {
  var async: Boolean
  var declare: Boolean | Null
  var generator: Boolean
  var id: Identifier | Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | Null
  var typeParameters: TypeParameterDeclaration | Noop | Null
  @JSName("type")
  var type_TSDeclareFunction: typings.babelDashTypes.babelDashTypesStrings.TSDeclareFunction
}

object TSDeclareFunction {
  @scala.inline
  def apply(
    async: Boolean,
    end: Double,
    generator: Boolean,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSDeclareFunction,
    declare: js.UndefOr[Boolean] = js.undefined,
    id: Identifier = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | Noop = null
  ): TSDeclareFunction = {
    val __obj = js.Dynamic.literal(async = async, end = end, generator = generator, loc = loc, params = params, start = start)
    __obj.updateDynamic("type")(`type`)
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

