package typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod

import typings.awsSdkClientPinpointBrowser.typesExportJobResourceMod.UnmarshalledExportJobResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledExportJobResponse extends ExportJobResponse {
  /**
    * The export job settings.
    */
  @JSName("Definition")
  var Definition_UnmarshalledExportJobResponse: js.UndefOr[UnmarshalledExportJobResource] = js.native
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  @JSName("Failures")
  var Failures_UnmarshalledExportJobResponse: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledExportJobResponse {
  @scala.inline
  def apply(): UnmarshalledExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledExportJobResponse]
  }
  @scala.inline
  implicit class UnmarshalledExportJobResponseOps[Self <: UnmarshalledExportJobResponse] (val x: Self) extends AnyVal {
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
    def setDefinition(value: UnmarshalledExportJobResource): Self = this.set("Definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("Definition", js.undefined)
    @scala.inline
    def setFailuresVarargs(value: String*): Self = this.set("Failures", js.Array(value :_*))
    @scala.inline
    def setFailures(value: js.Array[String]): Self = this.set("Failures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailures: Self = this.set("Failures", js.undefined)
  }
  
}

