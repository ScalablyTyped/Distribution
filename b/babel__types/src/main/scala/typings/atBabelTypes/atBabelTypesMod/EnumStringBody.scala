package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait EnumStringBody
  extends EnumBody
     with BaseNode {
  var explicit: Boolean | Null
  var members: js.Array[EnumStringMember | EnumDefaultedMember]
  @JSName("type")
  var type_EnumStringBody: typings.atBabelTypes.atBabelTypesStrings.EnumStringBody
}

object EnumStringBody {
  @scala.inline
  def apply(
    members: js.Array[EnumStringMember | EnumDefaultedMember],
    `type`: typings.atBabelTypes.atBabelTypesStrings.EnumStringBody,
    end: Int | Double = null,
    explicit: js.UndefOr[Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): EnumStringBody = {
    val __obj = js.Dynamic.literal(members = members)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(explicit)) __obj.updateDynamic("explicit")(explicit)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[EnumStringBody]
  }
}

@JSImport("@babel/types", "enumStringBody")
@js.native
object enumStringBody extends js.Object {
  def apply(members: js.Array[EnumStringMember | EnumDefaultedMember]): EnumStringBody = js.native
  def apply(members: js.Array[EnumStringMember | EnumDefaultedMember], explicit: Boolean): EnumStringBody = js.native
}

