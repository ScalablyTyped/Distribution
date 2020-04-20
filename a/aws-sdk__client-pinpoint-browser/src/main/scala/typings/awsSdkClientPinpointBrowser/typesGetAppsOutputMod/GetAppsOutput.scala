package typings.awsSdkClientPinpointBrowser.typesGetAppsOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApplicationsResponseMod.UnmarshalledApplicationsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Get Applications Result.
    */
  var ApplicationsResponse: UnmarshalledApplicationsResponse
}

object GetAppsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationsResponse: UnmarshalledApplicationsResponse): GetAppsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppsOutput]
  }
}

