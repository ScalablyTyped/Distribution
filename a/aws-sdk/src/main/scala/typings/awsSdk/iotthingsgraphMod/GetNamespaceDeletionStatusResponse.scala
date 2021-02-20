package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNamespaceDeletionStatusResponse extends StObject {
  
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
  implicit class GetNamespaceDeletionStatusResponseMutableBuilder[Self <: GetNamespaceDeletionStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: NamespaceDeletionStatusErrorCodes): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setNamespaceArn(value: Arn): Self = StObject.set(x, "namespaceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceArnUndefined: Self = StObject.set(x, "namespaceArn", js.undefined)
    
    @scala.inline
    def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    @scala.inline
    def setStatus(value: NamespaceDeletionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
