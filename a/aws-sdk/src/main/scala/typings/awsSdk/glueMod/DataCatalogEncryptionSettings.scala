package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCatalogEncryptionSettings extends StObject {
  
  /**
    * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption.
    */
  var ConnectionPasswordEncryption: js.UndefOr[typings.awsSdk.glueMod.ConnectionPasswordEncryption] = js.native
  
  /**
    * Specifies the encryption-at-rest configuration for the Data Catalog.
    */
  var EncryptionAtRest: js.UndefOr[typings.awsSdk.glueMod.EncryptionAtRest] = js.native
}
object DataCatalogEncryptionSettings {
  
  @scala.inline
  def apply(): DataCatalogEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCatalogEncryptionSettings]
  }
  
  @scala.inline
  implicit class DataCatalogEncryptionSettingsMutableBuilder[Self <: DataCatalogEncryptionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionPasswordEncryption(value: ConnectionPasswordEncryption): Self = StObject.set(x, "ConnectionPasswordEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPasswordEncryptionUndefined: Self = StObject.set(x, "ConnectionPasswordEncryption", js.undefined)
    
    @scala.inline
    def setEncryptionAtRest(value: EncryptionAtRest): Self = StObject.set(x, "EncryptionAtRest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAtRestUndefined: Self = StObject.set(x, "EncryptionAtRest", js.undefined)
  }
}
