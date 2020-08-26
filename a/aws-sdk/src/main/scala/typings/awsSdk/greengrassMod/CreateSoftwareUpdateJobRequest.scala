package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSoftwareUpdateJobRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  var S3UrlSignerRole: typings.awsSdk.greengrassMod.S3UrlSignerRole = js.native
  var SoftwareToUpdate: typings.awsSdk.greengrassMod.SoftwareToUpdate = js.native
  var UpdateAgentLogLevel: js.UndefOr[typings.awsSdk.greengrassMod.UpdateAgentLogLevel] = js.native
  var UpdateTargets: typings.awsSdk.greengrassMod.UpdateTargets = js.native
  var UpdateTargetsArchitecture: typings.awsSdk.greengrassMod.UpdateTargetsArchitecture = js.native
  var UpdateTargetsOperatingSystem: typings.awsSdk.greengrassMod.UpdateTargetsOperatingSystem = js.native
}

object CreateSoftwareUpdateJobRequest {
  @scala.inline
  def apply(
    S3UrlSignerRole: S3UrlSignerRole,
    SoftwareToUpdate: SoftwareToUpdate,
    UpdateTargets: UpdateTargets,
    UpdateTargetsArchitecture: UpdateTargetsArchitecture,
    UpdateTargetsOperatingSystem: UpdateTargetsOperatingSystem
  ): CreateSoftwareUpdateJobRequest = {
    val __obj = js.Dynamic.literal(S3UrlSignerRole = S3UrlSignerRole.asInstanceOf[js.Any], SoftwareToUpdate = SoftwareToUpdate.asInstanceOf[js.Any], UpdateTargets = UpdateTargets.asInstanceOf[js.Any], UpdateTargetsArchitecture = UpdateTargetsArchitecture.asInstanceOf[js.Any], UpdateTargetsOperatingSystem = UpdateTargetsOperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSoftwareUpdateJobRequest]
  }
  @scala.inline
  implicit class CreateSoftwareUpdateJobRequestOps[Self <: CreateSoftwareUpdateJobRequest] (val x: Self) extends AnyVal {
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
    def setS3UrlSignerRole(value: S3UrlSignerRole): Self = this.set("S3UrlSignerRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoftwareToUpdate(value: SoftwareToUpdate): Self = this.set("SoftwareToUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateTargetsVarargs(value: string*): Self = this.set("UpdateTargets", js.Array(value :_*))
    @scala.inline
    def setUpdateTargets(value: UpdateTargets): Self = this.set("UpdateTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateTargetsArchitecture(value: UpdateTargetsArchitecture): Self = this.set("UpdateTargetsArchitecture", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateTargetsOperatingSystem(value: UpdateTargetsOperatingSystem): Self = this.set("UpdateTargetsOperatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmznClientToken(value: string): Self = this.set("AmznClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmznClientToken: Self = this.set("AmznClientToken", js.undefined)
    @scala.inline
    def setUpdateAgentLogLevel(value: UpdateAgentLogLevel): Self = this.set("UpdateAgentLogLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateAgentLogLevel: Self = this.set("UpdateAgentLogLevel", js.undefined)
  }
  
}

