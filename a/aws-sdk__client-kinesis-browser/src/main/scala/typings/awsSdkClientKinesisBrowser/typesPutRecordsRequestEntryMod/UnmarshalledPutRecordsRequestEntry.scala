package typings.awsSdkClientKinesisBrowser.typesPutRecordsRequestEntryMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledPutRecordsRequestEntry extends PutRecordsRequestEntry {
  
  /**
    * <p>The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
    */
  @JSName("Data")
  var Data_UnmarshalledPutRecordsRequestEntry: Uint8Array = js.native
}
object UnmarshalledPutRecordsRequestEntry {
  
  @scala.inline
  def apply(Data: Uint8Array, PartitionKey: String): UnmarshalledPutRecordsRequestEntry = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledPutRecordsRequestEntry]
  }
  
  @scala.inline
  implicit class UnmarshalledPutRecordsRequestEntryOps[Self <: UnmarshalledPutRecordsRequestEntry] (val x: Self) extends AnyVal {
    
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
  }
}
