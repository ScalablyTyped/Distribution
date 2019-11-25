package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSModuleDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var body: TSModuleBlock | TSModuleDeclaration
  var declare: Boolean | Null
  var global: Boolean | Null
  var id: Identifier | StringLiteral
  @JSName("type")
  var type_TSModuleDeclaration: typings.atBabelTypes.atBabelTypesStrings.TSModuleDeclaration
}

object TSModuleDeclaration {
  @scala.inline
  def apply(
    body: TSModuleBlock | TSModuleDeclaration,
    id: Identifier | StringLiteral,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSModuleDeclaration,
    declare: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    global: js.UndefOr[Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleDeclaration]
  }
}

@JSImport("@babel/types", "tsModuleDeclaration")
@js.native
object tsModuleDeclaration extends js.Object {
  def apply(id: Identifier, body: TSModuleBlock): TSModuleDeclaration = js.native
  def apply(id: Identifier, body: TSModuleBlock, declare: Boolean): TSModuleDeclaration = js.native
  def apply(id: Identifier, body: TSModuleBlock, declare: Boolean, global: Boolean): TSModuleDeclaration = js.native
  def apply(id: Identifier, body: TSModuleBlock, declare: Null, global: Boolean): TSModuleDeclaration = js.native
  def apply(id: Identifier, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  def apply(id: Identifier, body: TSModuleDeclaration, declare: Boolean): TSModuleDeclaration = js.native
  def apply(id: Identifier, body: TSModuleDeclaration, declare: Boolean, global: Boolean): TSModuleDeclaration = js.native
  def apply(id: Identifier, body: TSModuleDeclaration, declare: Null, global: Boolean): TSModuleDeclaration = js.native
  def apply(id: StringLiteral, body: TSModuleBlock): TSModuleDeclaration = js.native
  def apply(id: StringLiteral, body: TSModuleBlock, declare: Boolean): TSModuleDeclaration = js.native
  def apply(id: StringLiteral, body: TSModuleBlock, declare: Boolean, global: Boolean): TSModuleDeclaration = js.native
  def apply(id: StringLiteral, body: TSModuleBlock, declare: Null, global: Boolean): TSModuleDeclaration = js.native
  def apply(id: StringLiteral, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  def apply(id: StringLiteral, body: TSModuleDeclaration, declare: Boolean): TSModuleDeclaration = js.native
  def apply(id: StringLiteral, body: TSModuleDeclaration, declare: Boolean, global: Boolean): TSModuleDeclaration = js.native
  def apply(id: StringLiteral, body: TSModuleDeclaration, declare: Null, global: Boolean): TSModuleDeclaration = js.native
}

