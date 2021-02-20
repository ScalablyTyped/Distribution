package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOpenIDConnectProviderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM OpenID Connect provider resource object to delete. You can get a list of OpenID Connect provider resource ARNs by using the ListOpenIDConnectProviders operation.
    */
  var OpenIDConnectProviderArn: arnType = js.native
}
object DeleteOpenIDConnectProviderRequest {
  
  @scala.inline
  def apply(OpenIDConnectProviderArn: arnType): DeleteOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOpenIDConnectProviderRequest]
  }
  
  @scala.inline
  implicit class DeleteOpenIDConnectProviderRequestMutableBuilder[Self <: DeleteOpenIDConnectProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenIDConnectProviderArn(value: arnType): Self = StObject.set(x, "OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
  }
}
