package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecordBatchResponseEntry extends StObject {
  
  /**
    * The error code for an individual record result.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.firehoseMod.ErrorCode] = js.undefined
  
  /**
    * The error message for an individual record result.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.firehoseMod.ErrorMessage] = js.undefined
  
  /**
    * The ID of the record.
    */
  var RecordId: js.UndefOr[PutResponseRecordId] = js.undefined
}
object PutRecordBatchResponseEntry {
  
  inline def apply(): PutRecordBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRecordBatchResponseEntry]
  }
  
  extension [Self <: PutRecordBatchResponseEntry](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setRecordId(value: PutResponseRecordId): Self = StObject.set(x, "RecordId", value.asInstanceOf[js.Any])
    
    inline def setRecordIdUndefined: Self = StObject.set(x, "RecordId", js.undefined)
  }
}
