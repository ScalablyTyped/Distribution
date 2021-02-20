package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVaultNotificationsOutput extends StObject {
  
  /**
    * Returns the notification configuration set on the vault.
    */
  var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.native
}
object GetVaultNotificationsOutput {
  
  @scala.inline
  def apply(): GetVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVaultNotificationsOutput]
  }
  
  @scala.inline
  implicit class GetVaultNotificationsOutputMutableBuilder[Self <: GetVaultNotificationsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVaultNotificationConfig(value: VaultNotificationConfig): Self = StObject.set(x, "vaultNotificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultNotificationConfigUndefined: Self = StObject.set(x, "vaultNotificationConfig", js.undefined)
  }
}
