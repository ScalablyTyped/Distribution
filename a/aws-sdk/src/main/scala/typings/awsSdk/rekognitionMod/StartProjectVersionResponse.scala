package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartProjectVersionResponse extends js.Object {
  /**
    * The current running status of the model. 
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.native
}

object StartProjectVersionResponse {
  @scala.inline
  def apply(): StartProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartProjectVersionResponse]
  }
  @scala.inline
  implicit class StartProjectVersionResponseOps[Self <: StartProjectVersionResponse] (val x: Self) extends AnyVal {
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
    def setStatus(value: ProjectVersionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

