package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSAMLProviderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SAML provider to delete.
    */
  var SAMLProviderArn: arnType
}
object DeleteSAMLProviderRequest {
  
  @scala.inline
  def apply(SAMLProviderArn: arnType): DeleteSAMLProviderRequest = {
    val __obj = js.Dynamic.literal(SAMLProviderArn = SAMLProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSAMLProviderRequest]
  }
  
  @scala.inline
  implicit class DeleteSAMLProviderRequestMutableBuilder[Self <: DeleteSAMLProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSAMLProviderArn(value: arnType): Self = StObject.set(x, "SAMLProviderArn", value.asInstanceOf[js.Any])
  }
}
