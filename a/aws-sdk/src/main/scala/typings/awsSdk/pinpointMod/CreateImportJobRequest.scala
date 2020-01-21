package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImportJobRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var ImportJobRequest: typings.awsSdk.pinpointMod.ImportJobRequest = js.native
}

object CreateImportJobRequest {
  @scala.inline
  def apply(ApplicationId: string, ImportJobRequest: ImportJobRequest): CreateImportJobRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ImportJobRequest = ImportJobRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateImportJobRequest]
  }
}

