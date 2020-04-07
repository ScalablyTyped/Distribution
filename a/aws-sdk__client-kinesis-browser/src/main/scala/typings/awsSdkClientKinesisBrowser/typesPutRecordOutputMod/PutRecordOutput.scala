package typings.awsSdkClientKinesisBrowser.typesPutRecordOutputMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRecordOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The encryption type to use on the record. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records in the stream.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.</p> </li> </ul>
    */
  var EncryptionType: js.UndefOr[NONE | KMS | String] = js.undefined
  /**
    * <p>The sequence number identifier that was assigned to the put data record. The sequence number for the record is unique across all records in the stream. A sequence number is the identifier associated with every record put into the stream.</p>
    */
  var SequenceNumber: String
  /**
    * <p>The shard ID of the shard where the data record was placed.</p>
    */
  var ShardId: String
}

object PutRecordOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    SequenceNumber: String,
    ShardId: String,
    EncryptionType: NONE | KMS | String = null
  ): PutRecordOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordOutput]
  }
}

