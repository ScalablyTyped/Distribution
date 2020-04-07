package typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod.UnmarshalledApplicationSettingsResource
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var ApplicationSettingsResource: UnmarshalledApplicationSettingsResource
}

object GetApplicationSettingsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationSettingsResource: UnmarshalledApplicationSettingsResource): GetApplicationSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetApplicationSettingsOutput]
  }
}

