package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpenIDConnectProviderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the OIDC provider resource object in IAM to get information for. You can get a list of OIDC provider resource ARNs by using the ListOpenIDConnectProviders operation. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var OpenIDConnectProviderArn: arnType
}
object GetOpenIDConnectProviderRequest {
  
  inline def apply(OpenIDConnectProviderArn: arnType): GetOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenIDConnectProviderRequest]
  }
  
  extension [Self <: GetOpenIDConnectProviderRequest](x: Self) {
    
    inline def setOpenIDConnectProviderArn(value: arnType): Self = StObject.set(x, "OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
  }
}
