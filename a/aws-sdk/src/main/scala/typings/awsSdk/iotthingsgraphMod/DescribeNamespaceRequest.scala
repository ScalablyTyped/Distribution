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
  
  @scala.inline
  def apply(): DescribeNamespaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNamespaceRequest]
  }
  
  @scala.inline
  implicit class DescribeNamespaceRequestMutableBuilder[Self <: DescribeNamespaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
  }
}
