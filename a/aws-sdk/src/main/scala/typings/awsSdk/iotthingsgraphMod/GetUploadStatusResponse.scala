package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUploadStatusResponse extends StObject {
  
  /**
    * The date at which the upload was created.
    */
  var createdDate: Timestamp = js.native
  
  /**
    * The reason for an upload failure.
    */
  var failureReason: js.UndefOr[StringList] = js.native
  
  /**
    * The ARN of the upload.
    */
  var namespaceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the upload's namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.native
  
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.native
  
  /**
    * The ID of the upload.
    */
  var uploadId: UploadId = js.native
  
  /**
    * The status of the upload. The initial status is IN_PROGRESS. The response show all validation failures if the upload fails.
    */
  var uploadStatus: UploadStatus = js.native
}
object GetUploadStatusResponse {
  
  @scala.inline
  def apply(createdDate: Timestamp, uploadId: UploadId, uploadStatus: UploadStatus): GetUploadStatusResponse = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], uploadStatus = uploadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUploadStatusResponse]
  }
  
  @scala.inline
  implicit class GetUploadStatusResponseMutableBuilder[Self <: GetUploadStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReason(value: StringList): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setFailureReasonVarargs(value: String*): Self = StObject.set(x, "failureReason", js.Array(value :_*))
    
    @scala.inline
    def setNamespaceArn(value: Arn): Self = StObject.set(x, "namespaceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceArnUndefined: Self = StObject.set(x, "namespaceArn", js.undefined)
    
    @scala.inline
    def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    @scala.inline
    def setNamespaceVersion(value: Version): Self = StObject.set(x, "namespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceVersionUndefined: Self = StObject.set(x, "namespaceVersion", js.undefined)
    
    @scala.inline
    def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadStatus(value: UploadStatus): Self = StObject.set(x, "uploadStatus", value.asInstanceOf[js.Any])
  }
}
