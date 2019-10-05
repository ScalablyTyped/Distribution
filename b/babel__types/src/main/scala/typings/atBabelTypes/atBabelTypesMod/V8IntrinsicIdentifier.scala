package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V8IntrinsicIdentifier
  extends BaseNode
     with _Node {
  var name: String
  @JSName("type")
  var type_V8IntrinsicIdentifier: typings.atBabelTypes.atBabelTypesStrings.V8IntrinsicIdentifier
}

object V8IntrinsicIdentifier {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.atBabelTypes.atBabelTypesStrings.V8IntrinsicIdentifier,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): V8IntrinsicIdentifier = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[V8IntrinsicIdentifier]
  }
}

@JSImport("@babel/types", "v8IntrinsicIdentifier")
@js.native
object v8IntrinsicIdentifier extends js.Object {
  def apply(name: String): V8IntrinsicIdentifier = js.native
}

