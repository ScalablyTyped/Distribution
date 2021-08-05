package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUploadStatusResponse extends StObject {
  
  /**
    * The date at which the upload was created.
    */
  var createdDate: Timestamp
  
  /**
    * The reason for an upload failure.
    */
  var failureReason: js.UndefOr[StringList] = js.undefined
  
  /**
    * The ARN of the upload.
    */
  var namespaceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the upload's namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
  
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The ID of the upload.
    */
  var uploadId: UploadId
  
  /**
    * The status of the upload. The initial status is IN_PROGRESS. The response show all validation failures if the upload fails.
    */
  var uploadStatus: UploadStatus
}
object GetUploadStatusResponse {
  
  inline def apply(createdDate: Timestamp, uploadId: UploadId, uploadStatus: UploadStatus): GetUploadStatusResponse = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], uploadStatus = uploadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUploadStatusResponse]
  }
  
  extension [Self <: GetUploadStatusResponse](x: Self) {
    
    inline def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: StringList): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setFailureReasonVarargs(value: String*): Self = StObject.set(x, "failureReason", js.Array(value :_*))
    
    inline def setNamespaceArn(value: Arn): Self = StObject.set(x, "namespaceArn", value.asInstanceOf[js.Any])
    
    inline def setNamespaceArnUndefined: Self = StObject.set(x, "namespaceArn", js.undefined)
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setNamespaceVersion(value: Version): Self = StObject.set(x, "namespaceVersion", value.asInstanceOf[js.Any])
    
    inline def setNamespaceVersionUndefined: Self = StObject.set(x, "namespaceVersion", js.undefined)
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    inline def setUploadStatus(value: UploadStatus): Self = StObject.set(x, "uploadStatus", value.asInstanceOf[js.Any])
  }
}
