package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeProperty
  extends Node
     with Flow
     with UserWhitespacable {
  var key: Expression
  @JSName("type")
  var type_ObjectTypeProperty: typings.babelDashTypes.babelDashTypesStrings.ObjectTypeProperty
  var value: FlowTypeAnnotation
}

object ObjectTypeProperty {
  @scala.inline
  def apply(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ObjectTypeProperty,
    value: FlowTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectTypeProperty = {
    val __obj = js.Dynamic.literal(end = end, key = key, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectTypeProperty]
  }
}

