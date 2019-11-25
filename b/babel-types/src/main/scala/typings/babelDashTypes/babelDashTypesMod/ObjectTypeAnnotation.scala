package typings.babelDashTypes.babelDashTypesMod

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
  var type_ObjectTypeAnnotation: typings.babelDashTypes.babelDashTypesStrings.ObjectTypeAnnotation
}

object ObjectTypeAnnotation {
  @scala.inline
  def apply(
    callProperties: js.Array[ObjectTypeCallProperty],
    end: Double,
    indexers: js.Array[ObjectTypeIndexer],
    loc: SourceLocation,
    properties: js.Array[ObjectTypeProperty],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ObjectTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeAnnotation]
  }
}

@JSImport("babel-types", "objectTypeAnnotation")
@js.native
object objectTypeAnnotation extends js.Object {
  def apply(): ObjectTypeAnnotation = js.native
  def apply(properties: js.Array[ObjectTypeProperty]): ObjectTypeAnnotation = js.native
  def apply(properties: js.Array[ObjectTypeProperty], indexers: js.Array[ObjectTypeIndexer]): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypeProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty]
  ): ObjectTypeAnnotation = js.native
}

