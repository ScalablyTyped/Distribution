package typings.awsSdkClientKinesisBrowser.typesPutRecordsRequestEntryMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledPutRecordsRequestEntry extends PutRecordsRequestEntry {
  /**
    * <p>The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
    */
  @JSName("Data")
  var Data_UnmarshalledPutRecordsRequestEntry: Uint8Array
}

object UnmarshalledPutRecordsRequestEntry {
  @scala.inline
  def apply(Data: Uint8Array, PartitionKey: String, ExplicitHashKey: String = null): UnmarshalledPutRecordsRequestEntry = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any])
    if (ExplicitHashKey != null) __obj.updateDynamic("ExplicitHashKey")(ExplicitHashKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledPutRecordsRequestEntry]
  }
}

