package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHapgRequest extends js.Object {
  /**
    * The label of the new high-availability partition group.
    */
  var Label: typings.awsSdk.cloudhsmMod.Label = js.native
}

object CreateHapgRequest {
  @scala.inline
  def apply(Label: Label): CreateHapgRequest = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHapgRequest]
  }
  @scala.inline
  implicit class CreateHapgRequestOps[Self <: CreateHapgRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabel(value: Label): Self = this.set("Label", value.asInstanceOf[js.Any])
  }
  
}

