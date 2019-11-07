package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait EnumSymbolBody
  extends EnumBody
     with BaseNode {
  var members: js.Array[EnumDefaultedMember]
  @JSName("type")
  var type_EnumSymbolBody: typings.atBabelTypes.atBabelTypesStrings.EnumSymbolBody
}

object EnumSymbolBody {
  @scala.inline
  def apply(
    members: js.Array[EnumDefaultedMember],
    `type`: typings.atBabelTypes.atBabelTypesStrings.EnumSymbolBody,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): EnumSymbolBody = {
    val __obj = js.Dynamic.literal(members = members)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[EnumSymbolBody]
  }
}

@JSImport("@babel/types", "enumSymbolBody")
@js.native
object enumSymbolBody extends js.Object {
  def apply(members: js.Array[EnumDefaultedMember]): EnumSymbolBody = js.native
}

