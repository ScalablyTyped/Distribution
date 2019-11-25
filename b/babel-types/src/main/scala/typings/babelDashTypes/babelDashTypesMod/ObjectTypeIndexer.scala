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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeIndexer]
  }
}

@JSImport("babel-types", "objectTypeIndexer")
@js.native
object objectTypeIndexer extends js.Object {
  def apply(): ObjectTypeIndexer = js.native
  def apply(id: Expression): ObjectTypeIndexer = js.native
  def apply(id: Expression, key: FlowTypeAnnotation): ObjectTypeIndexer = js.native
  def apply(id: Expression, key: FlowTypeAnnotation, value: FlowTypeAnnotation): ObjectTypeIndexer = js.native
}

