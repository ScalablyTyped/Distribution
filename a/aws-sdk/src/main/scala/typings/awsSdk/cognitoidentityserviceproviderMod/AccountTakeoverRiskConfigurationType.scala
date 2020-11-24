package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountTakeoverRiskConfigurationType extends js.Object {
  
  /**
    * Account takeover risk configuration actions
    */
  var Actions: AccountTakeoverActionsType = js.native
  
  /**
    * The notify configuration used to construct email notifications.
    */
  var NotifyConfiguration: js.UndefOr[NotifyConfigurationType] = js.native
}
object AccountTakeoverRiskConfigurationType {
  
  @scala.inline
  def apply(Actions: AccountTakeoverActionsType): AccountTakeoverRiskConfigurationType = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTakeoverRiskConfigurationType]
  }
  
  @scala.inline
  implicit class AccountTakeoverRiskConfigurationTypeOps[Self <: AccountTakeoverRiskConfigurationType] (val x: Self) extends AnyVal {
    
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
    def setActions(value: AccountTakeoverActionsType): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyConfiguration(value: NotifyConfigurationType): Self = this.set("NotifyConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyConfiguration: Self = this.set("NotifyConfiguration", js.undefined)
  }
}
