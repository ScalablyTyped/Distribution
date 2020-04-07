package typings.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var ExportJobResponse: UnmarshalledExportJobResponse
}

object GetExportJobOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ExportJobResponse: UnmarshalledExportJobResponse): GetExportJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetExportJobOutput]
  }
}

