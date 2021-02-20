package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRecordBatchOutput extends StObject {
  
  /**
    * Indicates whether server-side encryption (SSE) was enabled during this operation.
    */
  var Encrypted: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The number of records that might have failed processing. This number might be greater than 0 even if the PutRecordBatch call succeeds. Check FailedPutCount to determine whether there are records that you need to resend.
    */
  var FailedPutCount: NonNegativeIntegerObject = js.native
  
  /**
    * The results array. For each record, the index of the response element is the same as the index used in the request array.
    */
  var RequestResponses: PutRecordBatchResponseEntryList = js.native
}
object PutRecordBatchOutput {
  
  @scala.inline
  def apply(FailedPutCount: NonNegativeIntegerObject, RequestResponses: PutRecordBatchResponseEntryList): PutRecordBatchOutput = {
    val __obj = js.Dynamic.literal(FailedPutCount = FailedPutCount.asInstanceOf[js.Any], RequestResponses = RequestResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordBatchOutput]
  }
  
  @scala.inline
  implicit class PutRecordBatchOutputMutableBuilder[Self <: PutRecordBatchOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncrypted(value: BooleanObject): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    @scala.inline
    def setFailedPutCount(value: NonNegativeIntegerObject): Self = StObject.set(x, "FailedPutCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestResponses(value: PutRecordBatchResponseEntryList): Self = StObject.set(x, "RequestResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestResponsesVarargs(value: PutRecordBatchResponseEntry*): Self = StObject.set(x, "RequestResponses", js.Array(value :_*))
  }
}
