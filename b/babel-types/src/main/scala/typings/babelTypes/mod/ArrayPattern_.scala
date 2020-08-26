package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ArrayPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayPattern_
  extends Node
     with LVal
     with Pattern {
  var elements: js.Array[Expression] = js.native
  var typeAnnotation: js.UndefOr[TypeAnnotation_] = js.native
  @JSName("type")
  var type_ArrayPattern_ : ArrayPattern = js.native
}

object ArrayPattern_ {
  @scala.inline
  def apply(
    elements: js.Array[Expression],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ArrayPattern
  ): ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayPattern_]
  }
  @scala.inline
  implicit class ArrayPattern_Ops[Self <: ArrayPattern_] (val x: Self) extends AnyVal {
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
    def setElementsVarargs(value: Expression*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[Expression]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ArrayPattern): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAnnotation: Self = this.set("typeAnnotation", js.undefined)
  }
  
}

