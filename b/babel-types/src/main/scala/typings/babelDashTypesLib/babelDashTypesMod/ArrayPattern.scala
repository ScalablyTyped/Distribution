package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayPattern
  extends Node
     with LVal
     with Pattern {
  var elements: js.Array[Expression]
  var typeAnnotation: js.UndefOr[TypeAnnotation] = js.undefined
  @JSName("type")
  var type_ArrayPattern: babelDashTypesLib.babelDashTypesLibStrings.ArrayPattern
}

object ArrayPattern {
  @scala.inline
  def apply(
    elements: js.Array[Expression],
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ArrayPattern,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation = null
  ): ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[ArrayPattern]
  }
}

