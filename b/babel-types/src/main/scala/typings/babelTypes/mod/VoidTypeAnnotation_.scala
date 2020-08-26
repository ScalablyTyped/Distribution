package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.VoidTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoidTypeAnnotation_
  extends Node
     with Flow
     with FlowBaseAnnotation
     with FlowTypeAnnotation {
  @JSName("type")
  var type_VoidTypeAnnotation_ : VoidTypeAnnotation = js.native
}

object VoidTypeAnnotation_ {
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: VoidTypeAnnotation): VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoidTypeAnnotation_]
  }
  @scala.inline
  implicit class VoidTypeAnnotation_Ops[Self <: VoidTypeAnnotation_] (val x: Self) extends AnyVal {
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
    def setType(value: VoidTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

