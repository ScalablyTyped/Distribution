package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSInterfaceDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var body: TSInterfaceBody
  var declare: scala.Boolean | scala.Null
  var `extends`: js.Array[TSExpressionWithTypeArguments] | scala.Null
  var id: Identifier
  var typeParameters: TSTypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSInterfaceDeclaration: atBabelTypesLib.atBabelTypesLibStrings.TSInterfaceDeclaration
}

object TSInterfaceDeclaration {
  @scala.inline
  def apply(
    body: TSInterfaceBody,
    id: Identifier,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSInterfaceDeclaration,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    `extends`: js.Array[TSExpressionWithTypeArguments] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("id")(id)
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

