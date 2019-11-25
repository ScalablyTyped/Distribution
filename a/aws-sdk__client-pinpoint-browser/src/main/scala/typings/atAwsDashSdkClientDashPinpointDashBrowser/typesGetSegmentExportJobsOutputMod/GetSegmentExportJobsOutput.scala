package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentExportJobsOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobsResponseMod._UnmarshalledExportJobsResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSegmentExportJobsOutput extends OutputTypesUnion {
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

object GetSegmentExportJobsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ExportJobsResponse: _UnmarshalledExportJobsResponse): GetSegmentExportJobsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSegmentExportJobsOutput]
  }
}

