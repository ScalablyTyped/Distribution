package typings.awsSdkClientXrayNode.typesGetEncryptionConfigOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesEncryptionConfigMod.UnmarshalledEncryptionConfig
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEncryptionConfigOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The encryption configuration document.</p>
    */
  var EncryptionConfig: js.UndefOr[UnmarshalledEncryptionConfig] = js.native
}

object GetEncryptionConfigOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetEncryptionConfigOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEncryptionConfigOutput]
  }
  @scala.inline
  implicit class GetEncryptionConfigOutputOps[Self <: GetEncryptionConfigOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptionConfig(value: UnmarshalledEncryptionConfig): Self = this.set("EncryptionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfig: Self = this.set("EncryptionConfig", js.undefined)
  }
  
}

