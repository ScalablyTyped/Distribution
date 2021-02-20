package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountTakeoverActionsType extends StObject {
  
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
  implicit class AccountTakeoverActionsTypeMutableBuilder[Self <: AccountTakeoverActionsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighAction(value: AccountTakeoverActionType): Self = StObject.set(x, "HighAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighActionUndefined: Self = StObject.set(x, "HighAction", js.undefined)
    
    @scala.inline
    def setLowAction(value: AccountTakeoverActionType): Self = StObject.set(x, "LowAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowActionUndefined: Self = StObject.set(x, "LowAction", js.undefined)
    
    @scala.inline
    def setMediumAction(value: AccountTakeoverActionType): Self = StObject.set(x, "MediumAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumActionUndefined: Self = StObject.set(x, "MediumAction", js.undefined)
  }
}
