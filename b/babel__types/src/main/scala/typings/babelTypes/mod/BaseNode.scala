package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseNode extends js.Object {
  var end: Double | Null
  var innerComments: js.Array[Comment] | Null
  var leadingComments: js.Array[Comment] | Null
  var loc: SourceLocation | Null
  var start: Double | Null
  var trailingComments: js.Array[Comment] | Null
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.Node['type'] */ js.Any
}

object BaseNode {
  @scala.inline
  def apply(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.Node['type'] */ js.Any,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): BaseNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
}

