package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  var callProperties: js.Array[ObjectTypeCallProperty]
  var indexers: js.Array[ObjectTypeIndexer]
  var properties: js.Array[ObjectTypeProperty]
  @JSName("type")
  var type_ObjectTypeAnnotation: babelDashTypesLib.babelDashTypesLibStrings.ObjectTypeAnnotation
}

object ObjectTypeAnnotation {
  @scala.inline
  def apply(
    callProperties: js.Array[ObjectTypeCallProperty],
    end: scala.Double,
    indexers: js.Array[ObjectTypeIndexer],
    loc: SourceLocation,
    properties: js.Array[ObjectTypeProperty],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ObjectTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("callProperties")(callProperties)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("indexers")(indexers)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectTypeAnnotation]
  }
}

