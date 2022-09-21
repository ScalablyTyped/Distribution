package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountTakeoverRiskConfigurationType extends StObject {
  
  /**
    * Account takeover risk configuration actions.
    */
  var Actions: AccountTakeoverActionsType
  
  /**
    * The notify configuration used to construct email notifications.
    */
  var NotifyConfiguration: js.UndefOr[NotifyConfigurationType] = js.undefined
}
object AccountTakeoverRiskConfigurationType {
  
  inline def apply(Actions: AccountTakeoverActionsType): AccountTakeoverRiskConfigurationType = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTakeoverRiskConfigurationType]
  }
  
  extension [Self <: AccountTakeoverRiskConfigurationType](x: Self) {
    
    inline def setActions(value: AccountTakeoverActionsType): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setNotifyConfiguration(value: NotifyConfigurationType): Self = StObject.set(x, "NotifyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNotifyConfigurationUndefined: Self = StObject.set(x, "NotifyConfiguration", js.undefined)
  }
}
