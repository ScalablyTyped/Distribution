package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportJobResponse extends js.Object {
  var ExportJobResponse: typings.awsSdk.pinpointMod.ExportJobResponse = js.native
}

object GetExportJobResponse {
  @scala.inline
  def apply(ExportJobResponse: ExportJobResponse): GetExportJobResponse = {
    val __obj = js.Dynamic.literal(ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportJobResponse]
  }
}

