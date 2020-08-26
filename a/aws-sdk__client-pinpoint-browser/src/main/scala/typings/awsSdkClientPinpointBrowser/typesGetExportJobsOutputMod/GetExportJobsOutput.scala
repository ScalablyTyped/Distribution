package typings.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesExportJobsResponseMod.UnmarshalledExportJobsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportJobsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Export job list.
    */
  var ExportJobsResponse: UnmarshalledExportJobsResponse = js.native
}

object GetExportJobsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ExportJobsResponse: UnmarshalledExportJobsResponse): GetExportJobsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportJobsOutput]
  }
  @scala.inline
  implicit class GetExportJobsOutputOps[Self <: GetExportJobsOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportJobsResponse(value: UnmarshalledExportJobsResponse): Self = this.set("ExportJobsResponse", value.asInstanceOf[js.Any])
  }
  
}

