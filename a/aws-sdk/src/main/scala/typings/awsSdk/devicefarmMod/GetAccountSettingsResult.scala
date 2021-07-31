package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountSettingsResult extends StObject {
  
  /**
    * The account settings.
    */
  var accountSettings: js.UndefOr[AccountSettings] = js.undefined
}
object GetAccountSettingsResult {
  
  @scala.inline
  def apply(): GetAccountSettingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsResult]
  }
  
  @scala.inline
  implicit class GetAccountSettingsResultMutableBuilder[Self <: GetAccountSettingsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountSettings(value: AccountSettings): Self = StObject.set(x, "accountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountSettingsUndefined: Self = StObject.set(x, "accountSettings", js.undefined)
  }
}
