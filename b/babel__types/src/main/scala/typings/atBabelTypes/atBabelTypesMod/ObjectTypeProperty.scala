package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.get
import typings.atBabelTypes.atBabelTypesStrings.init
import typings.atBabelTypes.atBabelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ObjectTypeProperty
  extends Flow
     with BaseNode
     with UserWhitespacable {
  var key: Identifier | StringLiteral
  var kind: init | get | set | Null
  var optional: Boolean | Null
  var proto: Boolean | Null
  var static: Boolean | Null
  @JSName("type")
  var type_ObjectTypeProperty: typings.atBabelTypes.atBabelTypesStrings.ObjectTypeProperty
  var value: FlowType
  var variance: Variance | Null
}

object ObjectTypeProperty {
  @scala.inline
  def apply(
    key: Identifier | StringLiteral,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ObjectTypeProperty,
    value: FlowType,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    kind: init | get | set = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    proto: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null,
    static: js.UndefOr[Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    variance: Variance = null
  ): ObjectTypeProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(proto)) __obj.updateDynamic("proto")(proto.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeProperty]
  }
}

@JSImport("@babel/types", "objectTypeProperty")
@js.native
object objectTypeProperty extends js.Object {
  def apply(key: Identifier | StringLiteral, value: FlowType): ObjectTypeProperty = js.native
  def apply(key: Identifier | StringLiteral, value: FlowType, variance: Variance): ObjectTypeProperty = js.native
  def apply(key: Identifier | StringLiteral, value: FlowType, variance: Variance, kind: init | get | set): ObjectTypeProperty = js.native
  def apply(
    key: Identifier | StringLiteral,
    value: FlowType,
    variance: Variance,
    kind: init | get | set,
    optional: Boolean
  ): ObjectTypeProperty = js.native
  def apply(
    key: Identifier | StringLiteral,
    value: FlowType,
    variance: Variance,
    kind: init | get | set,
    optional: Boolean,
    proto: Boolean
  ): ObjectTypeProperty = js.native
  def apply(
    key: Identifier | StringLiteral,
    value: FlowType,
    variance: Variance,
    kind: init | get | set,
    optional: Boolean,
    proto: Boolean,
    _static: Boolean
  ): ObjectTypeProperty = js.native
}

