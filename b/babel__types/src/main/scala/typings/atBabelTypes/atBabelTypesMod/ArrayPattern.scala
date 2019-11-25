package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ArrayPattern
  extends LVal
     with BaseNode
     with Pattern
     with PatternLike {
  var decorators: js.Array[Decorator] | Null
  var elements: js.Array[PatternLike]
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | Null
  @JSName("type")
  var type_ArrayPattern: typings.atBabelTypes.atBabelTypesStrings.ArrayPattern
}

object ArrayPattern {
  @scala.inline
  def apply(
    elements: js.Array[PatternLike],
    `type`: typings.atBabelTypes.atBabelTypesStrings.ArrayPattern,
    decorators: js.Array[Decorator] = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop = null
  ): ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayPattern]
  }
}

@JSImport("@babel/types", "arrayPattern")
@js.native
object arrayPattern extends js.Object {
  def apply(elements: js.Array[PatternLike]): ArrayPattern = js.native
  def apply(elements: js.Array[PatternLike], decorators: js.Array[Decorator]): ArrayPattern = js.native
  def apply(elements: js.Array[PatternLike], decorators: js.Array[Decorator], typeAnnotation: Noop): ArrayPattern = js.native
  def apply(elements: js.Array[PatternLike], decorators: js.Array[Decorator], typeAnnotation: TSTypeAnnotation): ArrayPattern = js.native
  def apply(elements: js.Array[PatternLike], decorators: js.Array[Decorator], typeAnnotation: TypeAnnotation): ArrayPattern = js.native
  def apply(elements: js.Array[PatternLike], decorators: Null, typeAnnotation: Noop): ArrayPattern = js.native
  def apply(elements: js.Array[PatternLike], decorators: Null, typeAnnotation: TSTypeAnnotation): ArrayPattern = js.native
  def apply(elements: js.Array[PatternLike], decorators: Null, typeAnnotation: TypeAnnotation): ArrayPattern = js.native
}

