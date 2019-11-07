package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait EnumBooleanMember
  extends EnumMember
     with BaseNode {
  var id: Identifier
  var init: BooleanLiteral | Null
  @JSName("type")
  var type_EnumBooleanMember: typings.atBabelTypes.atBabelTypesStrings.EnumBooleanMember
}

object EnumBooleanMember {
  @scala.inline
  def apply(
    id: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.EnumBooleanMember,
    end: Int | Double = null,
    init: BooleanLiteral = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): EnumBooleanMember = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[EnumBooleanMember]
  }
}

@JSImport("@babel/types", "enumBooleanMember")
@js.native
object enumBooleanMember extends js.Object {
  def apply(id: Identifier): EnumBooleanMember = js.native
  def apply(id: Identifier, init: BooleanLiteral): EnumBooleanMember = js.native
}

