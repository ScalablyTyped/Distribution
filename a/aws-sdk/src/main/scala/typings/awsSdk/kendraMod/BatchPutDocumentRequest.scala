package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutDocumentRequest extends StObject {
  
  /**
    * One or more documents to add to the index.  Documents have the following file size limits.   5 MB total size for inline documents   50 MB total size for files from an S3 bucket   5 MB extracted text for any file   For more information about file size and transaction per second quotas, see Quotas.
    */
  var Documents: DocumentList
  
  /**
    * The identifier of the index to add the documents to. You need to create the index first using the CreateIndex operation.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
  
  /**
    * The Amazon Resource Name (ARN) of a role that is allowed to run the BatchPutDocument operation. For more information, see IAM Roles for Amazon Kendra.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.undefined
}
object BatchPutDocumentRequest {
  
  inline def apply(Documents: DocumentList, IndexId: IndexId): BatchPutDocumentRequest = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutDocumentRequest]
  }
  
  extension [Self <: BatchPutDocumentRequest](x: Self) {
    
    inline def setDocuments(value: DocumentList): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsVarargs(value: Document*): Self = StObject.set(x, "Documents", js.Array(value :_*))
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
