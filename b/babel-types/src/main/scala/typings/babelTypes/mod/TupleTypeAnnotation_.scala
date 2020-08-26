package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TupleTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TupleTypeAnnotation_
  extends Node
     with Flow
     with FlowTypeAnnotation {
  @JSName("type")
  var type_TupleTypeAnnotation_ : TupleTypeAnnotation = js.native
  var types: js.Array[FlowTypeAnnotation] = js.native
}

object TupleTypeAnnotation_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: TupleTypeAnnotation,
    types: js.Array[FlowTypeAnnotation]
  ): TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleTypeAnnotation_]
  }
  @scala.inline
  implicit class TupleTypeAnnotation_Ops[Self <: TupleTypeAnnotation_] (val x: Self) extends AnyVal {
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
    def setType(value: TupleTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: FlowTypeAnnotation*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[FlowTypeAnnotation]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

