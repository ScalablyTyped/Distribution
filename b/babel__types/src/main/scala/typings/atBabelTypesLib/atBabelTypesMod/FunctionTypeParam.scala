package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait FunctionTypeParam
  extends Flow
     with BaseNode {
  var name: Identifier | scala.Null
  var optional: scala.Boolean | scala.Null
  var typeAnnotation: FlowType
  @JSName("type")
  var type_FunctionTypeParam: atBabelTypesLib.atBabelTypesLibStrings.FunctionTypeParam
}

object FunctionTypeParam {
  @scala.inline
  def apply(
    `type`: atBabelTypesLib.atBabelTypesLibStrings.FunctionTypeParam,
    typeAnnotation: FlowType,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    name: Identifier = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): FunctionTypeParam = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[FunctionTypeParam]
  }
}

