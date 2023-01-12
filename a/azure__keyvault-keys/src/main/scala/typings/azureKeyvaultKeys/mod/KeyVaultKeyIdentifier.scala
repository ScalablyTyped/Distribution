package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyVaultKeyIdentifier extends StObject {
  
  /**
    * The name of the Key Vault Key.
    */
  var name: String
  
  /**
    * The complete representation of the Key Vault Key Id. For example:
    *
    *   https://<keyvault-name>.vault.azure.net/keys/<key-name>/<unique-version-id>
    *
    */
  var sourceId: String
  
  /**
    * The URL of the Azure Key Vault instance to which the Key belongs.
    */
  var vaultUrl: String
  
  /**
    * The version of Key Vault Key. Might be undefined.
    */
  var version: js.UndefOr[String] = js.undefined
}
object KeyVaultKeyIdentifier {
  
  inline def apply(name: String, sourceId: String, vaultUrl: String): KeyVaultKeyIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], vaultUrl = vaultUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyVaultKeyIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyVaultKeyIdentifier] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setVaultUrl(value: String): Self = StObject.set(x, "vaultUrl", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
