package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AssignmentPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait AssignmentPattern_
  extends LVal
     with BaseNode
     with Pattern
     with PatternLike {
  var decorators: js.Array[Decorator_] | Null = js.native
  var left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ = js.native
  var right: Expression = js.native
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null = js.native
  @JSName("type")
  var type_AssignmentPattern_ : AssignmentPattern = js.native
}

object AssignmentPattern_ {
  @scala.inline
  def apply(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_,
    right: Expression,
    `type`: AssignmentPattern
  ): AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentPattern_]
  }
  @scala.inline
  implicit class AssignmentPattern_Ops[Self <: AssignmentPattern_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLeft(value: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Expression): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AssignmentPattern): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = this.set("decorators", js.Array(value :_*))
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorsNull: Self = this.set("decorators", null)
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotationNull: Self = this.set("typeAnnotation", null)
  }
  
}

