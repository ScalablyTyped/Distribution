package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNamespacesResponse extends StObject {
  
  /**
    * The information about the namespaces in this AWS account. The response includes the namespace ARN, name, AWS Region, notification email address, creation status, and identity store.
    */
  var Namespaces: js.UndefOr[typings.awsSdk.quicksightMod.Namespaces] = js.native
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object ListNamespacesResponse {
  
  @scala.inline
  def apply(): ListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNamespacesResponse]
  }
  
  @scala.inline
  implicit class ListNamespacesResponseMutableBuilder[Self <: ListNamespacesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespaces(value: Namespaces): Self = StObject.set(x, "Namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespacesUndefined: Self = StObject.set(x, "Namespaces", js.undefined)
    
    @scala.inline
    def setNamespacesVarargs(value: NamespaceInfoV2*): Self = StObject.set(x, "Namespaces", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
