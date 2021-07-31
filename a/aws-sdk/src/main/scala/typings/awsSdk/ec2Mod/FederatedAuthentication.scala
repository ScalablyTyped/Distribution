package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FederatedAuthentication extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
    */
  var SamlProviderArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
    */
  var SelfServiceSamlProviderArn: js.UndefOr[String] = js.undefined
}
object FederatedAuthentication {
  
  @scala.inline
  def apply(): FederatedAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedAuthentication]
  }
  
  @scala.inline
  implicit class FederatedAuthenticationMutableBuilder[Self <: FederatedAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSamlProviderArn(value: String): Self = StObject.set(x, "SamlProviderArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamlProviderArnUndefined: Self = StObject.set(x, "SamlProviderArn", js.undefined)
    
    @scala.inline
    def setSelfServiceSamlProviderArn(value: String): Self = StObject.set(x, "SelfServiceSamlProviderArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfServiceSamlProviderArnUndefined: Self = StObject.set(x, "SelfServiceSamlProviderArn", js.undefined)
  }
}
