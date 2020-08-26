package typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextOutputMod

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateDataKeyWithoutPlaintextOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The encrypted data encryption key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
    */
  var CiphertextBlob: js.UndefOr[Uint8Array] = js.native
  /**
    * <p>The identifier of the CMK under which the data encryption key was generated and encrypted.</p>
    */
  var KeyId: js.UndefOr[String] = js.native
}

object GenerateDataKeyWithoutPlaintextOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GenerateDataKeyWithoutPlaintextOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateDataKeyWithoutPlaintextOutput]
  }
  @scala.inline
  implicit class GenerateDataKeyWithoutPlaintextOutputOps[Self <: GenerateDataKeyWithoutPlaintextOutput] (val x: Self) extends AnyVal {
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
    def setCiphertextBlob(value: Uint8Array): Self = this.set("CiphertextBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphertextBlob: Self = this.set("CiphertextBlob", js.undefined)
    @scala.inline
    def setKeyId(value: String): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
  }
  
}

