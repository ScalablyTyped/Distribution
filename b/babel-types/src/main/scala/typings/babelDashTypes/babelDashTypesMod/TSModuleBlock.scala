package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSModuleBlock extends Node {
  var body: js.Array[Statement]
  @JSName("type")
  var type_TSModuleBlock: typings.babelDashTypes.babelDashTypesStrings.TSModuleBlock
}

object TSModuleBlock {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSModuleBlock,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSModuleBlock = {
    val __obj = js.Dynamic.literal(body = body, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSModuleBlock]
  }
}

