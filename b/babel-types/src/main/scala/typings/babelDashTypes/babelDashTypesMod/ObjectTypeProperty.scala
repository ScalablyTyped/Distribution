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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeProperty]
  }
}

@JSImport("babel-types", "objectTypeProperty")
@js.native
object objectTypeProperty extends js.Object {
  def apply(): ObjectTypeProperty = js.native
  def apply(key: Expression): ObjectTypeProperty = js.native
  def apply(key: Expression, value: FlowTypeAnnotation): ObjectTypeProperty = js.native
}

