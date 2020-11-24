package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetRiskConfigurationRequest extends js.Object {
  
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
  implicit class SetRiskConfigurationRequestOps[Self <: SetRiskConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountTakeoverRiskConfiguration(value: AccountTakeoverRiskConfigurationType): Self = this.set("AccountTakeoverRiskConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountTakeoverRiskConfiguration: Self = this.set("AccountTakeoverRiskConfiguration", js.undefined)
    
    @scala.inline
    def setClientId(value: ClientIdType): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
    
    @scala.inline
    def setCompromisedCredentialsRiskConfiguration(value: CompromisedCredentialsRiskConfigurationType): Self = this.set("CompromisedCredentialsRiskConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompromisedCredentialsRiskConfiguration: Self = this.set("CompromisedCredentialsRiskConfiguration", js.undefined)
    
    @scala.inline
    def setRiskExceptionConfiguration(value: RiskExceptionConfigurationType): Self = this.set("RiskExceptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskExceptionConfiguration: Self = this.set("RiskExceptionConfiguration", js.undefined)
  }
}
