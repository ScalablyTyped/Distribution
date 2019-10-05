package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait AssignmentPattern
  extends LVal
     with BaseNode
     with Pattern
     with PatternLike {
  var decorators: js.Array[Decorator] | Null
  var left: Identifier | ObjectPattern | ArrayPattern | MemberExpression
  var right: Expression
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | Null
  @JSName("type")
  var type_AssignmentPattern: typings.atBabelTypes.atBabelTypesStrings.AssignmentPattern
}

object AssignmentPattern {
  @scala.inline
  def apply(
    left: Identifier | ObjectPattern | ArrayPattern | MemberExpression,
    right: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.AssignmentPattern,
    decorators: js.Array[Decorator] = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop = null
  ): AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentPattern]
  }
}

@JSImport("@babel/types", "assignmentPattern")
@js.native
object assignmentPattern extends js.Object {
  def apply(left: Identifier | ObjectPattern | ArrayPattern | MemberExpression, right: Expression): AssignmentPattern = js.native
  def apply(
    left: Identifier | ObjectPattern | ArrayPattern | MemberExpression,
    right: Expression,
    decorators: js.Array[Decorator]
  ): AssignmentPattern = js.native
  def apply(
    left: Identifier | ObjectPattern | ArrayPattern | MemberExpression,
    right: Expression,
    decorators: js.Array[Decorator],
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop
  ): AssignmentPattern = js.native
}

