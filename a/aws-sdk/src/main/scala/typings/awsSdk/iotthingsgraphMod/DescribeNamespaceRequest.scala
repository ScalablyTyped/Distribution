package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNamespaceRequest extends StObject {
  
  /**
    * The name of the user's namespace. Set this to aws to get the public namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
}
object DescribeNamespaceRequest {
  
  inline def apply(): DescribeNamespaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNamespaceRequest]
  }
  
  extension [Self <: DescribeNamespaceRequest](x: Self) {
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
  }
}
