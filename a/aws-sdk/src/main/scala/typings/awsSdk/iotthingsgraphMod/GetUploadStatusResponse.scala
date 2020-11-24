package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUploadStatusResponse extends js.Object {
  
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
  implicit class GetUploadStatusResponseOps[Self <: GetUploadStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadId(value: UploadId): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadStatus(value: UploadStatus): Self = this.set("uploadStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonVarargs(value: String*): Self = this.set("failureReason", js.Array(value :_*))
    
    @scala.inline
    def setFailureReason(value: StringList): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setNamespaceArn(value: Arn): Self = this.set("namespaceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceArn: Self = this.set("namespaceArn", js.undefined)
    
    @scala.inline
    def setNamespaceName(value: NamespaceName): Self = this.set("namespaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceName: Self = this.set("namespaceName", js.undefined)
    
    @scala.inline
    def setNamespaceVersion(value: Version): Self = this.set("namespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceVersion: Self = this.set("namespaceVersion", js.undefined)
  }
}
