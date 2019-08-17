package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesCreateExportJobOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobResponseMod._UnmarshalledExportJobResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateExportJobOutput extends OutputTypesUnion {
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

object CreateExportJobOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ExportJobResponse: _UnmarshalledExportJobResponse): CreateExportJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, ExportJobResponse = ExportJobResponse)
  
    __obj.asInstanceOf[CreateExportJobOutput]
  }
}

