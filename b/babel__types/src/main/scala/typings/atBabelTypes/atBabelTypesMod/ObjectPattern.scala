package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ObjectPattern
  extends LVal
     with BaseNode
     with Pattern
     with PatternLike {
  var decorators: js.Array[Decorator] | Null
  var properties: js.Array[RestElement | ObjectProperty]
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | Null
  @JSName("type")
  var type_ObjectPattern: typings.atBabelTypes.atBabelTypesStrings.ObjectPattern
}

object ObjectPattern {
  @scala.inline
  def apply(
    properties: js.Array[RestElement | ObjectProperty],
    `type`: typings.atBabelTypes.atBabelTypesStrings.ObjectPattern,
    decorators: js.Array[Decorator] = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern]
  }
}

@JSImport("@babel/types", "objectPattern")
@js.native
object objectPattern extends js.Object {
  def apply(properties: js.Array[RestElement | ObjectProperty]): ObjectPattern = js.native
  def apply(properties: js.Array[RestElement | ObjectProperty], decorators: js.Array[Decorator]): ObjectPattern = js.native
  def apply(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: js.Array[Decorator],
    typeAnnotation: Noop
  ): ObjectPattern = js.native
  def apply(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: js.Array[Decorator],
    typeAnnotation: TSTypeAnnotation
  ): ObjectPattern = js.native
  def apply(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: js.Array[Decorator],
    typeAnnotation: TypeAnnotation
  ): ObjectPattern = js.native
  def apply(properties: js.Array[RestElement | ObjectProperty], decorators: Null, typeAnnotation: Noop): ObjectPattern = js.native
  def apply(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: Null,
    typeAnnotation: TSTypeAnnotation
  ): ObjectPattern = js.native
  def apply(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: Null,
    typeAnnotation: TypeAnnotation
  ): ObjectPattern = js.native
}

