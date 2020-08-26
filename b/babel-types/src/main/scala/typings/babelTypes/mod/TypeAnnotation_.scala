package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAnnotation_
  extends Node
     with Flow
     with FlowTypeAnnotation {
  var typeAnnotation: FlowTypeAnnotation = js.native
  @JSName("type")
  var type_TypeAnnotation_ : TypeAnnotation = js.native
}

object TypeAnnotation_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: TypeAnnotation,
    typeAnnotation: FlowTypeAnnotation
  ): TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAnnotation_]
  }
  @scala.inline
  implicit class TypeAnnotation_Ops[Self <: TypeAnnotation_] (val x: Self) extends AnyVal {
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
    def setType(value: TypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotation(value: FlowTypeAnnotation): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
  }
  
}

