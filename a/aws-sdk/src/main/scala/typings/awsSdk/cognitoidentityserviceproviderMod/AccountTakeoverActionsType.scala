package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountTakeoverActionsType extends js.Object {
  
  /**
    * Action to take for a high risk.
    */
  var HighAction: js.UndefOr[AccountTakeoverActionType] = js.native
  
  /**
    * Action to take for a low risk.
    */
  var LowAction: js.UndefOr[AccountTakeoverActionType] = js.native
  
  /**
    * Action to take for a medium risk.
    */
  var MediumAction: js.UndefOr[AccountTakeoverActionType] = js.native
}
object AccountTakeoverActionsType {
  
  @scala.inline
  def apply(): AccountTakeoverActionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTakeoverActionsType]
  }
  
  @scala.inline
  implicit class AccountTakeoverActionsTypeOps[Self <: AccountTakeoverActionsType] (val x: Self) extends AnyVal {
    
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
    def setHighAction(value: AccountTakeoverActionType): Self = this.set("HighAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighAction: Self = this.set("HighAction", js.undefined)
    
    @scala.inline
    def setLowAction(value: AccountTakeoverActionType): Self = this.set("LowAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowAction: Self = this.set("LowAction", js.undefined)
    
    @scala.inline
    def setMediumAction(value: AccountTakeoverActionType): Self = this.set("MediumAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediumAction: Self = this.set("MediumAction", js.undefined)
  }
}
