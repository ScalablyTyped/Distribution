package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSInterfaceDeclaration
  extends Node
     with Declaration
     with Statement {
  var body: TSInterfaceBody
  var declare: Boolean | Null
  var `extends`: js.Array[TSExpressionWithTypeArguments] | Null
  var id: Identifier
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_TSInterfaceDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSInterfaceDeclaration
}

object TSInterfaceDeclaration {
  @scala.inline
  def apply(
    body: TSInterfaceBody,
    end: Double,
    id: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSInterfaceDeclaration,
    declare: js.UndefOr[Boolean] = js.undefined,
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

