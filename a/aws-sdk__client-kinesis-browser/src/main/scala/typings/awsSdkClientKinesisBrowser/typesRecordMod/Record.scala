package typings.awsSdkClientKinesisBrowser.typesRecordMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Record extends js.Object {
  
  /**
    * <p>The approximate time that the record was inserted into the stream.</p>
    */
  var ApproximateArrivalTimestamp: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
    */
  var Data: ArrayBuffer | ArrayBufferView | String = js.native
  
  /**
    * <p>The encryption type used on the record. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records in the stream.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.</p> </li> </ul>
    */
  var EncryptionType: js.UndefOr[NONE | KMS | String] = js.native
  
  /**
    * <p>Identifies which shard in the stream the data record is assigned to.</p>
    */
  var PartitionKey: String = js.native
  
  /**
    * <p>The unique identifier of the record within its shard.</p>
    */
  var SequenceNumber: String = js.native
}
object Record {
  
  @scala.inline
  def apply(Data: ArrayBuffer | ArrayBufferView | String, PartitionKey: String, SequenceNumber: String): Record = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
  
  @scala.inline
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
    
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
    def setData(value: ArrayBuffer | ArrayBufferView | String): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionKey(value: String): Self = this.set("PartitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproximateArrivalTimestamp(value: Date | String | Double): Self = this.set("ApproximateArrivalTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproximateArrivalTimestamp: Self = this.set("ApproximateArrivalTimestamp", js.undefined)
    
    @scala.inline
    def setEncryptionType(value: NONE | KMS | String): Self = this.set("EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionType: Self = this.set("EncryptionType", js.undefined)
  }
}
