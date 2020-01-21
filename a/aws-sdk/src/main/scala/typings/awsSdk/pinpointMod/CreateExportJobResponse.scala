package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExportJobResponse extends js.Object {
  var ExportJobResponse: typings.awsSdk.pinpointMod.ExportJobResponse = js.native
}

object CreateExportJobResponse {
  @scala.inline
  def apply(ExportJobResponse: ExportJobResponse): CreateExportJobResponse = {
    val __obj = js.Dynamic.literal(ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateExportJobResponse]
  }
}

