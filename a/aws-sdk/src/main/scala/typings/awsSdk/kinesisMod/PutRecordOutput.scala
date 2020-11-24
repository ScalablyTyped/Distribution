package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRecordOutput extends js.Object {
  
  /**
    * The encryption type to use on the record. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.  
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.kinesisMod.EncryptionType] = js.native
  
  /**
    * The sequence number identifier that was assigned to the put data record. The sequence number for the record is unique across all records in the stream. A sequence number is the identifier associated with every record put into the stream.
    */
  var SequenceNumber: typings.awsSdk.kinesisMod.SequenceNumber = js.native
  
  /**
    * The shard ID of the shard where the data record was placed.
    */
  var ShardId: typings.awsSdk.kinesisMod.ShardId = js.native
}
object PutRecordOutput {
  
  @scala.inline
  def apply(SequenceNumber: SequenceNumber, ShardId: ShardId): PutRecordOutput = {
    val __obj = js.Dynamic.literal(SequenceNumber = SequenceNumber.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
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
    def setSequenceNumber(value: SequenceNumber): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardId(value: ShardId): Self = this.set("ShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionType(value: EncryptionType): Self = this.set("EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionType: Self = this.set("EncryptionType", js.undefined)
  }
}
