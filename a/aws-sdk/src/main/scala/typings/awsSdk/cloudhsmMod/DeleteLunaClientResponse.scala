package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLunaClientResponse extends js.Object {
  /**
    * The status of the action.
    */
  var Status: String = js.native
}

object DeleteLunaClientResponse {
  @scala.inline
  def apply(Status: String): DeleteLunaClientResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLunaClientResponse]
  }
  @scala.inline
  implicit class DeleteLunaClientResponseOps[Self <: DeleteLunaClientResponse] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

