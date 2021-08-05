package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVaultNotificationsOutput extends StObject {
  
  /**
    * Returns the notification configuration set on the vault.
    */
  var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
}
object GetVaultNotificationsOutput {
  
  inline def apply(): GetVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVaultNotificationsOutput]
  }
  
  extension [Self <: GetVaultNotificationsOutput](x: Self) {
    
    inline def setVaultNotificationConfig(value: VaultNotificationConfig): Self = StObject.set(x, "vaultNotificationConfig", value.asInstanceOf[js.Any])
    
    inline def setVaultNotificationConfigUndefined: Self = StObject.set(x, "vaultNotificationConfig", js.undefined)
  }
}
