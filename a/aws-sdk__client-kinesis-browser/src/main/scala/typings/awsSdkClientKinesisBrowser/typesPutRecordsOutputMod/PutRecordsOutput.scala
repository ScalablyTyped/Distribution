package typings.awsSdkClientKinesisBrowser.typesPutRecordsOutputMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesPutRecordsResultEntryMod.UnmarshalledPutRecordsResultEntry
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRecordsOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>The encryption type used on the records. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.</p> </li> </ul>
    */
  var EncryptionType: js.UndefOr[NONE | KMS | String] = js.native
  
  /**
    * <p>The number of unsuccessfully processed records in a <code>PutRecords</code> request.</p>
    */
  var FailedRecordCount: js.UndefOr[Double] = js.native
  
  /**
    * <p>An array of successfully and unsuccessfully processed record results, correlated with the request by natural ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.</p>
    */
  var Records: js.Array[UnmarshalledPutRecordsResultEntry] = js.native
}
object PutRecordsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, Records: js.Array[UnmarshalledPutRecordsResultEntry]): PutRecordsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsOutput]
  }
  
  @scala.inline
  implicit class PutRecordsOutputOps[Self <: PutRecordsOutput] (val x: Self) extends AnyVal {
    
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: UnmarshalledPutRecordsResultEntry*): Self = this.set("Records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: js.Array[UnmarshalledPutRecordsResultEntry]): Self = this.set("Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionType(value: NONE | KMS | String): Self = this.set("EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionType: Self = this.set("EncryptionType", js.undefined)
    
    @scala.inline
    def setFailedRecordCount(value: Double): Self = this.set("FailedRecordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedRecordCount: Self = this.set("FailedRecordCount", js.undefined)
  }
}
