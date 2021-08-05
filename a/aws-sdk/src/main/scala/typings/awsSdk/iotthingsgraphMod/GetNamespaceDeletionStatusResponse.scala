package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNamespaceDeletionStatusResponse extends StObject {
  
  /**
    * An error code returned by the namespace deletion task.
    */
  var errorCode: js.UndefOr[NamespaceDeletionStatusErrorCodes] = js.undefined
  
  /**
    * An error code returned by the namespace deletion task.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the namespace that is being deleted.
    */
  var namespaceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the namespace that is being deleted.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
  
  /**
    * The status of the deletion request.
    */
  var status: js.UndefOr[NamespaceDeletionStatus] = js.undefined
}
object GetNamespaceDeletionStatusResponse {
  
  inline def apply(): GetNamespaceDeletionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNamespaceDeletionStatusResponse]
  }
  
  extension [Self <: GetNamespaceDeletionStatusResponse](x: Self) {
    
    inline def setErrorCode(value: NamespaceDeletionStatusErrorCodes): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setNamespaceArn(value: Arn): Self = StObject.set(x, "namespaceArn", value.asInstanceOf[js.Any])
    
    inline def setNamespaceArnUndefined: Self = StObject.set(x, "namespaceArn", js.undefined)
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setStatus(value: NamespaceDeletionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
