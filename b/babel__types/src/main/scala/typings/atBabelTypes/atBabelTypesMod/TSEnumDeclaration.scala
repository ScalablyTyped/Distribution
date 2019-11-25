package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSEnumDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var const: Boolean | Null
  var declare: Boolean | Null
  var id: Identifier
  var initializer: Expression | Null
  var members: js.Array[TSEnumMember]
  @JSName("type")
  var type_TSEnumDeclaration: typings.atBabelTypes.atBabelTypesStrings.TSEnumDeclaration
}

object TSEnumDeclaration {
  @scala.inline
  def apply(
    id: Identifier,
    members: js.Array[TSEnumMember],
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSEnumDeclaration,
    const: js.UndefOr[Boolean] = js.undefined,
    declare: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(const)) __obj.updateDynamic("const")(const.asInstanceOf[js.Any])
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEnumDeclaration]
  }
}

@JSImport("@babel/types", "tsEnumDeclaration")
@js.native
object tsEnumDeclaration extends js.Object {
  def apply(id: Identifier, members: js.Array[TSEnumMember]): TSEnumDeclaration = js.native
  def apply(id: Identifier, members: js.Array[TSEnumMember], _const: Boolean): TSEnumDeclaration = js.native
  def apply(id: Identifier, members: js.Array[TSEnumMember], _const: Boolean, declare: Boolean): TSEnumDeclaration = js.native
  def apply(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: Boolean,
    declare: Boolean,
    initializer: Expression
  ): TSEnumDeclaration = js.native
  def apply(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: Boolean,
    declare: Null,
    initializer: Expression
  ): TSEnumDeclaration = js.native
  def apply(id: Identifier, members: js.Array[TSEnumMember], _const: Null, declare: Boolean): TSEnumDeclaration = js.native
  def apply(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: Null,
    declare: Boolean,
    initializer: Expression
  ): TSEnumDeclaration = js.native
  def apply(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: Null,
    declare: Null,
    initializer: Expression
  ): TSEnumDeclaration = js.native
}

