package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait RestElement
  extends LVal
     with BaseNode
     with PatternLike {
  var argument: LVal
  var decorators: js.Array[Decorator] | Null
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | Null
  @JSName("type")
  var type_RestElement: typings.atBabelTypes.atBabelTypesStrings.RestElement
}

object RestElement {
  @scala.inline
  def apply(
    argument: LVal,
    `type`: typings.atBabelTypes.atBabelTypesStrings.RestElement,
    decorators: js.Array[Decorator] = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop = null
  ): RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestElement]
  }
}

@JSImport("@babel/types", "restElement")
@js.native
object restElement extends js.Object {
  def apply(argument: LVal): RestElement = js.native
  def apply(argument: LVal, decorators: js.Array[Decorator]): RestElement = js.native
  def apply(argument: LVal, decorators: js.Array[Decorator], typeAnnotation: Noop): RestElement = js.native
  def apply(argument: LVal, decorators: js.Array[Decorator], typeAnnotation: TSTypeAnnotation): RestElement = js.native
  def apply(argument: LVal, decorators: js.Array[Decorator], typeAnnotation: TypeAnnotation): RestElement = js.native
  def apply(argument: LVal, decorators: Null, typeAnnotation: Noop): RestElement = js.native
  def apply(argument: LVal, decorators: Null, typeAnnotation: TSTypeAnnotation): RestElement = js.native
  def apply(argument: LVal, decorators: Null, typeAnnotation: TypeAnnotation): RestElement = js.native
}

