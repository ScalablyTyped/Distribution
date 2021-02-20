package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserPoolDomainRequest extends StObject {
  
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application. Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can exclude this parameter and use the Amazon Cognito hosted domain instead. For more information about the hosted domain and custom domains, see Configuring a User Pool Domain.
    */
  var CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.native
  
  /**
    * The domain string.
    */
  var Domain: DomainType = js.native
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object CreateUserPoolDomainRequest {
  
  @scala.inline
  def apply(Domain: DomainType, UserPoolId: UserPoolIdType): CreateUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolDomainRequest]
  }
  
  @scala.inline
  implicit class CreateUserPoolDomainRequestMutableBuilder[Self <: CreateUserPoolDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomDomainConfig(value: CustomDomainConfigType): Self = StObject.set(x, "CustomDomainConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDomainConfigUndefined: Self = StObject.set(x, "CustomDomainConfig", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
