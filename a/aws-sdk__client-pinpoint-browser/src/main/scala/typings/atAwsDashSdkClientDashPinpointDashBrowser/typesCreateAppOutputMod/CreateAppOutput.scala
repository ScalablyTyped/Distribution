package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesCreateAppOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationResponseMod._UnmarshalledApplicationResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAppOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Application Response.
    */
  var ApplicationResponse: _UnmarshalledApplicationResponse
}

object CreateAppOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationResponse: _UnmarshalledApplicationResponse): CreateAppOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAppOutput]
  }
}

