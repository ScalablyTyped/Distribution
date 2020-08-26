package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJobResponse extends js.Object {
  /**
    * The name of the job definition that was deleted.
    */
  var JobName: js.UndefOr[NameString] = js.native
}

object DeleteJobResponse {
  @scala.inline
  def apply(): DeleteJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteJobResponse]
  }
  @scala.inline
  implicit class DeleteJobResponseOps[Self <: DeleteJobResponse] (val x: Self) extends AnyVal {
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
    def setJobName(value: NameString): Self = this.set("JobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
  }
  
}

