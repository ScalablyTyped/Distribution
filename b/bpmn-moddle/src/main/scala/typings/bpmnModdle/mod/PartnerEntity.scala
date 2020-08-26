package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartnerEntity extends BaseElement {
  var name: String = js.native
  var participantRef: js.Array[Participant] = js.native
}

object PartnerEntity {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    name: String,
    participantRef: js.Array[Participant]
  ): PartnerEntity = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participantRef = participantRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnerEntity]
  }
  @scala.inline
  implicit class PartnerEntityOps[Self <: PartnerEntity] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParticipantRefVarargs(value: Participant*): Self = this.set("participantRef", js.Array(value :_*))
    @scala.inline
    def setParticipantRef(value: js.Array[Participant]): Self = this.set("participantRef", value.asInstanceOf[js.Any])
  }
  
}

