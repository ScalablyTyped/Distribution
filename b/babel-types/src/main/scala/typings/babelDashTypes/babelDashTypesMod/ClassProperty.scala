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
    val __obj = js.Dynamic.literal(end = end, key = key, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[ClassProperty]
  }
}

