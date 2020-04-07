package typings.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesImportJobsResponseMod.UnmarshalledImportJobsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImportJobsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Import job list.
    */
  var ImportJobsResponse: UnmarshalledImportJobsResponse
}

object GetImportJobsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ImportJobsResponse: UnmarshalledImportJobsResponse): GetImportJobsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetImportJobsOutput]
  }
}

