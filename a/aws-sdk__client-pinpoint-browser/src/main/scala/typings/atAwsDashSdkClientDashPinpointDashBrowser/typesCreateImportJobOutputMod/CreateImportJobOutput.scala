package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesCreateImportJobOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreImportJobResponseMod._UnmarshalledImportJobResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImportJobOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Import job response.
    */
  var ImportJobResponse: _UnmarshalledImportJobResponse
}

object CreateImportJobOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ImportJobResponse: _UnmarshalledImportJobResponse): CreateImportJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateImportJobOutput]
  }
}

