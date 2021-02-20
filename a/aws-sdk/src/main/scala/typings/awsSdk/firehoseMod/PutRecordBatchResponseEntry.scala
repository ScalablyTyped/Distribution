package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRecordBatchResponseEntry extends StObject {
  
  /**
    * The error code for an individual record result.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.firehoseMod.ErrorCode] = js.native
  
  /**
    * The error message for an individual record result.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.firehoseMod.ErrorMessage] = js.native
  
  /**
    * The ID of the record.
    */
  var RecordId: js.UndefOr[PutResponseRecordId] = js.native
}
object PutRecordBatchResponseEntry {
  
  @scala.inline
  def apply(): PutRecordBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRecordBatchResponseEntry]
  }
  
  @scala.inline
  implicit class PutRecordBatchResponseEntryMutableBuilder[Self <: PutRecordBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setRecordId(value: PutResponseRecordId): Self = StObject.set(x, "RecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordIdUndefined: Self = StObject.set(x, "RecordId", js.undefined)
  }
}
