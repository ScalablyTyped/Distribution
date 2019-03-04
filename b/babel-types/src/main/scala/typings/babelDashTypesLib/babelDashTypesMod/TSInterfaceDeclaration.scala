package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSInterfaceDeclaration
  extends Node
     with Declaration
     with Statement {
  var body: TSInterfaceBody
  var declare: scala.Boolean | scala.Null
  var `extends`: js.Array[TSExpressionWithTypeArguments] | scala.Null
  var id: Identifier
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSInterfaceDeclaration: babelDashTypesLib.babelDashTypesLibStrings.TSInterfaceDeclaration
}

object TSInterfaceDeclaration {
  @scala.inline
  def apply(
    body: TSInterfaceBody,
    end: scala.Double,
    id: Identifier,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSInterfaceDeclaration,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    `extends`: js.Array[TSExpressionWithTypeArguments] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body, end = end, id = id, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSInterfaceDeclaration]
  }
}

