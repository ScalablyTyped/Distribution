package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeIndexer
  extends Node
     with Flow
     with UserWhitespacable {
  var id: Expression
  var key: FlowTypeAnnotation
  @JSName("type")
  var type_ObjectTypeIndexer: typings.babelDashTypes.babelDashTypesStrings.ObjectTypeIndexer
  var value: FlowTypeAnnotation
}

object ObjectTypeIndexer {
  @scala.inline
  def apply(
    end: Double,
    id: Expression,
    key: FlowTypeAnnotation,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ObjectTypeIndexer,
    value: FlowTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectTypeIndexer = {
    val __obj = js.Dynamic.literal(end = end, id = id, key = key, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectTypeIndexer]
  }
}

