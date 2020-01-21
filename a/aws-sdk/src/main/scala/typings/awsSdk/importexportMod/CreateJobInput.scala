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
  def apply(
    JobType: JobType,
    Manifest: Manifest,
    ValidateOnly: ValidateOnly,
    APIVersion: APIVersion_ = null,
    ManifestAddendum: ManifestAddendum = null
  ): CreateJobInput = {
    val __obj = js.Dynamic.literal(JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion.asInstanceOf[js.Any])
    if (ManifestAddendum != null) __obj.updateDynamic("ManifestAddendum")(ManifestAddendum.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobInput]
  }
}

