package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeProperty
  extends Node
     with Flow
     with UserWhitespacable {
  var key: Expression
  @JSName("type")
  var type_ObjectTypeProperty: babelDashTypesLib.babelDashTypesLibStrings.ObjectTypeProperty
  var value: FlowTypeAnnotation
}

object ObjectTypeProperty {
  @scala.inline
  def apply(
    end: scala.Double,
    key: Expression,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ObjectTypeProperty,
    value: FlowTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectTypeProperty = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("value")(value)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectTypeProperty]
  }
}

