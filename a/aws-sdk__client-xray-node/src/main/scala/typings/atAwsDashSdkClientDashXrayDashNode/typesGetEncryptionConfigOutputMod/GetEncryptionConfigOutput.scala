package typings.atAwsDashSdkClientDashXrayDashNode.typesGetEncryptionConfigOutputMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreEncryptionConfigMod._UnmarshalledEncryptionConfig
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEncryptionConfigOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The encryption configuration document.</p>
    */
  var EncryptionConfig: js.UndefOr[_UnmarshalledEncryptionConfig] = js.undefined
}

object GetEncryptionConfigOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EncryptionConfig: _UnmarshalledEncryptionConfig = null): GetEncryptionConfigOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEncryptionConfigOutput]
  }
}

