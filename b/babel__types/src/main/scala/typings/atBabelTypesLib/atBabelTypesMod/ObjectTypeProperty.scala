package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ObjectTypeProperty
  extends Flow
     with BaseNode
     with UserWhitespacable {
  var key: Identifier | StringLiteral
  var kind: atBabelTypesLib.atBabelTypesLibStrings.init | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | scala.Null
  var optional: scala.Boolean | scala.Null
  var proto: scala.Boolean | scala.Null
  var static: scala.Boolean | scala.Null
  @JSName("type")
  var type_ObjectTypeProperty: atBabelTypesLib.atBabelTypesLibStrings.ObjectTypeProperty
  var value: FlowType
  var variance: Variance | scala.Null
}

object ObjectTypeProperty {
  @scala.inline
  def apply(
    key: Identifier | StringLiteral,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ObjectTypeProperty,
    value: FlowType,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    kind: atBabelTypesLib.atBabelTypesLibStrings.init | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    proto: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null,
    static: js.UndefOr[scala.Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    variance: Variance = null
  ): ObjectTypeProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (!js.isUndefined(proto)) __obj.updateDynamic("proto")(proto)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (variance != null) __obj.updateDynamic("variance")(variance)
    __obj.asInstanceOf[ObjectTypeProperty]
  }
}

