package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExportJobRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var ExportJobRequest: typings.awsSdk.pinpointMod.ExportJobRequest = js.native
}

object CreateExportJobRequest {
  @scala.inline
  def apply(ApplicationId: string, ExportJobRequest: ExportJobRequest): CreateExportJobRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ExportJobRequest = ExportJobRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExportJobRequest]
  }
}

