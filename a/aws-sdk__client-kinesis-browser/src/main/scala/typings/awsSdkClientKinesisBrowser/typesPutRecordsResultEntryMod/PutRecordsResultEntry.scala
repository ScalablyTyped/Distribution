package typings.awsSdkClientKinesisBrowser.typesPutRecordsResultEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRecordsResultEntry extends js.Object {
  
  /**
    * <p>The error code for an individual record result. <code>ErrorCodes</code> can be either <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>.</p>
    */
  var ErrorCode: js.UndefOr[String] = js.native
  
  /**
    * <p>The error message for an individual record result. An <code>ErrorCode</code> value of <code>ProvisionedThroughputExceededException</code> has an error message that includes the account ID, stream name, and shard ID. An <code>ErrorCode</code> value of <code>InternalFailure</code> has the error message <code>"Internal Service Failure"</code>.</p>
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * <p>The sequence number for an individual record result.</p>
    */
  var SequenceNumber: js.UndefOr[String] = js.native
  
  /**
    * <p>The shard ID for an individual record result.</p>
    */
  var ShardId: js.UndefOr[String] = js.native
}
object PutRecordsResultEntry {
  
  @scala.inline
  def apply(): PutRecordsResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRecordsResultEntry]
  }
  
  @scala.inline
  implicit class PutRecordsResultEntryOps[Self <: PutRecordsResultEntry] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceNumber: Self = this.set("SequenceNumber", js.undefined)
    
    @scala.inline
    def setShardId(value: String): Self = this.set("ShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardId: Self = this.set("ShardId", js.undefined)
  }
}
