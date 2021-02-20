package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOpenIDConnectProviderThumbprintRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the thumbprint. You can get a list of OIDC provider ARNs by using the ListOpenIDConnectProviders operation. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var OpenIDConnectProviderArn: arnType = js.native
  
  /**
    * A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For more information, see CreateOpenIDConnectProvider. 
    */
  var ThumbprintList: thumbprintListType = js.native
}
object UpdateOpenIDConnectProviderThumbprintRequest {
  
  @scala.inline
  def apply(OpenIDConnectProviderArn: arnType, ThumbprintList: thumbprintListType): UpdateOpenIDConnectProviderThumbprintRequest = {
    val __obj = js.Dynamic.literal(OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any], ThumbprintList = ThumbprintList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOpenIDConnectProviderThumbprintRequest]
  }
  
  @scala.inline
  implicit class UpdateOpenIDConnectProviderThumbprintRequestMutableBuilder[Self <: UpdateOpenIDConnectProviderThumbprintRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenIDConnectProviderArn(value: arnType): Self = StObject.set(x, "OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbprintList(value: thumbprintListType): Self = StObject.set(x, "ThumbprintList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbprintListVarargs(value: thumbprintType*): Self = StObject.set(x, "ThumbprintList", js.Array(value :_*))
  }
}
