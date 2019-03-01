package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseNode extends js.Object {
  var end: scala.Double | scala.Null
  var innerComments: js.Array[Comment] | scala.Null
  var leadingComments: js.Array[Comment] | scala.Null
  var loc: SourceLocation | scala.Null
  var start: scala.Double | scala.Null
  var trailingComments: js.Array[Comment] | scala.Null
  var `type`: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 221 */ js.Any
  ]
}

object BaseNode {
  @scala.inline
  def apply(
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 221 */ js.Any = null
  ): BaseNode = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BaseNode]
  }
}

