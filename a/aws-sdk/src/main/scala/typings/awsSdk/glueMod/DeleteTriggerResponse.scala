package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTriggerResponse extends js.Object {
  /**
    * The name of the trigger that was deleted.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object DeleteTriggerResponse {
  @scala.inline
  def apply(): DeleteTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTriggerResponse]
  }
  @scala.inline
  implicit class DeleteTriggerResponseOps[Self <: DeleteTriggerResponse] (val x: Self) extends AnyVal {
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

