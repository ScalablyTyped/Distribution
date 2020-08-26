package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopUserImportJobResponse extends js.Object {
  /**
    * The job object that represents the user import job.
    */
  var UserImportJob: js.UndefOr[UserImportJobType] = js.native
}

object StopUserImportJobResponse {
  @scala.inline
  def apply(): StopUserImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopUserImportJobResponse]
  }
  @scala.inline
  implicit class StopUserImportJobResponseOps[Self <: StopUserImportJobResponse] (val x: Self) extends AnyVal {
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
    def setUserImportJob(value: UserImportJobType): Self = this.set("UserImportJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserImportJob: Self = this.set("UserImportJob", js.undefined)
  }
  
}

