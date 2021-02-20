package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesPutRecordsResultEntryMod.UnmarshalledPutRecordsResultEntry
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutRecordsOutputMod {
  
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
    implicit class PutRecordsOutputMutableBuilder[Self <: PutRecordsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionType(value: NONE | KMS | String): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
      
      @scala.inline
      def setFailedRecordCount(value: Double): Self = StObject.set(x, "FailedRecordCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedRecordCountUndefined: Self = StObject.set(x, "FailedRecordCount", js.undefined)
      
      @scala.inline
      def setRecords(value: js.Array[UnmarshalledPutRecordsResultEntry]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: UnmarshalledPutRecordsResultEntry*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
}
