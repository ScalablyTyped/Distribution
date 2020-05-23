package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumSymbolBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait EnumSymbolBody_
  extends EnumBody
     with BaseNode {
  var members: js.Array[EnumDefaultedMember_]
  @JSName("type")
  var type_EnumSymbolBody_ : EnumSymbolBody
}

object EnumSymbolBody_ {
  @scala.inline
  def apply(
    members: js.Array[EnumDefaultedMember_],
    `type`: EnumSymbolBody,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumSymbolBody_]
  }
}

