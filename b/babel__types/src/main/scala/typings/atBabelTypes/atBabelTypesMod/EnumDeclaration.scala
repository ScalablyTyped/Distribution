package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumDeclaration
  extends BaseNode
     with _Node {
  var body: EnumBooleanBody | EnumNumberBody | EnumStringBody | EnumSymbolBody
  var id: Identifier
  @JSName("type")
  var type_EnumDeclaration: typings.atBabelTypes.atBabelTypesStrings.EnumDeclaration
}

object EnumDeclaration {
  @scala.inline
  def apply(
    body: EnumBooleanBody | EnumNumberBody | EnumStringBody | EnumSymbolBody,
    id: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.EnumDeclaration,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): EnumDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumDeclaration]
  }
}

@JSImport("@babel/types", "enumDeclaration")
@js.native
object enumDeclaration extends js.Object {
  def apply(id: Identifier, body: EnumBooleanBody): EnumDeclaration = js.native
  def apply(id: Identifier, body: EnumNumberBody): EnumDeclaration = js.native
  def apply(id: Identifier, body: EnumStringBody): EnumDeclaration = js.native
  def apply(id: Identifier, body: EnumSymbolBody): EnumDeclaration = js.native
}

