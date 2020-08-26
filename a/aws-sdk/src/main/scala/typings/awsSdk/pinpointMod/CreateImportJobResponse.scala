package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImportJobResponse extends js.Object {
  var ImportJobResponse: typings.awsSdk.pinpointMod.ImportJobResponse = js.native
}

object CreateImportJobResponse {
  @scala.inline
  def apply(ImportJobResponse: ImportJobResponse): CreateImportJobResponse = {
    val __obj = js.Dynamic.literal(ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImportJobResponse]
  }
  @scala.inline
  implicit class CreateImportJobResponseOps[Self <: CreateImportJobResponse] (val x: Self) extends AnyVal {
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
    def setImportJobResponse(value: ImportJobResponse): Self = this.set("ImportJobResponse", value.asInstanceOf[js.Any])
  }
  
}

