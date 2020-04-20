package typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod.UnmarshalledApplicationSettingsResource
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApplicationSettingsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Application settings.
    */
  var ApplicationSettingsResource: UnmarshalledApplicationSettingsResource
}

object UpdateApplicationSettingsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationSettingsResource: UnmarshalledApplicationSettingsResource): UpdateApplicationSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsOutput]
  }
}

