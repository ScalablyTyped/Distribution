package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetAppsOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationsResponseMod._UnmarshalledApplicationsResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var ApplicationsResponse: _UnmarshalledApplicationsResponse
}

object GetAppsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationsResponse: _UnmarshalledApplicationsResponse): GetAppsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAppsOutput]
  }
}

