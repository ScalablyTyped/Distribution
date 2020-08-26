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
  @scala.inline
  implicit class CreateImportJobRequestOps[Self <: CreateImportJobRequest] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportJobRequest(value: ImportJobRequest): Self = this.set("ImportJobRequest", value.asInstanceOf[js.Any])
  }
  
}

