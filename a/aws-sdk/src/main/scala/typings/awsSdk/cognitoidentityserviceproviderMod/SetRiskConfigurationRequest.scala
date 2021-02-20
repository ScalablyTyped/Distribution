package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetRiskConfigurationRequest extends StObject {
  
  /**
    * The account takeover risk configuration.
    */
  var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.native
  
  /**
    * The app client ID. If ClientId is null, then the risk configuration is mapped to userPoolId. When the client ID is null, the same risk configuration is applied to all the clients in the userPool. Otherwise, ClientId is mapped to the client. When the client ID is not null, the user pool configuration is overridden and the risk configuration for the client is used instead.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  
  /**
    * The compromised credentials risk configuration.
    */
  var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.native
  
  /**
    * The configuration to override the risk decision.
    */
  var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.native
  
  /**
    * The user pool ID. 
    */
  var UserPoolId: UserPoolIdType = js.native
}
object SetRiskConfigurationRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): SetRiskConfigurationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRiskConfigurationRequest]
  }
  
  @scala.inline
  implicit class SetRiskConfigurationRequestMutableBuilder[Self <: SetRiskConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountTakeoverRiskConfiguration(value: AccountTakeoverRiskConfigurationType): Self = StObject.set(x, "AccountTakeoverRiskConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountTakeoverRiskConfigurationUndefined: Self = StObject.set(x, "AccountTakeoverRiskConfiguration", js.undefined)
    
    @scala.inline
    def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    @scala.inline
    def setCompromisedCredentialsRiskConfiguration(value: CompromisedCredentialsRiskConfigurationType): Self = StObject.set(x, "CompromisedCredentialsRiskConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompromisedCredentialsRiskConfigurationUndefined: Self = StObject.set(x, "CompromisedCredentialsRiskConfiguration", js.undefined)
    
    @scala.inline
    def setRiskExceptionConfiguration(value: RiskExceptionConfigurationType): Self = StObject.set(x, "RiskExceptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskExceptionConfigurationUndefined: Self = StObject.set(x, "RiskExceptionConfiguration", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
