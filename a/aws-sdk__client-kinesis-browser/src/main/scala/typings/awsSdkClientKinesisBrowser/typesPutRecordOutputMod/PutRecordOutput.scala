package typings.awsSdkClientKinesisBrowser.typesPutRecordOutputMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The encryption type to use on the record. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records in the stream.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.</p> </li> </ul>
    */
  var EncryptionType: js.UndefOr[NONE | KMS | String] = js.native
  /**
    * <p>The sequence number identifier that was assigned to the put data record. The sequence number for the record is unique across all records in the stream. A sequence number is the identifier associated with every record put into the stream.</p>
    */
  var SequenceNumber: String = js.native
  /**
    * <p>The shard ID of the shard where the data record was placed.</p>
    */
  var ShardId: String = js.native
}

object PutRecordOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SequenceNumber: String, ShardId: String): PutRecordOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordOutput]
  }
  @scala.inline
  implicit class PutRecordOutputOps[Self <: PutRecordOutput] (val x: Self) extends AnyVal {
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
    def setSequenceNumber(value: String): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setShardId(value: String): Self = this.set("ShardId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptionType(value: NONE | KMS | String): Self = this.set("EncryptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionType: Self = this.set("EncryptionType", js.undefined)
  }
  
}

