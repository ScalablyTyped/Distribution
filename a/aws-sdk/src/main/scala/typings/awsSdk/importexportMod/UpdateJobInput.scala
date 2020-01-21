package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobInput extends js.Object {
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  var JobId: typings.awsSdk.importexportMod.JobId = js.native
  var JobType: typings.awsSdk.importexportMod.JobType = js.native
  var Manifest: typings.awsSdk.importexportMod.Manifest = js.native
  var ValidateOnly: typings.awsSdk.importexportMod.ValidateOnly = js.native
}

object UpdateJobInput {
  @scala.inline
  def apply(
    JobId: JobId,
    JobType: JobType,
    Manifest: Manifest,
    ValidateOnly: ValidateOnly,
    APIVersion: APIVersion_ = null
  ): UpdateJobInput = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobInput]
  }
}

