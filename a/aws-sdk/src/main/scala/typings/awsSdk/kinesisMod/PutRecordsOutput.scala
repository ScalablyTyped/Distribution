package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRecordsOutput extends StObject {
  
  /**
    * The encryption type used on the records. This parameter can be one of the following values:    NONE: Do not encrypt the records.    KMS: Use server-side encryption on the records using a customer-managed AWS KMS key.  
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.kinesisMod.EncryptionType] = js.native
  
  /**
    * The number of unsuccessfully processed records in a PutRecords request.
    */
  var FailedRecordCount: js.UndefOr[PositiveIntegerObject] = js.native
  
  /**
    * An array of successfully and unsuccessfully processed record results, correlated with the request by natural ordering. A record that is successfully added to a stream includes SequenceNumber and ShardId in the result. A record that fails to be added to a stream includes ErrorCode and ErrorMessage in the result.
    */
  var Records: PutRecordsResultEntryList = js.native
}
object PutRecordsOutput {
  
  @scala.inline
  def apply(Records: PutRecordsResultEntryList): PutRecordsOutput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsOutput]
  }
  
  @scala.inline
  implicit class PutRecordsOutputMutableBuilder[Self <: PutRecordsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    @scala.inline
    def setFailedRecordCount(value: PositiveIntegerObject): Self = StObject.set(x, "FailedRecordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRecordCountUndefined: Self = StObject.set(x, "FailedRecordCount", js.undefined)
    
    @scala.inline
    def setRecords(value: PutRecordsResultEntryList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: PutRecordsResultEntry*): Self = StObject.set(x, "Records", js.Array(value :_*))
  }
}
