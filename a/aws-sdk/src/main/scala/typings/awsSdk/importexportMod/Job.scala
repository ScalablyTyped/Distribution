package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  var CreationDate: js.UndefOr[typings.awsSdk.importexportMod.CreationDate] = js.native
  var IsCanceled: js.UndefOr[typings.awsSdk.importexportMod.IsCanceled] = js.native
  var JobId: js.UndefOr[typings.awsSdk.importexportMod.JobId] = js.native
  var JobType: js.UndefOr[typings.awsSdk.importexportMod.JobType] = js.native
}

object Job {
  @scala.inline
  def apply(
    CreationDate: CreationDate = null,
    IsCanceled: js.UndefOr[IsCanceled] = js.undefined,
    JobId: JobId = null,
    JobType: JobType = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(IsCanceled)) __obj.updateDynamic("IsCanceled")(IsCanceled.get.asInstanceOf[js.Any])
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

