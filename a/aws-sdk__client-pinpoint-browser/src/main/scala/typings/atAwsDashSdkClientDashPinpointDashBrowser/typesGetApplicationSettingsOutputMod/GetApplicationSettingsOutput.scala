package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApplicationSettingsOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationSettingsResourceMod._UnmarshalledApplicationSettingsResource
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationSettingsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Application settings.
    */
  var ApplicationSettingsResource: _UnmarshalledApplicationSettingsResource
}

object GetApplicationSettingsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationSettingsResource: _UnmarshalledApplicationSettingsResource): GetApplicationSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, ApplicationSettingsResource = ApplicationSettingsResource)
  
    __obj.asInstanceOf[GetApplicationSettingsOutput]
  }
}

