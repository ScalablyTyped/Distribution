package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RiskConfigurationType extends js.Object {
  
  /**
    * The account takeover risk configuration object including the NotifyConfiguration object and Actions to take in the case of an account takeover.
    */
  var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.native
  
  /**
    * The app client ID.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  
  /**
    * The compromised credentials risk configuration object including the EventFilter and the EventAction 
    */
  var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.native
  
  /**
    * The last modified date.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  
  /**
    * The configuration to override the risk decision.
    */
  var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.native
  
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}
object RiskConfigurationType {
  
  @scala.inline
  def apply(): RiskConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskConfigurationType]
  }
  
  @scala.inline
  implicit class RiskConfigurationTypeOps[Self <: RiskConfigurationType] (val x: Self) extends AnyVal {
    
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
    def setLastModifiedDate(value: DateType): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setRiskExceptionConfiguration(value: RiskExceptionConfigurationType): Self = this.set("RiskExceptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskExceptionConfiguration: Self = this.set("RiskExceptionConfiguration", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolId: Self = this.set("UserPoolId", js.undefined)
  }
}
