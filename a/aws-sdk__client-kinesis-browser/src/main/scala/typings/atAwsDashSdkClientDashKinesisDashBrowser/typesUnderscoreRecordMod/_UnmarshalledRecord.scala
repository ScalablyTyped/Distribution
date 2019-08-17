package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreRecordMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMS
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.NONE
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRecord extends _Record {
  /**
    * <p>The approximate time that the record was inserted into the stream.</p>
    */
  @JSName("ApproximateArrivalTimestamp")
  var ApproximateArrivalTimestamp__UnmarshalledRecord: js.UndefOr[Date] = js.undefined
  /**
    * <p>The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
    */
  @JSName("Data")
  var Data__UnmarshalledRecord: Uint8Array
}

object _UnmarshalledRecord {
  @scala.inline
  def apply(
    Data: Uint8Array,
    PartitionKey: String,
    SequenceNumber: String,
    ApproximateArrivalTimestamp: Date = null,
    EncryptionType: NONE | KMS | String = null
  ): _UnmarshalledRecord = {
    val __obj = js.Dynamic.literal(Data = Data, PartitionKey = PartitionKey, SequenceNumber = SequenceNumber)
    if (ApproximateArrivalTimestamp != null) __obj.updateDynamic("ApproximateArrivalTimestamp")(ApproximateArrivalTimestamp)
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledRecord]
  }
}

