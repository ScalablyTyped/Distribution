package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNamespaceResponse extends StObject {
  
  /**
    * The deleted namespace object.
    */
  var namespace: Namespace
}
object DeleteNamespaceResponse {
  
  inline def apply(namespace: Namespace): DeleteNamespaceResponse = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNamespaceResponse]
  }
  
  extension [Self <: DeleteNamespaceResponse](x: Self) {
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
