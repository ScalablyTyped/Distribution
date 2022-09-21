package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountSettingsOutput extends StObject {
  
  /**
    * The Proton pipeline service role and repository data shared across the Amazon Web Services account.
    */
  var accountSettings: AccountSettings
}
object UpdateAccountSettingsOutput {
  
  inline def apply(accountSettings: AccountSettings): UpdateAccountSettingsOutput = {
    val __obj = js.Dynamic.literal(accountSettings = accountSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountSettingsOutput]
  }
  
  extension [Self <: UpdateAccountSettingsOutput](x: Self) {
    
    inline def setAccountSettings(value: AccountSettings): Self = StObject.set(x, "accountSettings", value.asInstanceOf[js.Any])
  }
}
