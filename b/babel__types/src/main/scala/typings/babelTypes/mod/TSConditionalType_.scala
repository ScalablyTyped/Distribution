package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSConditionalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSConditionalType_
  extends TSType
     with BaseNode {
  var checkType: TSType
  var extendsType: TSType
  var falseType: TSType
  var trueType: TSType
  @JSName("type")
  var type_TSConditionalType_ : TSConditionalType
}

object TSConditionalType_ {
  @scala.inline
  def apply(
    checkType: TSType,
    extendsType: TSType,
    falseType: TSType,
    trueType: TSType,
    `type`: TSConditionalType,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSConditionalType_ = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSConditionalType_]
  }
}

