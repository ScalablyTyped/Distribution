package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassProperty_
  extends Node
     with Flow
     with Property {
  var decorators: js.UndefOr[js.Array[Decorator_]] = js.undefined
  var key: Identifier_
  var typeAnnotation: js.UndefOr[TypeAnnotation_] = js.undefined
  @JSName("type")
  var type_ClassProperty_ : ClassProperty
  var value: Expression
}

object ClassProperty_ {
  @scala.inline
  def apply(
    end: Double,
    key: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ClassProperty,
    value: Expression,
    decorators: js.Array[Decorator_] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation_ = null
  ): ClassProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassProperty_]
  }
}

