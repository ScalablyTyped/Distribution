package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetAppOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationResponseMod._UnmarshalledApplicationResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppOutput extends OutputTypesUnion {
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

object GetAppOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationResponse: _UnmarshalledApplicationResponse): GetAppOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, ApplicationResponse = ApplicationResponse)
  
    __obj.asInstanceOf[GetAppOutput]
  }
}

