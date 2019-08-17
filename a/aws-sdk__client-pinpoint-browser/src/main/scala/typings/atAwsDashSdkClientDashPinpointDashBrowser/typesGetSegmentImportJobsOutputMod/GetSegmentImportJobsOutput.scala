package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentImportJobsOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreImportJobsResponseMod._UnmarshalledImportJobsResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSegmentImportJobsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Import job list.
    */
  var ImportJobsResponse: _UnmarshalledImportJobsResponse
}

object GetSegmentImportJobsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ImportJobsResponse: _UnmarshalledImportJobsResponse): GetSegmentImportJobsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, ImportJobsResponse = ImportJobsResponse)
  
    __obj.asInstanceOf[GetSegmentImportJobsOutput]
  }
}

