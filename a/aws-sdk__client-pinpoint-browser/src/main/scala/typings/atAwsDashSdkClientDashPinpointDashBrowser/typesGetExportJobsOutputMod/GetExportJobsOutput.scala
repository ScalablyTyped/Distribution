package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetExportJobsOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobsResponseMod._UnmarshalledExportJobsResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExportJobsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Export job list.
    */
  var ExportJobsResponse: _UnmarshalledExportJobsResponse
}

object GetExportJobsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ExportJobsResponse: _UnmarshalledExportJobsResponse): GetExportJobsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, ExportJobsResponse = ExportJobsResponse)
  
    __obj.asInstanceOf[GetExportJobsOutput]
  }
}

