package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskConfigurationType extends StObject {
  
  /**
    * The account takeover risk configuration object including the NotifyConfiguration object and Actions to take in the case of an account takeover.
    */
  var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined
  
  /**
    * The app client ID.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  
  /**
    * The compromised credentials risk configuration object including the EventFilter and the EventAction 
    */
  var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined
  
  /**
    * The last modified date.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The configuration to override the risk decision.
    */
  var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined
  
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}
object RiskConfigurationType {
  
  @scala.inline
  def apply(): RiskConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskConfigurationType]
  }
  
  @scala.inline
  implicit class RiskConfigurationTypeMutableBuilder[Self <: RiskConfigurationType] (val x: Self) extends AnyVal {
    
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
    def setLastModifiedDate(value: DateType): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setRiskExceptionConfiguration(value: RiskExceptionConfigurationType): Self = StObject.set(x, "RiskExceptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskExceptionConfigurationUndefined: Self = StObject.set(x, "RiskExceptionConfiguration", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
