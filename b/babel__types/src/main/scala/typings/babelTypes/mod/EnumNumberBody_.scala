package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumNumberBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait EnumNumberBody_
  extends EnumBody
     with BaseNode {
  var explicit: Boolean
  var members: js.Array[EnumNumberMember_]
  @JSName("type")
  var type_EnumNumberBody_ : EnumNumberBody
}

object EnumNumberBody_ {
  @scala.inline
  def apply(
    explicit: Boolean,
    members: js.Array[EnumNumberMember_],
    `type`: EnumNumberBody,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumNumberBody_]
  }
}

