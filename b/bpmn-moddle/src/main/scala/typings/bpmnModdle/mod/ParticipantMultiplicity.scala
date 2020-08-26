package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticipantMultiplicity extends BaseElement {
  var maximum: Double = js.native
  var minimum: Double = js.native
}

object ParticipantMultiplicity {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String, maximum: Double, minimum: Double): ParticipantMultiplicity = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantMultiplicity]
  }
  @scala.inline
  implicit class ParticipantMultiplicityOps[Self <: ParticipantMultiplicity] (val x: Self) extends AnyVal {
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
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
  }
  
}

