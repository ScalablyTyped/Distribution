package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNamespaceResponse extends StObject {
  
  /**
    * The ARN of the namespace to be deleted.
    */
  var namespaceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the namespace to be deleted.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
}
object DeleteNamespaceResponse {
  
  inline def apply(): DeleteNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNamespaceResponse]
  }
  
  extension [Self <: DeleteNamespaceResponse](x: Self) {
    
    inline def setNamespaceArn(value: Arn): Self = StObject.set(x, "namespaceArn", value.asInstanceOf[js.Any])
    
    inline def setNamespaceArnUndefined: Self = StObject.set(x, "namespaceArn", js.undefined)
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
  }
}
