package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSEnumDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSEnumDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  var const: Boolean | Null
  var declare: Boolean | Null
  var id: Identifier_
  var initializer: Expression | Null
  var members: js.Array[TSEnumMember_]
  @JSName("type")
  var type_TSEnumDeclaration_ : TSEnumDeclaration
}

object TSEnumDeclaration_ {
  @scala.inline
  def apply(
    id: Identifier_,
    members: js.Array[TSEnumMember_],
    `type`: TSEnumDeclaration,
    const: Boolean = null.asInstanceOf[Boolean],
    declare: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSEnumDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], const = const.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEnumDeclaration_]
  }
}

