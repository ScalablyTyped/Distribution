package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartyJob extends js.Object {
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  /**
    * The identifier used to identify the job in AWS CodePipeline.
    */
  var jobId: js.UndefOr[JobId] = js.native
}

object ThirdPartyJob {
  @scala.inline
  def apply(): ThirdPartyJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyJob]
  }
  @scala.inline
  implicit class ThirdPartyJobOps[Self <: ThirdPartyJob] (val x: Self) extends AnyVal {
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
    def setClientId(value: ClientId): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
  }
  
}

