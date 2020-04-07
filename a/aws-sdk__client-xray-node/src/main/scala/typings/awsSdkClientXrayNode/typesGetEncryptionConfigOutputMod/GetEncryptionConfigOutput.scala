package typings.awsSdkClientXrayNode.typesGetEncryptionConfigOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesEncryptionConfigMod.UnmarshalledEncryptionConfig
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var EncryptionConfig: js.UndefOr[UnmarshalledEncryptionConfig] = js.undefined
}

object GetEncryptionConfigOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EncryptionConfig: UnmarshalledEncryptionConfig = null): GetEncryptionConfigOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEncryptionConfigOutput]
  }
}

