package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetExportJobOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobResponseMod._UnmarshalledExportJobResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExportJobOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Export job response.
    */
  var ExportJobResponse: _UnmarshalledExportJobResponse
}

object GetExportJobOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ExportJobResponse: _UnmarshalledExportJobResponse): GetExportJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetExportJobOutput]
  }
}

