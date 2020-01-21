package typings.awsSdkClientKinesisBrowser.typesRecordMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  /**
    * <p>The approximate time that the record was inserted into the stream.</p>
    */
  var ApproximateArrivalTimestamp: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
    */
  var Data: ArrayBuffer | ArrayBufferView | String
  /**
    * <p>The encryption type used on the record. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records in the stream.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.</p> </li> </ul>
    */
  var EncryptionType: js.UndefOr[NONE | KMS | String] = js.undefined
  /**
    * <p>Identifies which shard in the stream the data record is assigned to.</p>
    */
  var PartitionKey: String
  /**
    * <p>The unique identifier of the record within its shard.</p>
    */
  var SequenceNumber: String
}

object Record {
  @scala.inline
  def apply(
    Data: ArrayBuffer | ArrayBufferView | String,
    PartitionKey: String,
    SequenceNumber: String,
    ApproximateArrivalTimestamp: Date | String | Double = null,
    EncryptionType: NONE | KMS | String = null
  ): Record = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
    if (ApproximateArrivalTimestamp != null) __obj.updateDynamic("ApproximateArrivalTimestamp")(ApproximateArrivalTimestamp.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
}

