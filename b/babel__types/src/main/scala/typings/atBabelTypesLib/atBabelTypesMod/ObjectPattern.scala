package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ObjectPattern
  extends LVal
     with BaseNode
     with Pattern
     with PatternLike {
  var decorators: js.Array[Decorator] | scala.Null
  var properties: js.Array[RestElement | ObjectProperty]
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  @JSName("type")
  var type_ObjectPattern: atBabelTypesLib.atBabelTypesLibStrings.ObjectPattern
}

object ObjectPattern {
  @scala.inline
  def apply(
    properties: js.Array[RestElement | ObjectProperty],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ObjectPattern,
    decorators: js.Array[Decorator] = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern]
  }
}

