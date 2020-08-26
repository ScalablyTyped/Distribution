package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkteamResponse extends js.Object {
  /**
    * Returns true if the work team was successfully deleted; otherwise, returns false.
    */
  var Success: typings.awsSdk.sagemakerMod.Success = js.native
}

object DeleteWorkteamResponse {
  @scala.inline
  def apply(Success: Success): DeleteWorkteamResponse = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkteamResponse]
  }
  @scala.inline
  implicit class DeleteWorkteamResponseOps[Self <: DeleteWorkteamResponse] (val x: Self) extends AnyVal {
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
    def setSuccess(value: Success): Self = this.set("Success", value.asInstanceOf[js.Any])
  }
  
}

