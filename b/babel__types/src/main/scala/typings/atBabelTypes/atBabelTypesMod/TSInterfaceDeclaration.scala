package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSInterfaceDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var body: TSInterfaceBody
  var declare: Boolean | Null
  var `extends`: js.Array[TSExpressionWithTypeArguments] | Null
  var id: Identifier
  var typeParameters: TSTypeParameterDeclaration | Null
  @JSName("type")
  var type_TSInterfaceDeclaration: typings.atBabelTypes.atBabelTypesStrings.TSInterfaceDeclaration
}

object TSInterfaceDeclaration {
  @scala.inline
  def apply(
    body: TSInterfaceBody,
    id: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSInterfaceDeclaration,
    declare: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    `extends`: js.Array[TSExpressionWithTypeArguments] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body, id = id)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSInterfaceDeclaration]
  }
}

@JSImport("@babel/types", "tsInterfaceDeclaration")
@js.native
object tsInterfaceDeclaration extends js.Object {
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def apply(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], _extends: Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: Null,
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def apply(id: Identifier, typeParameters: Null, _extends: js.UndefOr[scala.Nothing], body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: Null,
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: Null,
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: Null,
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def apply(id: Identifier, typeParameters: Null, _extends: Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def apply(id: Identifier, typeParameters: Null, _extends: Null, body: TSInterfaceBody, declare: Boolean): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def apply(id: Identifier, typeParameters: TSTypeParameterDeclaration, _extends: Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: Null,
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
}

