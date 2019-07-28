package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQualifiedName
  extends Node
     with TSEntityName {
  var left: TSEntityName
  var right: Identifier
  @JSName("type")
  var type_TSQualifiedName: typings.babelDashTypes.babelDashTypesStrings.TSQualifiedName
}

object TSQualifiedName {
  @scala.inline
  def apply(
    end: Double,
    left: TSEntityName,
    loc: SourceLocation,
    right: Identifier,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSQualifiedName,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSQualifiedName = {
    val __obj = js.Dynamic.literal(end = end, left = left, loc = loc, right = right, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSQualifiedName]
  }
}

