package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionExpression
  extends Node
     with BlockParent
     with Expression
     with Function
     with FunctionParent
     with Pureish
     with Scopable {
  var async: scala.Boolean
  var body: BlockStatement
  var generator: scala.Boolean
  var id: Identifier
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_FunctionExpression: babelDashTypesLib.babelDashTypesLibStrings.FunctionExpression
}

object FunctionExpression {
  @scala.inline
  def apply(
    async: scala.Boolean,
    body: BlockStatement,
    end: scala.Double,
    generator: scala.Boolean,
    id: Identifier,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.FunctionExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): FunctionExpression = {
    val __obj = js.Dynamic.literal(async = async, body = body, end = end, generator = generator, id = id, loc = loc, params = params, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[FunctionExpression]
  }
}

