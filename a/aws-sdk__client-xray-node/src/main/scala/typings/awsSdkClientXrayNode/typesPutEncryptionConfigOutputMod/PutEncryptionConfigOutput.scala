package typings.awsSdkClientXrayNode.typesPutEncryptionConfigOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesEncryptionConfigMod.UnmarshalledEncryptionConfig
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEncryptionConfigOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The new encryption configuration.</p>
    */
  var EncryptionConfig: js.UndefOr[UnmarshalledEncryptionConfig] = js.undefined
}

object PutEncryptionConfigOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EncryptionConfig: UnmarshalledEncryptionConfig = null): PutEncryptionConfigOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEncryptionConfigOutput]
  }
}

