package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobInput extends js.Object {
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  var JobType: typings.awsSdk.importexportMod.JobType = js.native
  var Manifest: typings.awsSdk.importexportMod.Manifest = js.native
  var ManifestAddendum: js.UndefOr[typings.awsSdk.importexportMod.ManifestAddendum] = js.native
  var ValidateOnly: typings.awsSdk.importexportMod.ValidateOnly = js.native
}

object CreateJobInput {
  @scala.inline
  def apply(JobType: JobType, Manifest: Manifest, ValidateOnly: ValidateOnly): CreateJobInput = {
    val __obj = js.Dynamic.literal(JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobInput]
  }
  @scala.inline
  implicit class CreateJobInputOps[Self <: CreateJobInput] (val x: Self) extends AnyVal {
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
    def setJobType(value: JobType): Self = this.set("JobType", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifest(value: Manifest): Self = this.set("Manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateOnly(value: ValidateOnly): Self = this.set("ValidateOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setAPIVersion(value: APIVersion_): Self = this.set("APIVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAPIVersion: Self = this.set("APIVersion", js.undefined)
    @scala.inline
    def setManifestAddendum(value: ManifestAddendum): Self = this.set("ManifestAddendum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestAddendum: Self = this.set("ManifestAddendum", js.undefined)
  }
  
}

