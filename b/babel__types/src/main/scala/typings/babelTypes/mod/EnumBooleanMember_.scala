package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumBooleanMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait EnumBooleanMember_
  extends EnumMember
     with BaseNode {
  var id: Identifier_
  var init: BooleanLiteral_
  @JSName("type")
  var type_EnumBooleanMember_ : EnumBooleanMember
}

object EnumBooleanMember_ {
  @scala.inline
  def apply(
    id: Identifier_,
    init: BooleanLiteral_,
    `type`: EnumBooleanMember,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): EnumBooleanMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBooleanMember_]
  }
}

