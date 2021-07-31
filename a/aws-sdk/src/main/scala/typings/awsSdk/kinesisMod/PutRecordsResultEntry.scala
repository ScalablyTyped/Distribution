package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecordsResultEntry extends StObject {
  
  /**
    * The error code for an individual record result. ErrorCodes can be either ProvisionedThroughputExceededException or InternalFailure.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.kinesisMod.ErrorCode] = js.undefined
  
  /**
    * The error message for an individual record result. An ErrorCode value of ProvisionedThroughputExceededException has an error message that includes the account ID, stream name, and shard ID. An ErrorCode value of InternalFailure has the error message "Internal Service Failure".
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kinesisMod.ErrorMessage] = js.undefined
  
  /**
    * The sequence number for an individual record result.
    */
  var SequenceNumber: js.UndefOr[typings.awsSdk.kinesisMod.SequenceNumber] = js.undefined
  
  /**
    * The shard ID for an individual record result.
    */
  var ShardId: js.UndefOr[typings.awsSdk.kinesisMod.ShardId] = js.undefined
}
object PutRecordsResultEntry {
  
  @scala.inline
  def apply(): PutRecordsResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRecordsResultEntry]
  }
  
  @scala.inline
  implicit class PutRecordsResultEntryMutableBuilder[Self <: PutRecordsResultEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
    
    @scala.inline
    def setShardId(value: ShardId): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardIdUndefined: Self = StObject.set(x, "ShardId", js.undefined)
  }
}
