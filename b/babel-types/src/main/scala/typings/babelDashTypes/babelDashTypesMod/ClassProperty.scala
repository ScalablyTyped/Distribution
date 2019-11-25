package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassProperty
  extends Node
     with Flow
     with Property {
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var key: Identifier
  var typeAnnotation: js.UndefOr[TypeAnnotation] = js.undefined
  @JSName("type")
  var type_ClassProperty: typings.babelDashTypes.babelDashTypesStrings.ClassProperty
  var value: Expression
}

object ClassProperty {
  @scala.inline
  def apply(
    end: Double,
    key: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ClassProperty,
    value: Expression,
    decorators: js.Array[Decorator] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation = null
  ): ClassProperty = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassProperty]
  }
}

@JSImport("babel-types", "classProperty")
@js.native
object classProperty extends js.Object {
  def apply(): ClassProperty = js.native
  def apply(key: Identifier): ClassProperty = js.native
  def apply(key: Identifier, value: Expression): ClassProperty = js.native
  def apply(key: Identifier, value: Expression, typeAnnotation: TypeAnnotation): ClassProperty = js.native
  def apply(
    key: Identifier,
    value: Expression,
    typeAnnotation: TypeAnnotation,
    decorators: js.Array[Decorator]
  ): ClassProperty = js.native
}

