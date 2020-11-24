package typings.awsSdkClientKinesisBrowser.typesRecordMod

import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledRecord extends Record {
  
  /**
    * <p>The approximate time that the record was inserted into the stream.</p>
    */
  @JSName("ApproximateArrivalTimestamp")
  var ApproximateArrivalTimestamp_UnmarshalledRecord: js.UndefOr[Date] = js.native
  
  /**
    * <p>The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
    */
  @JSName("Data")
  var Data_UnmarshalledRecord: Uint8Array = js.native
}
object UnmarshalledRecord {
  
  @scala.inline
  def apply(Data: Uint8Array, PartitionKey: String, SequenceNumber: String): UnmarshalledRecord = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRecord]
  }
  
  @scala.inline
  implicit class UnmarshalledRecordOps[Self <: UnmarshalledRecord] (val x: Self) extends AnyVal {
    
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
    def setData(value: Uint8Array): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproximateArrivalTimestamp(value: Date): Self = this.set("ApproximateArrivalTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproximateArrivalTimestamp: Self = this.set("ApproximateArrivalTimestamp", js.undefined)
  }
}
