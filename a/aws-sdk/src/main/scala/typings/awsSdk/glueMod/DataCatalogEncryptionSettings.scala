package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCatalogEncryptionSettings extends js.Object {
  
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
  implicit class DataCatalogEncryptionSettingsOps[Self <: DataCatalogEncryptionSettings] (val x: Self) extends AnyVal {
    
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
    def setConnectionPasswordEncryption(value: ConnectionPasswordEncryption): Self = this.set("ConnectionPasswordEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionPasswordEncryption: Self = this.set("ConnectionPasswordEncryption", js.undefined)
    
    @scala.inline
    def setEncryptionAtRest(value: EncryptionAtRest): Self = this.set("EncryptionAtRest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionAtRest: Self = this.set("EncryptionAtRest", js.undefined)
  }
}
