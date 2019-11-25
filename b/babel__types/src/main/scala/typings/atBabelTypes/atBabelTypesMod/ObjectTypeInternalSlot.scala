package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ObjectTypeInternalSlot
  extends Flow
     with BaseNode
     with UserWhitespacable {
  var id: Identifier
  var method: Boolean
  var optional: Boolean
  var static: Boolean
  @JSName("type")
  var type_ObjectTypeInternalSlot: typings.atBabelTypes.atBabelTypesStrings.ObjectTypeInternalSlot
  var value: FlowType
}

object ObjectTypeInternalSlot {
  @scala.inline
  def apply(
    id: Identifier,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ObjectTypeInternalSlot,
    value: FlowType,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectTypeInternalSlot = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeInternalSlot]
  }
}

@JSImport("@babel/types", "objectTypeInternalSlot")
@js.native
object objectTypeInternalSlot extends js.Object {
  def apply(id: Identifier, value: FlowType, optional: Boolean, _static: Boolean, method: Boolean): ObjectTypeInternalSlot = js.native
}

