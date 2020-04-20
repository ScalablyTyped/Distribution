package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportJobsResponse extends js.Object {
  var ExportJobsResponse: typings.awsSdk.pinpointMod.ExportJobsResponse = js.native
}

object GetExportJobsResponse {
  @scala.inline
  def apply(ExportJobsResponse: ExportJobsResponse): GetExportJobsResponse = {
    val __obj = js.Dynamic.literal(ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportJobsResponse]
  }
}

