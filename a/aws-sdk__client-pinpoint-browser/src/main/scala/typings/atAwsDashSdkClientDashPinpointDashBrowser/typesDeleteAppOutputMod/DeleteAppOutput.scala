package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteAppOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationResponseMod._UnmarshalledApplicationResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAppOutput extends OutputTypesUnion {
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

object DeleteAppOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationResponse: _UnmarshalledApplicationResponse): DeleteAppOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAppOutput]
  }
}

