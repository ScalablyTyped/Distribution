package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetImportJobOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreImportJobResponseMod._UnmarshalledImportJobResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImportJobOutput extends OutputTypesUnion {
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

object GetImportJobOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ImportJobResponse: _UnmarshalledImportJobResponse): GetImportJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, ImportJobResponse = ImportJobResponse)
  
    __obj.asInstanceOf[GetImportJobOutput]
  }
}

