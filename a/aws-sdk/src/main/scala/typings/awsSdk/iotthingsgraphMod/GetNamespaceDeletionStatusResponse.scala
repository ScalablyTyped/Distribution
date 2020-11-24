package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNamespaceDeletionStatusResponse extends js.Object {
  
  /**
    * An error code returned by the namespace deletion task.
    */
  var errorCode: js.UndefOr[NamespaceDeletionStatusErrorCodes] = js.native
  
  /**
    * An error code returned by the namespace deletion task.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the namespace that is being deleted.
    */
  var namespaceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the namespace that is being deleted.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.native
  
  /**
    * The status of the deletion request.
    */
  var status: js.UndefOr[NamespaceDeletionStatus] = js.native
}
object GetNamespaceDeletionStatusResponse {
  
  @scala.inline
  def apply(): GetNamespaceDeletionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNamespaceDeletionStatusResponse]
  }
  
  @scala.inline
  implicit class GetNamespaceDeletionStatusResponseOps[Self <: GetNamespaceDeletionStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: NamespaceDeletionStatusErrorCodes): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setNamespaceArn(value: Arn): Self = this.set("namespaceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceArn: Self = this.set("namespaceArn", js.undefined)
    
    @scala.inline
    def setNamespaceName(value: NamespaceName): Self = this.set("namespaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceName: Self = this.set("namespaceName", js.undefined)
    
    @scala.inline
    def setStatus(value: NamespaceDeletionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
