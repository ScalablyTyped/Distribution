package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ObjectTypeCallProperty
  extends Flow
     with BaseNode
     with UserWhitespacable {
  var static: Boolean | Null
  @JSName("type")
  var type_ObjectTypeCallProperty: typings.atBabelTypes.atBabelTypesStrings.ObjectTypeCallProperty
  var value: FlowType
}

object ObjectTypeCallProperty {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.ObjectTypeCallProperty,
    value: FlowType,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    static: js.UndefOr[Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null
  ): ObjectTypeCallProperty = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeCallProperty]
  }
}

@JSImport("@babel/types", "objectTypeCallProperty")
@js.native
object objectTypeCallProperty extends js.Object {
  def apply(value: FlowType): ObjectTypeCallProperty = js.native
  def apply(value: FlowType, _static: Boolean): ObjectTypeCallProperty = js.native
}

